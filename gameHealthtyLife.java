import java.util.Random;
import java.util.Scanner;

public class gameHealthtyLife {
    final static int SIZE = 12;
    static char[][] map = new char[SIZE][SIZE];
    static int playerX = 7;
    static int playerY = 7;
    static int muscleMass = 0;
    static int weight = 55;
    static int sugar = 0;
    static int fat = 0;
    static int langkah = 0;

    public static void main(String[] args) {
        MapHandler.initializeMap();
        MapHandler.printMap();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======================= Value of Each Icon =======================");
            System.out.println("Icon R = Run; muscle mass +1, weight -1, sugar +0, fat +0");
            System.out.println("Icon S = Sport; muscle mass +2, weight -1, sugar +0, fat -1");
            System.out.println("Icon V = Vegetable and fruit; muscle mass +0, weight +0, sugar -1, fat -1");
            System.out.println("Icon D = Sweet drink; muscle mass +0, weight +2, sugar +2, fat +0");
            System.out.println("Icon F = Fast food; muscle mass +0, weight +0, sugar +3, fat +2");
            System.out.println("Enter direction (W/A/S/D): ");
            
            char direction = scanner.next().charAt(0);

            PlayerHandler.movePlayer(direction);
            IconHandler.checkIcon();
            IconHandler.checkStatus();
            MapHandler.printMap();

            if (sugar > 5) {
                System.out.println("You have diabetes!! Your sugar levels are too high! Let's live healthy from now, dear ♥");
                break;
            } else if (fat > 5) {
                System.out.println("You have high cholesterol!! Your fat levels are too high! Let's live healthy from now, dear ♥");
                break;
            } else if (weight > 60) {
                System.out.println("You have obesity!! Your weight is too high! Let's live healthy from now, dear ♥");
                break;
            } else if (weight <= 50 && muscleMass == 10) {
                System.out.println("YOU WIN! You have maintained a healthy diet and lifestyle!");
                break;
            }
        }
        scanner.close();
    }

    static class MapHandler {
        static void initializeMap() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = '.';
                }
            }

            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                int iconX = random.nextInt(SIZE);
                int iconY = random.nextInt(SIZE);
                char icon = getRandomIcon();
                map[iconY][iconX] = icon;
            }
        }

        static void printMap() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (i == playerY && j == playerX) {
                        System.out.print('&' + " ");
                    } else {
                        System.out.print(map[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }

        static void munculDitempatRandom(){
            Random random = new Random();
            int iconX = random.nextInt(SIZE);
            int iconY = random.nextInt(SIZE);
            char icon = getRandomIcon();
            map[iconY][iconX] = icon;
        }

        static char getRandomIcon() {
            char[] icons = {'S', 'R', 'V', 'D', 'F'};
            Random random = new Random();
            return icons[random.nextInt(icons.length)];
        }
    }

    static class PlayerHandler {
        static void movePlayer(char direction) {
            switch (direction) {
                case 'W':
                    if (playerY > 0) {
                        playerY--;
                    }
                    break;
                case 'A':
                    if (playerX > 0) {
                        playerX--;
                    }
                    break;
                case 'S':
                    if (playerY < SIZE - 1) {
                        playerY++;
                    }
                    break;
                case 'D':
                    if (playerX < SIZE - 1) {
                        playerX++;
                    }
                    break;
            }

            langkah++;
            if (langkah % 3 == 0) {
                MapHandler.munculDitempatRandom();
            }
        }
    }

    static class IconHandler {
        static void checkIcon() {
            char icon = map[playerY][playerX];
            switch (icon) {
                case 'S':
                    muscleMass += 2;
                    weight -= 1;
                    fat -= 1;
                    break;
                case 'R':
                    muscleMass += 1;
                    weight -= 1;
                    break;
                case 'V':
                    fat -= 1;
                    sugar -= 1;
                    break;
                case 'D':
                    weight += 2;
                    sugar += 2;
                    break;
                case 'F':
                    fat += 3;
                    sugar += 2;
                    break;
            }
            map[playerY][playerX] = '.';
        }

        static void checkStatus() {
            if (sugar > 5 || fat > 5 || weight > 60) {
                return;
            }
            System.out.println("Status:");
            System.out.println("Muscle Mass: " + muscleMass);
            System.out.println("Weight: " + weight);
            System.out.println("Sugar: " + sugar);
            System.out.println("Fat: " + fat);
        }
    }
}
