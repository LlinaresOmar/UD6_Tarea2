package es.iesmz.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DiasLluviaTest {
    static DiasLluvia diasLluvia;
    @Test
    void registroDiaBien(){
        diasLluvia = new DiasLluvia();
        assertEquals(true, diasLluvia.registroDia(1, 1, true));
    }

    @Test
    void registroDiaBien2(){
        diasLluvia = new DiasLluvia();
        assertEquals(true,diasLluvia.registroDia(1, 31, true));
    }

    @Test
    void registroDiaMal(){
        diasLluvia = new DiasLluvia();
        assertNotEquals(true, diasLluvia.registroDia(0, 12, true));
    }
    @Test
    void constaDiaBien1(){
        diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        assertEquals(true,diasLluvia.consultaDia(1, 1));
    }

    @Test
    void constaDiaBien2(){
        diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(12, 16, true);
        assertEquals(true, diasLluvia.consultaDia(12, 16));
    }

    @Test
    void constaDiaFalse1(){
        diasLluvia = new DiasLluvia();
        assertNotEquals(true,diasLluvia.consultaDia(1, 2));
    }

    @Test
    void contarDiasBien1(){
        diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 2, true);
        diasLluvia.registroDia(2, 6, true);
        diasLluvia.registroDia(4, 5, true);
        diasLluvia.registroDia(9,30, true);
        assertEquals(4,  diasLluvia.contarDiasLluvia());
    }

    @Test
    void contarDiasBien2(){
        diasLluvia = new DiasLluvia();
        assertEquals(0,  diasLluvia.contarDiasLluvia());
    }

    @Test
    void contarDiasLLuviaMal(){
        diasLluvia = new DiasLluvia();
        assertNotEquals(2, diasLluvia.contarDiasLluvia());
    }

    @Test
    void trimestreMasLluvia1(){
        diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 2, true);
        diasLluvia.registroDia(2, 6, true);
        diasLluvia.registroDia(4, 5, true);
        diasLluvia.registroDia(9,30, true);
        assertEquals(1, diasLluvia.trimestreLluvioso());
    }

    @Test
    void trimestreMasLluvia2(){
        diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 2, true);
        diasLluvia.registroDia(2, 6, true);
        diasLluvia.registroDia(9, 5, true);
        diasLluvia.registroDia(9,30, true);
        assertEquals(0, diasLluvia.trimestreLluvioso());
    }
    //Si llueve lo mismo en dos trimestres devuelve 0

    @Test
    void trimestreLLuviaMal1(){
        diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 2, true);
        diasLluvia.registroDia(2, 6, true);
        diasLluvia.registroDia(4, 5, true);
        diasLluvia.registroDia(9,30, true);
        assertNotEquals(2, diasLluvia.trimestreLluvioso());
    }

}