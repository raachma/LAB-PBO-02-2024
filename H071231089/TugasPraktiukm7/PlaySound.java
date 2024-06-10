import javax.sound.sampled.*;
public class PlaySound {
    public void playAudio(String audioFilePath) { //menerima satu parameter audioFilePath, yaitu path dari file audio yang akan diputar.
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(audioFilePath))) {
            AudioFormat format = audioInputStream.getFormat();
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, format));
            
            line.open(format);
            line.start();
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = audioInputStream.read(buffer)) != -1) {
                line.write(buffer, 0, bytesRead);
            }
            
            line.drain();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
//Membuka file audio menggunakan AudioInputStream dengan memanggil AudioSystem.getAudioInputStream. Metode getResource digunakan untuk mendapatkan resource file dari path yang diberikan.
// Menggunakan blok try-with-resources untuk memastikan AudioInputStream akan ditutup secara otomatis setelah selesai digunakan.
// Membuat buffer byte untuk menyimpan data audio sementara dengan ukuran 4096 byte.
// Membaca data audio dari audioInputStream ke dalam buffer dan menulisnya ke SourceDataLine hingga seluruh data audio selesai dibaca (read mengembalikan -1 jika akhir stream tercapai).