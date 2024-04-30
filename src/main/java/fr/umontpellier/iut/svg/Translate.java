package fr.umontpellier.iut.svg;

public class Translate extends Transform {
    private final double x;
    private final double y;

    public Translate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "translate(" + x + " " + y + ")";
    }
}
