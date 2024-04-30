package fr.umontpellier.iut.svg;

public class SkewX extends Transform {
    private final double value;

    public SkewX(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "skewX(" + value + ")";
    }
}
