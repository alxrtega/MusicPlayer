import javax.swing.JOptionPane;

public class FilePlayer {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (JOptionPane.showConfirmDialog(null, "Do you want to play Twinkle" +
                        "Twinkle Little Star?", "Continue?",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            TwinkleTwinkle tt = new TwinkleTwinkle();
            LittleStar ls = new LittleStar();

            tt.start();
            ls.start();

            System.out.printf("Gracias Gente!\n");
        }
        else {
            System.out.printf("Gracias Gente!\n");
        }

    }
}