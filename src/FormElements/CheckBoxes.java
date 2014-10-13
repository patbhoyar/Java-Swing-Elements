package FormElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by admin on October/10/14.
 */
public class CheckBoxes {

    JLabel label = new JLabel("Select the Colors you like!");
    JCheckBox blue = new JCheckBox("Blue");
    JCheckBox black = new JCheckBox("Black");
    JCheckBox red = new JCheckBox("Red");
    JCheckBox yellow = new JCheckBox("Yellow");
    JCheckBox maroon = new JCheckBox("Maroon");
    JButton select = new JButton("Select");
    JLabel output = new JLabel("");

    StringBuffer display = new StringBuffer("You Selected: ");
    JCheckBox[] colors = {blue, black, red, yellow, maroon};
    String[] colorNames = {"Blue", "Black", "Red", "Yellow", "Maroon"};

    private void CreateGUI(){

        JFrame frame = new JFrame("FormElements.CheckBoxes Demo");
        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(blue);
        frame.add(black);
        frame.add(red);
        frame.add(yellow);
        frame.add(maroon);
        frame.add(select);
        frame.add(output);

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < colors.length; i++){
                    if (colors[i].isSelected()){
                        display.append(colorNames[i] + ", ");

                    }
                }
                output.setText(display.toString().substring(0, display.length()-2));
            }
        });

    }


    CheckBoxes(){
        CreateGUI();
    }

}
