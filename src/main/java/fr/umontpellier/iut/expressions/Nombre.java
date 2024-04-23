package fr.umontpellier.iut.expressions;

import java.text.DecimalFormat;

public class Nombre implements Expression {
    private final double valeur;

    public Nombre(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public double calculerValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return new DecimalFormat("###.##").format(valeur).replace(',', '.');
    }
}
