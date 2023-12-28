# Game "Healty Life"
## 1. Latar Belakang
  <p> Saya membuat game ini karena di era globalisasi dan jaman yang serba cepat membuat informasi, kecanggihan teknologi kian melesai segingga membuat kita malas untuk melalukan kegiatan sehat dan malas memilih makanan sehat dikarenakan kecanggihan teknologi dan tren tren makanan yang terus berkeliaran. Ini membuat saya berkeinginan memciptakan game gaya hidup sehat sederhana untuk mengingatkan kepada orang orang bahaya jika kita tidak memperhatikan gaya hidup dan pola makan, dalam game ini sayaa akan memberitahukan secara singkat sebab akibat dari perilaku makan dan pola hdup yang tidak teratur. 
</p>
 
## 2. Deksripsi
 Game "Healty Life""  bercerita tentang sesorang yang menntukan pola hidupnya melalui kegiatan dan pola makan yang dia lakukan. Dari pola itulah bisa sihasilkan suatu kesimpulan jika dia terlalu bayak makan dan minum yang kurang sehat bisa menyebabkan penyait, penyakit kolesterol jika lemak berlebihan, penyakit diabetes jika kadar gula berlebihan dan maslaah obesitas jika berat badan sudah berlebihan. Tetapi jika diimbangi dengan memakan makanan sehat dan berkegiatan sehat pasti pemain akan memenangkan game ini dimna tujuannya adalah hidup sehat. Berati memenangkan game ini player telat mengikuti hidup sehat.

Dalam game ini untuk melakukan kegiatan kegiatan tersebut plyer harus bergerak dan mengambil icon sesuai yang dibutuhkan untuk menambahkan dan mengurangi status  berat bada, massa otot, kadar gula  serta lemak. sehingga ketika status kesehatan mencapai targer game pun berakhir.

## 3. Branding
### A. Nama/Merk Game :
Healty Life
### B. Deskripsi Target User :
- Usia 10 tahun ke atas
- game ini ringan jadi diperuntukan untuk orang yang mencari hiburan
### C. Genre :
- slice of life, simulation,

## 4. User Story dan struktur data
### user story
sebagai | saya ingin bisa | sehingga | prioritas
---|---|---|---
player | bergerak | menelurusuri peta| ⭐⭐⭐⭐⭐
player | mengambil icon | mengubah status kesehatan | ⭐⭐⭐⭐⭐

