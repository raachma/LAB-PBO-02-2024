import java.util.Scanner;

public class TP1_1 {
    public static void main(String[] args){ // main method seperti blok utama dan tempat dijalankan seluruh perintah yang ditulis (Singkatnya titik awal program akan dieksekusi)
        Scanner input = new Scanner(System.in); // membuat objek dari Scanner dan akan digunakan untuk menginput dari user
        int jumlahBilanganBulat = 0, jumlahBilanganDesimal = 0, jumlahHuruf = 0; // Membuat 3 variabel bertipe data integer dan memberikan nilai 0 kesetiap variabelnya
        int x = input.nextInt(); // Membuat variabel X yang dimana valuenya berdasarkan dari input user, nextInt maksudnya inputan untuk Int, kalau double (float) pakai nextDouble()
        for (int i = 0; i < x; i++){ // Perulangan for sebanyak X kali yang diinput, i nya akan berulang selagi i kurang dari X
            try { // blok try-catch disini artinya mencoba terlebih dahulu dan jika eror atau menangkap sesuatu eror akan masuk ke blok kode catch (Exception e)
                try { // Nested try karena try pertama untuk menangkap jika erornya karena huruf, dan try kedua digunakan untuk mengalihkan angka jika angkanya bukan int maka ke double;
                    int angka = input.nextInt();
                    jumlahBilanganBulat++; // Disini maksudnya jika angka yang diinput merupakan angka Int maka Jumlah Bilangan bulat otomatis tambah 1, dan jika double maka turun ke blok catch
                    angka = angka+1; // Gunanya agar variabel angka pernah digunakan, dapat dihapus
                } catch (Exception e){
                    double angka = input.nextDouble();
                    angka = angka+1;
                    jumlahBilanganDesimal++; // Sama dengan diatas
                }
            } catch (Exception e) {
                jumlahHuruf++; //Disini jika memang apa yang kita input bukan merupakan antara int atau double maka dia masuk ke blok catch ini dan akan menambah variabel Jumlah huruf sebanyak 1
            }
        }
        input.close(); // Menutup input agar tak ada lagi yang bisa diinput
        if (jumlahHuruf == 0){ // Disini hanya membuat kondisi jika memang tidak ada error huruf yang didapat maka yang diprint sisa jumlah bilangan bulat dan juga bilangan desimal, jika ada maka 3 yaitu jumlah int, double, dan huruf
            System.out.println(jumlahBilanganBulat + " Bilangan Bulat\n" + jumlahBilanganDesimal + " Bilangan Desimal"); // Ingat \n merupakan enter atau baris baru
        } else {
            System.out.println(jumlahBilanganBulat + " Bilangan Bulat\n" + jumlahBilanganDesimal + " Bilangan Desimal\n" + jumlahHuruf + " Huruf/Karakter");
        }
    }
}