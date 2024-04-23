package fr.umontpellier.iut.expressions;

public class AppExpression {

    public static void main(String[] args) {
        // Expression 1
        Expression expr1_gauche = new Operation('-', new Nombre(20000), new Nombre(3.55));
        Expression expr1_droite = new Nombre(5);
        Expression expr1 = new Operation('*', expr1_gauche, expr1_droite);
        System.out.println("Expression 1: " + expr1);
        System.out.println("Résultat expression 1: " + expr1.calculerValeur());
    }
}
