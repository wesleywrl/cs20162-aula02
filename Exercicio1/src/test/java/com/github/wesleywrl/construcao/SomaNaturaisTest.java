package com.github.wesleywrl.construcao;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomaNaturaisTest {

    @Test
    public void umCasoTrivial() {
        assertEquals(5, SomaNaturais.soma(-1, 6));
    }
}

