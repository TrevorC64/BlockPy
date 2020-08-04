package Blocks;

import javax.swing.*;
import java.awt.*;

public class Block {
    public int x;
    public int y;
    public int length;
    public int height;
    public Color color;
    public Color fontColor;
    public String label;

    public Block(int x, int y, int length, int height, Color color, String label, Color fontColor) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.height = height;
        this.color = color;
        this.fontColor = fontColor;
        this.label = label;
    }

    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillRect(this.x,this.y,this.length,this.height);
        g.setColor(this.fontColor);
        g.drawString(this.label, this.x + 10, this.y + 10);
    }
}
