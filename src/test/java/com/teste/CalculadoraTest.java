package com.teste;

import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSomar(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+5+3");
        assertEquals(5, soma);
    }

}
