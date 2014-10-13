import javax.swing.*;
import java.awt.*;

/**
 * Created by admin on October/13/14.
 */
public class JTableDemo {

    JTableDemo(){
        JFrame frame = new JFrame("JTable Demo");
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        String[] columns = {"Code", "Name", "High", "Low", "Close", "Volume", "Change","Change %"};

        Object[][] data = {
                {"MBF", "CITYGROUP", 10.16, 10.16, 10.16, 200, 0.08,0.79},
                {"MBL", "BANK OF AMERICA", 12.66, 12.66, 12.66, 6600, 0.13,1.04},
                {"MJP", "Morgan Stanley Dean Witter & Co.", 24.97, 24.97, 24.97, 1000, -0.04,-0.16}
        };

        JTable table = new JTable(data, columns);
        //JScrollPane scroll = new JScrollPane(table);
        //table.setFillsViewportHeight(true);

        JToolBar tb = new JToolBar();
        tb.setFloatable(false);
        tb.add(new JLabel("Stock Analysis"));
        tb.setBackground(Color.cyan);


        frame.add(table.getTableHeader(), BorderLayout.PAGE_START);
        frame.add(tb, BorderLayout.NORTH);
        frame.add(table, BorderLayout.CENTER);
    }

}
