/**
 * @author Alejandro Ortega
 * @version 1.0
 *
 * The thread class will complement another class to play a musical scale.
 */

public class Thread2 extends Thread {


    /**
     * This method will complete the melody.
     * Sleep will be used to sync.
     */
    public void run() {

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Sound.playRe();

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Sound.playFa();

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Sound.playLa();

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Sound.playDo8();


    }
}