package fr.umontpellier.iut.expressions;

public class Nombre implements Expression {
    public Nombre(double valeur) {
        throw new RuntimeException("Constructeur à implémenter");
    }

    @Override
    public double calculerValeur() {
        throw new RuntimeException("Méthode non-implémentée");
    }
}
