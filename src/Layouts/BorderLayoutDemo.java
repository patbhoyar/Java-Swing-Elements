package Layouts;

import javax.swing.*;
import java.awt.*;

/**
 * Created by admin on October/10/14.
 */
public class BorderLayoutDemo {



    public BorderLayoutDemo(){

        JFrame frame = new JFrame("Border Layout");
        frame .setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new java.awt.BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("Old");
        menu.add(item1);
        menu.add(item2);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        JToolBar tb = new JToolBar();
        tb.setFloatable(false);
        tb.add(new JButton("Ola"));
        tb.setBackground(Color.cyan);
        frame.add(tb, BorderLayout.NORTH);

        JToolBar tb1 = new JToolBar();
        tb1.setFloatable(false);
        tb1.add(new JButton("Blah"));
        tb1.setBackground(Color.blue);
        frame.add(tb1, BorderLayout.WEST);

        JToolBar tb2 = new JToolBar();
        tb2.setFloatable(false);
        tb2.add(new JButton("What"));
        tb2.setBackground(Color.red);
        frame.add(tb2, BorderLayout.SOUTH);

        JToolBar tb3 = new JToolBar();
        tb3.setFloatable(false);
        tb3.add(new JButton("Hahaha"));
        tb3.setBackground(Color.green);
        frame.add(tb3, BorderLayout.EAST);

        JTextArea tx = new JTextArea("This is the Central Text Area");
        frame.add(tx, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
