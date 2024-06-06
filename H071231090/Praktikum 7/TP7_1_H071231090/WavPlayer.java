import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class WavPlayer {

    private Clip audioClip;

    // Constructor that initializes the audio clip
    public WavPlayer(String filePath) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        // Open the audio file as a stream
        File audioFile = new File(filePath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

        // Get the format of the audio file
        AudioFormat format = audioStream.getFormat();

        // Get a line that matches the format
        DataLine.Info info = new DataLine.Info(Clip.class, format);

        // Get the clip resource
        audioClip = (Clip) AudioSystem.getLine(info);

        // Open the audio clip with the audio stream
        audioClip.open(audioStream);
    }

    // Method to play the audio
    public void play() {
        if (audioClip != null) {
            audioClip.start();
        }
    }

    // Method to stop the audio
    public void stop() {
        if (audioClip != null) {
            audioClip.stop();
        }
    }

    // Method to close resources
    public void close() {
        if (audioClip != null) {
            audioClip.close();
        }
    }
}
