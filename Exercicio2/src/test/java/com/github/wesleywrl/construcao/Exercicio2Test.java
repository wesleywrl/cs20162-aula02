package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercicio2Test {

    @Test
    public void umCasoTrivial() {
        assertEquals(8, Exercicio2.numerosInteiros(2, 4));
        assertEquals(1000, Exercicio2.numerosInteiros(25, 40));
    }
}

