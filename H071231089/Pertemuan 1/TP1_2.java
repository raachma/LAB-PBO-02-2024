import java.util.Scanner;

public class TP1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek dari Scanner
        System.out.print("Masukkan Judul Film :\n> "); // Meng-print String, Ingat beda dari print dan println, Jika print maka letak kursornya disamping, kalau println letak kursornya di baris baru
        String judul = input.nextLine(); // Menginput nextLine yaitu mengambil satu baris penuh dengan tipe data String
        System.out.println(hurufJudul(judul)); // Memprint sebuah method bernama hurufJudul dengan parameter judul
        input.close(); // Input di close
    }
    static String hurufJudul(String judul){ // Method yang mengembalikan nilai String dengan parameter bertipe string
        String[] arrString = judul.split(" "); // Kalau dalam python ini namanya list tapi sekarang disebut Array
        // String[] adalah array yang bertipe data String yang dimana nilainya atau valuenya merupakan judul.split(" "), maksudnya judul.split, String judul tersebut akan dipisah dengan spasi " ",
        // Misal "aku Pulang" maka isi dari array string itu menjadi ["aku", "Pulang"]
        for (int i = 0; i < arrString.length; i++){ // Perulangan sebanyak panjang (length) dari array string tersebut
            arrString[i] = Character.toUpperCase(arrString[i].charAt(0)) + arrString[i].substring(1);
            // disini saya mengakses elemen ke-1 misalnya dalam konteks ["aku", "Pulang"], saya mengindeks i = 0 maka array[0] = "aku"
            //Setelah saya akses "aku", saya mengubah nilainya menjadi = ToUpperCase merupakan method dari Character yang mengubah huruf kecil ke besar
            // ArrString[i].charAt(0) misalnya "aku" dan karakter ke 0 otomatis merujuk ke "a", maka otomatis yang berubah jadi huruf besar yaitu a ke A
            // lalu karena sudah berubah jadi huruf besar, kita harus menambah sisanya lagi dengan metode substring
            // di kasus diatas ArrString[i] = "A" + sisanya dari arrString dimulai dari index 1, maksudnya mengambil seluruh kata dimulai dari index 1
            // Contohnya "Aku", substring(1) maka "Ku", karena "A" index ke 0
            // Maka hasilnya "aku" = "A" + "ku", yang awalnya "aku" jadi "Aku" :D
        }
        // Setelah kita mengubah seluruh kata di dalam array tersebut kita menyusunnya kembali dan menggabungnya kembali
        String hasil = String.join(" ", arrString); // disini kita join, artinya menggabungkannya kembali dengan delimiternya/pemisahnya yaitu " " spasi 
        return hasil; // Mengembalikan nilai hasil, dikembalikan (direturn) karena fungsi kita bukan Void, tapi bertipe data.
    }
}

