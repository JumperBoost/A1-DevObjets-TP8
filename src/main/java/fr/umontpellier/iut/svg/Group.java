package fr.umontpellier.iut.svg;

import java.util.ArrayList;
import java.util.List;

public class Group extends Charts {
    private List<Charts> liste;

    public Group() {
        super("g");
        liste = new ArrayList<>();
    }

    public void add(Charts chart) {
        if(!liste.contains(chart))
            liste.add(chart);
    }

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder();
        for(Charts chart : liste)
            content.append(chart.toSVG());
        return content.toString();
    }
}
