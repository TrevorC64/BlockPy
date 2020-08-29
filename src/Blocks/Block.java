package Blocks;

import java.awt.*;

public class Block extends Rectangle{
    public Color color;
    public Color fontColor;
    public String label;

    public Block(int x, int y, int width, int height, Color color, String label, Color fontColor) {
        super(x,y,width,height);
        this.color = color;
        this.fontColor = fontColor;
        this.label = label;
    }

    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillRect(this.x,this.y,this.width,this.height);
        g.setColor(this.fontColor);
        g.drawString(this.label, this.x + 10, this.y + 10);
    }
}
