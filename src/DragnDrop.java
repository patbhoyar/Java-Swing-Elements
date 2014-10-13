import javax.swing.*;

/**
 * Created by admin on October/11/14.
 */
public class DragnDrop {

    JFrame frame;
    JTextField text;
    JButton btn;
    JLabel lbl;

    DragnDrop(){
        frame = new JFrame("Drag n Drop");
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        text = new JTextField("");
        text.setBounds(10, 50, 90, 25);
        btn = new JButton("Drag Here");
        btn.setBounds(130, 50, 150, 25);
        lbl = new JLabel("Blah Blah");
        lbl.setBounds(100, 90, 100, 25);

        frame.add(lbl);

        text.setDragEnabled(true);
        btn.setTransferHandler(new TransferHandler("text"));

        frame.add(text);
        frame.add(btn);

    }

}
