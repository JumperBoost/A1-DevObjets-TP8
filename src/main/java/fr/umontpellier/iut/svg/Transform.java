package fr.umontpellier.iut.svg;

import java.text.DecimalFormat;

public abstract class Transform extends Tag {
    public Transform() {
        super("transform");
    }

    public String getStringFromDouble(double value) {
        return new DecimalFormat("###.##").format(value).replace(',', '.');
    }
}
