package fr.umontpellier.iut.expressions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationTest {

    @Disabled
    @Test
    void calculerValeur_10_fois_5() {
        Expression e = new Operation('*', new Nombre(10), new Nombre(5));
        assertEquals(50, e.calculerValeur());
    }
}
