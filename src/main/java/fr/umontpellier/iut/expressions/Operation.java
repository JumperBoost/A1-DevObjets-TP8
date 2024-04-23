package fr.umontpellier.iut.expressions;

public class Operation implements Expression {
    private final char operateur;
    private final Expression expressionGauche;
    private final Expression expressionDroite;

    public Operation(char operateur, Expression expressionGauche, Expression expressionDroite){
         this.operateur = operateur;
         this.expressionGauche = expressionGauche;
         this.expressionDroite = expressionDroite;
    }

    @Override
    public double calculerValeur() {
        return switch (operateur) {
            case '+' -> expressionGauche.calculerValeur() + expressionDroite.calculerValeur();
            case '-' -> expressionGauche.calculerValeur() - expressionDroite.calculerValeur();
            case '*' -> expressionGauche.calculerValeur() * expressionDroite.calculerValeur();
            case '/' -> {
                if(expressionDroite.calculerValeur() != 0)
                    yield expressionGauche.calculerValeur() / expressionDroite.calculerValeur();
                throw new ArithmeticException("Division par zéro");
            }
            default -> throw new ArithmeticException("Opérateur invalide");
        };
    }

    @Override
    public String toString() {
        return "(" + expressionGauche + operateur + expressionDroite + ")";
    }
}
