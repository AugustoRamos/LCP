package Aula4.Classes;

/**
 * Created by Augusto Chaves Ramos on 10/04/2016.
 */
public class Door {

    private boolean isOpenned;
    private String color;
    private Double x;
    private Double y;
    private Double z;


    public boolean isOpenned() {
        return isOpenned;
    }

    public void setOpenned(boolean isOpenned) {
        this.isOpenned = isOpenned;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public void open(){
        this.isOpenned = true;
    }

    public void close(){
        this.isOpenned = false;
    }
}
