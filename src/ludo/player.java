
package ludo;

import java.awt.Image;


public class player {
    
    private int     x;
    private int     y;
    private boolean status = false;
    private String  color;
    private int     start[];
    private int     end[];

    private Image   red;
    private Image   yellow;
    private Image   green;
    private Image   blue;

    public Image getBlue() {
        return blue;
    }

    public void setBlue(Image blue) {
        this.blue = blue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[] getEnd() {
        return end;
    }

    public void setEnd(int[] end) {
        this.end = end;
    }

    public Image getGreen() {
        return green;
    }

    public void setGreen(Image green) {
        this.green = green;
    }

    public Image getRed() {
        return red;
    }

    public void setRed(Image red) {
        this.red = red;
    }

    public int[] getStart() {
        return start;
    }

    public void setStart(int[] start) {
        this.start = start;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getYellow() {
        return yellow;
    }

    public void setYellow(Image yellow) {
        this.yellow = yellow;
    }

    
    
    
    
    
}
