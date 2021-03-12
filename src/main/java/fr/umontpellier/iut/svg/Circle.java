package fr.umontpellier.iut.svg;

import java.util.Locale;

public class Circle extends Tag {
    private double cx;
    private double cy;
    private double r;

    public Circle(double cx, double cy, double r) {
        super("circle");
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    @Override
    public String getParameters() {
        return String.format(Locale.US, "cx=\"%f\" cy=\"%f\" r=\"%f\"", this.cx, this.cy, this.r);
    }
}
