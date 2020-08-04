package Blocks;

import java.awt.*;

public class CommentBlock extends Block {
    public CommentBlock() {
        super(10, 10, 300, 100, Color.decode("#9FE4F2"), "Comment", Color.black);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
    }
}
