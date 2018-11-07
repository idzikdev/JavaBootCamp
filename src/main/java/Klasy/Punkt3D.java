package Klasy;

/**
 * Created by operator on 25.02.2017.
 */
public class Punkt3D extends Punkt2D {
    private double z;

    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        // super.toString();
        return super.toString() + " Punkt3D [z=" + z + "]";
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

}

