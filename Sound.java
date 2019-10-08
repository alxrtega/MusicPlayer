/**
 * @author Alejandro Ortega
 * @version 1.0
 *
 * This class was created to import musical notes.
 */

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound {

    /**
     * In this method the file path of the note will be given.
     * Then it will convert the file into a Sound clip.
     *
     * @param filePath
     */
    private static void play(String filePath) {

        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(filePath)));
            clip.start();

            Thread.sleep(800);

        } catch (Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }

    /**
     * PlayDo() will be static to play the note Do anywhere.
     */
    protected static void playDo() {
        play("C:\\Sounds\\do.wav");
    }

    protected static void playRe() {
        play("C:\\Sounds\\re.wav");
    }

    protected static void playMi() {
        play("C:\\Sounds\\mi.wav");
    }

    protected static void playFa() {
        play("C:\\Sounds\\fa.wav");
    }

    protected static void playSol() {
        play("C:\\Sounds\\sol.wav");
    }

    protected static void playLa() {
        play("C:\\Sounds\\la.wav");
    }

    protected static void playSi() {
        play("C:\\Sounds\\si.wav");
    }

    protected static void playDo8() {
        play("C:\\Sounds\\do-octave.wav");
    }

}