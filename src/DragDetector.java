import Blocks.Block;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class DragDetector implements MouseMotionListener {
    public ArrayList<Block> blocks;
    
    public DragDetector(ArrayList<Block> blocks){
        this.blocks = blocks;
    }

    @Override
    public void mouseDragged(MouseEvent me) {

    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }
}
