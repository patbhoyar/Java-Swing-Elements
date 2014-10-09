import javax.swing.*;

/**
 * Created by admin on October/10/14.
 */
public class MainRoot {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckBoxes();
            }
        });
    }

}
