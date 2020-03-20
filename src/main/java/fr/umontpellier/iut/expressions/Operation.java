package fr.umontpellier.iut.expressions;

public class Operation implements Expression {

    public Operation(char operateur, Expression expressionGauche, Expression expressionDroite){
         throw new RuntimeException("Constructeur à implémenter");
    }

    @Override
    public double calculerValeur() {
        throw new RuntimeException("Méthode non-implémentée");
    }
}
