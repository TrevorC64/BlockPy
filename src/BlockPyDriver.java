import Blocks.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BlockPyDriver extends JPanel implements ActionListener {
    public ArrayList<Block> blocks;
    private Timer timer;

    public void add(Block block){
        this.blocks.add(block);
    }

    public BlockPyDriver() {
        this.blocks = new ArrayList<>();
        timer = new Timer(1000/60, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //ADD DRAWING
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Block block:blocks) {
            block.draw(g);
        }
    }

    public void generateBlock(String type){
        switch (type){
            case "Print":
                this.blocks.add(new PrintBlock());
                break;
            case "Input":
                this.blocks.add(new InputBlock());
                break;
            case "Comment":
                this.blocks.add(new CommentBlock());
                break;
            case "And":
                this.blocks.add(new AndBlock());
                break;
            case "OrBlock":
                this.blocks.add(new OrBlock());
                break;
            case "Not":
                this.blocks.add(new NotBlock());
                break;
            case "Add":
                this.blocks.add(new AddBlock());
                break;
            case "Subtract":
                this.blocks.add(new SubtractBlock());
                break;
            case "Multiply":
                this.blocks.add(new MultiplyBlock());
                break;
            case "Divide":
                this.blocks.add(new DivideBlock());
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
