import javax.swing.*;
import java.awt.*;

public class BlockPyGUI {

    public BlockPyGUI() {
        JFrame frame = new JFrame("BlockPy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JMenuBar menuBar = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        menuBar.add(m1);
        menuBar.add(m2);

        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        JLabel title = new JLabel("CODE BLOCKS");
        JButton b1 = new JButton("Make Var");
        JButton b2 = new JButton("IF");
        sidebar.add(title);
        sidebar.add(b1);
        sidebar.add(b2);
        sidebar.setBackground(Color.red);

        frame.getContentPane().add(BorderLayout.WEST, sidebar);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.setVisible(true);

    }
}
