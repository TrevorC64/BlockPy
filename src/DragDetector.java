import Blocks.Block;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class DragDetector implements MouseMotionListener {
    public ArrayList<Block> blocks;
    public Graphics2D g;

    public DragDetector(ArrayList<Block> blocks){
        this.blocks = blocks;
    }

    @Override
    public void mouseDragged(MouseEvent me) {

    }

    @Override
    public void mouseMoved(MouseEvent me) {
        for (Block block:this.blocks) {
            int xDistance = Math.abs(block.x - me.getX());
            int yDistance = Math.abs(block.y - me.getY());


            //if(xDistance < block.getWidth() && yDistance < block.getHeight())
        }
    }
}
