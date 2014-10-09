import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by admin on October/10/14.
 */
public class ComboBox {

    String[] daysArr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    JComboBox days = new JComboBox(daysArr);
    JButton select = new JButton("Select");
    JLabel input = new JLabel("Select your fav day of the week");
    JLabel output = new JLabel();

    ComboBox(){

        JFrame frame = new JFrame("Choices Demo");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.add(input);
        frame.add(days);
        frame.add(output);

        days.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox temp = (JComboBox) e.getSource();
                output.setText("You Selected: "+temp.getSelectedItem().toString());
            }
        });

    }
}
