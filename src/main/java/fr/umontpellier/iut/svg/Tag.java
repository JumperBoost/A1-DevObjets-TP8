package fr.umontpellier.iut.svg;

import java.util.StringJoiner;

public abstract class Tag {
    private String name;
    private Style style;

    public Tag(String name) {
        this.name = name;
        this.style = new Style();
    }

    public String getParameters() {
        return "";
    }

    public String getContent() {
        return "";
    }

    // retourne le texte SVG correspondant à ce Tag (this) avec son contenu éventuel
    public String getSVG() {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(name);
        String getParameters = getParameters();
        if (!getParameters.equals("")) {
            joiner.add(getParameters);
        }
        String styleString = style.getSVG();
        if (!styleString.equals("")) {
            joiner.add(styleString);
        }
        String contentsString = getContent();
        if (!contentsString.equals("")) {
            // balise avec contenu
            return "<" + joiner.toString() + ">" + contentsString + "</" + name + ">";
        } else {
            // balise autofermante
            return "<" + joiner.toString() + " />";
        }
    }
}
