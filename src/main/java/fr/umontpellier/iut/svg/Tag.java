package fr.umontpellier.iut.svg;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Modélisation d'une balise SVG
 */
public abstract class Tag {
    private final String name;
    private Style style;
    private final List<Charts> contents;    // Liste d'éléments contenus dans la balise SVG

    public Tag(String name) {
        this.name = name;
        this.contents = new ArrayList<>();
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    /**
     * Renvoie une représentation des paramètres de la balise au format SVG. Le résultat de la méthode doit pouvoir
     * être directement inséré dans la balise.
     * Seuls les paramètres propres de la balise sont représentés, pas les paramètres de style.
     *
     * @return une représentation SVG des paramètres de la balise
     */
    public String getParameters() {
        return "";
    }

    /**
     * Ajoute une balise à l'image
     * @param chart balise à ajouter à l'image
     */
    public void add(Charts chart) {
        if(!contents.contains(chart))
            contents.add(chart);
    }

    /**
     * Renvoie la représentation SVG des éléments contenus dans la balise. Si la balise contient d'autres balises, la
     * chaîne renvoyée doit correspondre à la concaténation des représentations au format SVG de toutes les balises
     * contenues. Si la balise n'en contient pas d'autre, la chaîne vide "" est renvoyée.
     *
     * @return la chaîne de caractères correspondant à la concaténation des représentations des éléments contenus
     * dans la balise s'il y en a. La chaîne vide "" sinon.
     */
    public String getContent() {
        StringBuilder builder = new StringBuilder();
        for (Charts t : contents) {
            builder.append(t.toSVG());
        }
        return builder.toString();
    }

    /**
     * Renvoie la représentation SVG complète de la balise et son contenu
     *
     * @return une chaîne de caractères
     */
    public String toSVG() {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(name);
        String getParameters = getParameters();
        if (!getParameters.equals("")) {
            joiner.add(getParameters);
        }
        if (style != null) {
            String styleString = style.toSVG();
            joiner.add(styleString);
        }
        String contentsString = getContent();
        if (!contentsString.equals("")) {
            // balise avec contenu
            return "<" + joiner.toString() + ">\n" + contentsString + "</" + name + ">\n";
        } else {
            // balise autofermante
            return "<" + joiner.toString() + " />\n";
        }
    }
}
