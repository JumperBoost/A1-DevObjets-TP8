package fr.umontpellier.iut.svg;

import java.util.Locale;

public class Rectangle extends Charts {
    private final double x;
    private final double y;
    private final double width;
    private final double height;

    private double rx;
    private double ry;

    public Rectangle(double x, double y, double width, double height) {
        super("rect");
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double x, double y, double width, double height, double rx, double ry) {
        this(x, y, width, height);
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public String getParameters() {
        String format = String.format(Locale.US, "x=\"%f\" y=\"%f\" width=\"%f\" height=\"%f\"", x, y, width, height);
        if(rx != 0)
            format += " rx=\"" + rx + "\"";
        if(ry != 0)
            format += " ry=\"" + ry + "\"";
        return format;
    }

}
