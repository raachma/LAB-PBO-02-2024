import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

class AudioFile {

    public static void Audio(String audioPath) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file = new File(audioPath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        Thread.sleep(clip.getMicrosecondLength() / 1000);
    }

    // public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
  
    //     boolean diterima = true; // This is just an example condition, you should replace it with your actual logic
        
    //     if (diterima) {
    //         // Play sound when the employee is accepted
    //         AudioFile.Audio("ringtone4.wav");
    //         System.out.println("Karyawan diterima. Memainkan suara notifikasi...");
    //     } else {
    //         System.out.println("Karyawan tidak diterima.");
    //     }
    // }
}