### struktur data
![image](https://github.com/ratuqurratul33/23-pdp-tugas-akhir-game/assets/145249741/97ca8874-b0ab-48b7-a755-dce2094d08a7)



## 5. Desain User Interface
![image](https://github.com/ratuqurratul33/23-pdp-tugas-akhir-game/assets/145249741/c0e08808-97e0-445f-9b58-c6a20cc8c82d)
![image](https://github.com/ratuqurratul33/23-pdp-tugas-akhir-game/assets/145249741/7af524a7-5a06-4638-abb3-70aa99944d33)
![image](https://github.com/ratuqurratul33/23-pdp-tugas-akhir-game/assets/145249741/8f9bbbd6-6652-4d1c-91ee-43748cf22e98)



## 6. Flowchart dari Algoritma
![image](https://github.com/ratuqurratul33/23-pdp-tugas-akhir-game/assets/145249741/8a8ace61-5404-44ee-8d9a-ab3e285f8e1d)



## 7. Link demo game di youtube

[In Progress]

## 8. Link folder kode pemrograman dari game

(https://github.com/ratuqurratul33/23-pdp-tugas-akhir-game/blob/main/healtyLife.java)

## 9. Game menerapkan prinsip-prinsip dasar pemrograman seperti

   - Variable 
   - Data Type
   - Operator
   - Boolean
   - Conditions: if, else & switch
   - Looping: while & for
   - Array
   - Method
   - Class

# 2. Bagaimana konsep variable, data type dan operator pada bahasa pemrograman digunakan dalam pembuatan game ini ?
 ada atribut dengan tipe data dan variable berikut:
-char [][]map 
-int playerX 
-int playerY 
-int muscleMass 
-int weight
-static int sugar 
-int fat
-int langkah 

operator disini saya gunakan dalam pengkondisian untuk menghitung status pemain ketika mengambil icon (setiap icon memiliki nilai)

# 3. Bagaimana konsep boolean dan conditions pada bahasa pemrograman digunakan dalam pembuatan game ini ?
konsep boolean yang saya gunakan disini untuk memampilkan keterangan nilai nilai icon, jadi jika true nilai icon akan tampil dibawah peta 
( memakai while=true)

konsep kondisi, kondisi dipakai untuk menentukan akhir gamee, sitem game ini jika pemain menggambil karakter samapi status memasuki batas tertentu makan akan ditentukan hasilnya.
Jika statusweight <= 50 && muscleMass == 10  maka permainan berakhir menang karna sehat 
jika status  sugar > 5 maka permainan berakhir dan kalah juga mempunyai diabtes
jika status  fat > 5 maka permainan berakhir dan kalah juga mempunyai cholesterol
jika status  weight > 60 maka permainan berakhir dan kalah juga mempunyai obesitas
(  memakai if else)

# 4. Bagaimana konsep looping dan array pada bahasa pemrograman digunakan dalam pembuatan game ini ?
konsep looping, digunakan unutuk penginisialisasi peta, pergerakan pemain serta pengecekan status.
-dalam method initializeMap = untuk mengulang karakter "." pada tiap sel map dan menepatkan tiga icon acak antar S R V D dan F
-dalam method printMap =  mencetak peta dalam bentuk matriks dengan karakter '&' sebagai posisi pemain dan karakter lain sesuai dengan lokasi ikon.
(memakai for )

konsep array, menggunakan array 2 dimensi
-digunakan untuk map dbuat melalui penggunaan array, ukuran map sudah dideklarasi di properti dan dicetak menngunakan method yg bernama initializeMap ' size x size' dan menyimpan karakter tertentu disetiap kordinat peta ( menggunakan aray 2 dimensi)
-digunakann untuk icons, array untuk menyimpan icons bernilai ( S, R, V, D ,F) dan diacak serta dimungculkan melalui mehod getRandomIcon()
(memakai [][])


# 5. Bagaimana konsep method pada bahasa pemrograman digunakan dalam pembuatan game ini ?
ada banyakmethod dalam class healty LIfe dengan penggunaan yang berbeda beda
1. method utama yaitu method main = untuk menjalankan permainan karna isinya memnanggil method initializeMap(), dan printMap()
jadi fungsi mehod ini sebagai inti program dan menjalankan permainannya dengan meanggil method lain untuk menjalakan logika permainanan ( while) dan menampilkan informasi ke pemain (tampilan).
 
 2. method untuk menginisialisasi map yaitu method  initializeMap() = memakai tipe data void karna tidk mengembalikan nilai. for untu mengisi peta dengan '.'  dan for selanjutnya mengisi karatetr . lalu terdapat juga penempatan ikon acak melalui method getRandomacak dan juga menggunakan kelas Random yang sudah diimpor di pustaka.
jadi fungsi ini sebagai persiapan awal untuk mengatur map dan menmpatkan icon acak

3. method untuk memunculkan icon random yaitu method getRandomIcon()= menggunakan tipe char sehingga mereturn karkter icon secara acak, kenapa acak karna menanggil kelas random dari impor pustaka.
jadi fungsi ini berfungsi untuk menghasilkan karakter icon secara acak dari aray icon untuk digunakan dalam menentukan ikon ikn yg muncul di permainan/ peta.

 4. method untuk mencetak peta dalam bentuk matrix  yaitu method printMap() = 
jadi fungsi ini memvisualkan peta dan menampilkan posisi user dan menggantikan icon yang sudah diambil menjadi bentuk '.' kembali

5. method untuk memunculkan icon random di kordinat yaitu method munculDitempatRandom() = menggunakan void jadi tidak mengmbalikan nilai appun juga menggunakan objek random sehingga pada kordinay Y dan X icom bisa muncul acak.
jadi fungsi ini menambhakan ikon tambahan ketika pemain mulai jadi akan terus ada icon.
 
 6. method untuk arah karakter yaitu method movePlayer() = memakai kondisi if untuk bergerak ke atas ( W)  Ke bawah (S) ke kanan (A) dan ke kri (D) juga ada peintah setiap melangkah 3x otomatis muncul random icom melalai pemanggilan mehod munculDitempatRandom
jadi fungsi ini untuk arah bergerak dan otomatis munculin icon acak setiapp 3langkah

7. method untuk chek icon dan menambhkan dalam statsus kesehatan pemain yaitu method checkIcon() = disini memakai logika matematik dan operation jika icon S(sport)  terambil maka muscleMass + 2; weight - 1; fat - 1; ,  jika iconR(run)  terambil maka muscleMass + 1; weight - 1; ,jika iconV(vegetable)  terambil maka  fat - 1; sugar-1 , jika icon D (sweet Drink)   terambil maka  weight +2; sugar +2 dan jika icon F(fastfood)  terambil maka fat +3; sugar +2
jadi fungsi ini merupakan logic matematik untuk menambhkan nilai pada status pemain jika icon terambil sesuai keterangan tiap icon 
 
 8. method untuk memeriksa kesehatan yaitu method checkStatus()= dalam method ini terdapa s.o.pln dimanauntuk menmpilkan jendela status pada pemain dan meng update status kesehatan pemain tiap sesudah mengambil icon. dan jika kondisi buruk terpenuhi tampilan status tidak akan ditampilkan pada layar
jadi method ini memperlihatkan kondisi pada pemain agar lebih bijak memilih icon untuk mencapai tujuan yaitu hidup sehat.

# 6. Bagaimana konsep class pada bahasa pemrograman digunakan dalam pembuatan game ini ?
dalam game ini saya menggunakan 1 class yaitu healtyLife, dimana didalamnnya ada atribut :  map ( map), posisi pemain ( playerY , palyerX, langkah ) dan  status kesehatan (muscleMAss, weight, sugar, fat)

serta method method untuk menginisialisaisi, pengaturan peta, pergerakan pemain, pengecekan dan penambahan icon serta kesehatan pemain. 

# 7. Jelaskan algoritma buatan sendiri yang digunakan pada pembuatan game ini !
pertama setelah diberitahukan intruksi pemain masuk kedalam game, kedua mula mula akan ada beberapa icon acak lalu seiring pemain bergerak icon random akan muncul, icon ini bisa muncul dimana saja, di jendela permainanan pasti akan muncul keterangan tiap icon dan penejelasan serta pengauh kepada kesehatan, ketika pemain menggabil icon tersebut otomatis status akan bertambah dan berkurang sesuai nilai, pemain akan terus bergerak hingga hasilnya ditentukan, sesuai judul healtylife pemain harus bisa memilah icon yang sehat dari makanan samai kegiatan dan menghindari yang butuk, misalkan pemain berpola hodup( bergerak) buruk makan akan mendapat penyakit yang tidak diiinginkan dan sesuai dengan masalah yang dialami pemain. begitupun sebaliknya jika pemai pola hidup sehat maka akan memenangkan game.


