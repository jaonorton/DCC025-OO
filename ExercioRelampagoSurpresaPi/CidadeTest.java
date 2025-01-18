package exrcPI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    public void deveRetornarEstadoCidade() {
        Cidade cidade = new Cidade("Espera Feliz", new Estado("MG"));
        assertEquals("MG", cidade.getNomeEstado());
    }

    @Test
    public void deveRetornarExcecaoCidadeSemEstado() {
        try {
            Cidade cidade = new Cidade("Espera Feliz",null);
            cidade.getNomeEstado();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Cidade sem estado", e.getMessage());
        }
    }
}