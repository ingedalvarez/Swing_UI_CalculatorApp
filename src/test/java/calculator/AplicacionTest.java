package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicacionTest {

    Aplicacion app = new Aplicacion();


    @Test
    @DisplayName("Split sign +")
    void splitOperacionSumTest() {
        String[] ops = app.splitOperaciones("1+2+3");
        assertEquals("1", ops[0]);
        assertEquals("2", ops[1]);
        assertEquals("3", ops[2]);

    }

    @Test
    @DisplayName("Split sign -")
    void splitOperacionSubTest() {
        String[] ops = app.splitOperaciones("1-2-3");
        assertEquals("1", ops[0]);
        assertEquals("2", ops[1]);
        assertEquals("3", ops[2]);

    }

    @Test
    @DisplayName("Split sign X")
    void splitOperacionMulTest() {
        String[] ops = app.splitOperaciones("1X2X3");
        assertEquals("1", ops[0]);
        assertEquals("2", ops[1]);
        assertEquals("3", ops[2]);

    }

    @Test
    @DisplayName("Split sign /")
    void splitOperacionDivTest() {
        String[] ops = app.splitOperaciones("1/2");
        assertEquals("1", ops[0]);
        assertEquals("2", ops[1]);

    }

    @Test
    @DisplayName("if there is only one value the same value is returned")
    void calcularOneValue(){
        String result = app.calcular("1");
        assertEquals("1", result);
    }

    @Test
    @DisplayName("is contain + make a addition")
    void calcularAdd(){
        String result = app.calcular("1+2");
        assertEquals("3.0", result);
    }

    @Test
    @DisplayName("is contain - make a subtraction")
    void calcularSub(){
        String result = app.calcular("1-2");
        assertEquals("-1.0", result);
    }

    @Test
    @DisplayName("is contain X make a multiplication")
    void calcularMul(){
        String result = app.calcular("2X2");
        assertEquals("4.0", result);
    }

    @Test
    @DisplayName("is contain / make a division")
    void calcularDiv(){
        String result = app.calcular("10/2");
        assertEquals("5.0", result);
    }
}