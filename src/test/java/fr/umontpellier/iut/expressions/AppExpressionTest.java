package fr.umontpellier.iut.expressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppExpressionTest {
    @Test
    public void test_if_main_method_was_implemented() {
        assertDoesNotThrow(() -> AppExpression.main(new String[1]));
    }

    @Test
    public void test_expression_1() {
        Expression expr_gauche = new Operation('-', new Nombre(2), new Nombre(3));
        Expression expr_droite = new Nombre(5);
        Expression expr = new Operation('*', expr_gauche, expr_droite);
        assertEquals(expr.calculerValeur(), -5);
    }

    @Test
    public void test_expression_2() {
        Expression expr_gauche = new Operation('*', new Nombre(2), new Nombre(3));
        Expression expr_droite = new Nombre(5);
        Expression expr = new Operation('+', expr_gauche, expr_droite);
        assertEquals(expr.calculerValeur(), 11);
    }

    @Test
    public void test_expression_3() {
        Expression expr_gauche = new Operation('*', new Nombre(5), new Nombre(4));
        Expression expr_droite = new Operation('/', new Nombre(9), new Nombre(6));
        Expression expr = new Operation('-', expr_gauche, expr_droite);
        assertEquals(expr.calculerValeur(), 18.5);
    }
}