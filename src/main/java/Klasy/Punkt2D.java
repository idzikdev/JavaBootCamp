package Klasy;

/**
 * Created by operator on 25.02.2017.
 */
public class Punkt2D {
    private double x;
    private double y;

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }
    public Punkt2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        return "Punkt2D [x=" + x + ", y=" + y + "]";
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
