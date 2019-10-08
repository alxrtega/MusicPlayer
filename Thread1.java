/**
 * @author Alejandro Ortega
 * @version 1.0
 *
 * The thread class will complement another class to play a musical scale.
 */

public class Thread1 extends Thread {

    /**
     * Half of the melody will be played here.
     * Sleep will be used to sync.
     */
    public void run() {

            Sound.playDo();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            Sound.playMi();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            Sound.playSol();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            Sound.playSi();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}