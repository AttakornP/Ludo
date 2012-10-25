
package ludo;

import java.awt.Image;


public class Player {
    
    private int     poX_start;
    private int     poY_start;
    private int     poX_current;
    private int     poY_current;
    private boolean status = false;
    private String  color;
    private int     table_current;

    public int getPoX_current() {
        return poX_current;
    }

    public int getPoY_current() {
        return poY_current;
    }

    public void setPoX_current(int poX_current) {
        this.poX_current = poX_current;
    }

    public void setPoY_current(int poY_current) {
        this.poY_current = poY_current;
    }


    private Image   playerImg;

    public String getColor() {
        return color;
    }

    public Image getPlayerImg() {
        return playerImg;
    }

    public int gettable_current() {
        return table_current;
    }

    public int getPoX_start() {
        return poX_start;
    }


    public int getPoY_start() {
        return poY_start;
    }

    public boolean isStatus() {
        return status;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlayerImg(Image playerImg) {
        this.playerImg = playerImg;
    }

    public void settable_current(int table_current) {
        this.table_current = table_current;
    }

    public void setPoX_start(int poX_start) {
        this.poX_start = poX_start;
    }

    public void setPoY_start(int poY_start) {
        this.poY_start = poY_start;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
