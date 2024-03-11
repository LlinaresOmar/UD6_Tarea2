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
}