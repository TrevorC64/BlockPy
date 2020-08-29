import Blocks.*;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class BlockPyGUI {
    private JPanel sidebar;
    private JPanel panel;
    private JTree blocks;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Code Blocks");

        DefaultMutableTreeNode general = new DefaultMutableTreeNode("General Blocks");
        DefaultMutableTreeNode math = new DefaultMutableTreeNode("Math Blocks");
        DefaultMutableTreeNode logic = new DefaultMutableTreeNode("Logic Blocks");

        DefaultMutableTreeNode print = new DefaultMutableTreeNode("Print");
        DefaultMutableTreeNode input = new DefaultMutableTreeNode("Input");
        DefaultMutableTreeNode comment = new DefaultMutableTreeNode("Comment");

        DefaultMutableTreeNode add = new DefaultMutableTreeNode("Add");
        DefaultMutableTreeNode subtract = new DefaultMutableTreeNode("Subtract");
        DefaultMutableTreeNode multiply = new DefaultMutableTreeNode("Multiply");
        DefaultMutableTreeNode divide = new DefaultMutableTreeNode("Divide");

        DefaultMutableTreeNode conjunction = new DefaultMutableTreeNode("And");
        DefaultMutableTreeNode disjunction = new DefaultMutableTreeNode("OrBlock");
        DefaultMutableTreeNode negation = new DefaultMutableTreeNode("Not");

        general.add(print);
        general.add(input);
        general.add(comment);

        math.add(add);
        math.add(subtract);
        math.add(multiply);
        math.add(divide);

        logic.add(conjunction);
        logic.add(disjunction);
        logic.add(negation);

        root.add(general);
        root.add(logic);
        root.add(math);

        this.blocks = new JTree(root);
    }

    public BlockPyGUI(){
        JFrame frame = new JFrame("APP");
        frame.setContentPane(this.panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1500,700);

        BlockPyDriver driver = new BlockPyDriver();
        driver.setBackground(Color.decode("#F2E8B9"));
        frame.getContentPane().add(driver);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        JMenu m3 = new JMenu("Save");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        mb.setVisible(true);

        frame.setVisible(true);

        blocks.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
                try{
                    String selection = treeSelectionEvent.getPath().getPathComponent(2).toString();
                    driver.generateBlock(selection);
                    System.out.println(selection);
                    System.out.println(driver.blocks.toString());
                } catch (Exception ignored) {
                }
            }
        });

        DragDetector dd = new DragDetector(driver.blocks);
        this.panel.addMouseMotionListener(dd);
    }

    public static void main(String[] args) {
        BlockPyGUI blockPyGui = new BlockPyGUI();
    }
}
