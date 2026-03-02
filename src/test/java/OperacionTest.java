import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import mate.Operacion;

public class OperacionTest {

    Operacion op;

    @BeforeEach
    void setup(){
        op = new Operacion(2, 6);
    }

    @Test
    void sumaCorrecta() {
        assertEquals(8, op.suma());
    }

    @Test
    void restaCorrecta() {
        assertEquals(-4, op.resta());
    }

    @Test
    void multiplicacionCorrecta() {
        assertEquals(12, op.multiplicacion());
    }

    @Test
    void divisionCorrecta(){
        assertEquals(0, op.division());
    }

    @AfterEach
    void tearDown() {
        op = null;
    }
}