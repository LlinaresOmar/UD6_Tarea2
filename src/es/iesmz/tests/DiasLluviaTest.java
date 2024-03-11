package es.iesmz.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DiasLluviaTest {
    static DiasLluvia diasLluvia;
    @Test
    public void registroDiaBien(){
        diasLluvia = new DiasLluvia();
        assertTrue(diasLluvia.registroDia(1, 1, true));
    }

    @Test
    public void registroDiaBien2(){
        diasLluvia = new DiasLluvia();
        assertTrue(diasLluvia.registroDia(1, 31, true));
    }

    @Test
    public void registroDiaMal(){
        diasLluvia = new DiasLluvia();
        assertFalse(diasLluvia.registroDia(0, 12, true));
    }

    @Test
    public void registroDiaMal2(){
        diasLluvia = new DiasLluvia();
        assertFalse(diasLluvia.registroDia(2, 31, true));
    }

}