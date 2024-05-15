import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound {
    public static void playSound(String soundFilePath) {
        try {
            File file = new File(soundFilePath);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.out.println("Error playing sound: " + e.getMessage());
        }
    }
}
