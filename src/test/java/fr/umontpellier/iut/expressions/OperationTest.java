package fr.umontpellier.iut.expressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationTest {

    @Test
    void calculerValeur_10_fois_5() {
        Expression e = new Operation('*', new Nombre(10), new Nombre(5));
        assertEquals(50, e.calculerValeur());
    }


    @Test
    void calculerValeur_2_fois_parenthese_3_plus_1_parenthese() {
        Expression e = new Operation('*', new Nombre(2), new Operation('+', new Nombre(3), new Nombre(1)));
        assertEquals(8, e.calculerValeur());
    }

    @Test
    public void test_division_par_zero() {
        Expression expr_gauche = new Operation('*', new Nombre(2), new Nombre(3));
        Expression expr_droite = new Nombre(0);
        Expression expr = new Operation('/', expr_gauche, expr_droite);
        assertThrows(ArithmeticException.class, expr::calculerValeur);
    }

    @Test
    public void test_operateur_inexistant() {
        Expression expr_gauche = new Operation('*', new Nombre(2), new Nombre(3));
        Expression expr_droite = new Nombre(0);
        Expression expr = new Operation('%', expr_gauche, expr_droite);
        assertThrows(ArithmeticException.class, expr::calculerValeur);
    }
}
