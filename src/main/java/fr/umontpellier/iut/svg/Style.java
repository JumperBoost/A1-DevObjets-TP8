package fr.umontpellier.iut.svg;

import java.util.StringJoiner;

public class Style {
    private String fill;
    private String stroke;
    private Double strokeWidth;
    private Double fillOpacity;



    public String toSVG() {
        StringJoiner elements = new StringJoiner(" ");
        if (fill != null) {
            elements.add("fill=\"" + fill + "\"");
        }
        if (stroke != null) {
            elements.add("stroke=\"" + stroke + "\"");
        }
        if (strokeWidth != null) {
            elements.add("stroke-width=\"" + strokeWidth + "\"");
        }
        if (fillOpacity != null) {
            elements.add("fill-opacity=\"" + fillOpacity + "\"");
        }

        return elements.toString();
    }
}
