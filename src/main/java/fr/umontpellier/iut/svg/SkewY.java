package fr.umontpellier.iut.svg;

public class SkewY extends Transform {
    private final double value;

    public SkewY(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "skewY(" + value + ")";
    }
}
