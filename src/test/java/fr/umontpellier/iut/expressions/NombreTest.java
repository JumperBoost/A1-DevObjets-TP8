package fr.umontpellier.iut.expressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NombreTest {

    @Test
    public void calculerValeur_0() {
        assertEquals(0, new Nombre(0).calculerValeur());
    }

    @Test
    public void calculerValeur_15() {
        assertEquals(15, new Nombre(15).calculerValeur());
    }

    @Test
    public void calculerValeur_Moins_5() {
        assertEquals(-5, new Nombre(-5).calculerValeur());
    }

    @Test
    public void calculerValeur_Double() {
        assertEquals(10.5, new Nombre(10.5).calculerValeur());
    }
}