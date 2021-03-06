package FormElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by admin on October/10/14.
 */
public class RadioButton {

    ButtonGroup cars = new ButtonGroup();
    JRadioButton ferrari = new JRadioButton("Ferrari");
    JRadioButton lamborghini = new JRadioButton("Lamborghini");
    JRadioButton mustang = new JRadioButton("Mustang");
    JRadioButton camero = new JRadioButton("Camaro");
    JLabel input = new JLabel("Select your Favorite Car");
    JLabel output = new JLabel("");

    RadioButton(){

        JFrame frame = new JFrame("FormElements.CheckBoxes Demo");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        cars.add(ferrari);
        cars.add(lamborghini);
        cars.add(mustang);
        cars.add(camero);

        frame.add(input);
        frame.add(ferrari);
        frame.add(lamborghini);
        frame.add(mustang);
        frame.add(camero);
        frame.add(output);

        ferrari.addItemListener(buttonSelected());
        lamborghini.addItemListener(buttonSelected());
        mustang.addItemListener(buttonSelected());
        camero.addItemListener(buttonSelected());

    }

    private ItemListener buttonSelected(){
        return new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JRadioButton a = (JRadioButton)e.getSource();
                if (a.isSelected()){
                    output.setText("You Selected : "+ a.getText());
                }
            }
        };
    }

}
