package fr.umontpellier.iut.svg;

public class Rotate extends Transform {
    private final double a;
    private final double x;
    private final double y;

    public Rotate(double a, double x, double y) {
        this.a = a;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "rotate(" + a + " " + x + " " + y + ")";
    }
}
