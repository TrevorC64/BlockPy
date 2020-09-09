package Blocks;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Block extends JComponent {
    public Color color;
    public Color fontColor;
    public String label;
    public int width;
    public int height;
    public int x;
    public int y;

    public Block(int x, int y, int width, int height, Color color, String label, Color fontColor) {
        this.color = color;
        this.fontColor = fontColor;
        this.label = label;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                System.out.println("AAAA");
            }
        });

    }

    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillRect(this.x,this.y,this.width/2,this.height/2);
        g.setColor(this.fontColor);
        g.drawString(this.label, this.x + 10, this.y + 10);
    }
}
