package fr.umontpellier.iut.svg;

public class Scale extends Transform {
    private final double x;
    private final double y;

    public Scale(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "scale(" + x + " " + y + ")";
    }
}
