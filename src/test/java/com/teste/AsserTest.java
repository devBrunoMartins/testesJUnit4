package com.teste;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class AsserTest {
    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("text", "text");
    }

    @Test
    public void testAssertFalse(){
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull(){
        assertNull(null);
    }


    @Test
    public void tstAssertSame(){
        Integer aNumber = Integer.valueOf(768);
        assertSame(aNumber, aNumber);
    }

}
