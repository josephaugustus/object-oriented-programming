package aula14.salaAula.teste;

import org.junit.Test;
import static org.junit.Assert.*;

class SaudeTest {

    @Test
    void testCondicao() {
        Saude saude = new Saude(20, 1.64, 62);
        assertTrue(saude.condicaoFisica().equals("Peso normal"));
    }

    @Test
    void testIMC() {
        Saude saude = new Saude(20, 1.64, 62);
        assertEquals(saude.calculaIMC(), 23, 0.5);
    }

}
