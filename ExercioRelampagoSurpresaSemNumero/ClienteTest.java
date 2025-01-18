package ExcRelampagoSemN;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveRetornarNomeCorreto() {
        Cliente cliente = new Cliente("Joao", "111346");
        assertEquals("Joao", cliente.getNome());
    }
    @Test
    void deveRetornarCpfCorreto() {
        Cliente cliente = new Cliente("Joao", "111346");
        assertEquals("111346", cliente.getCpf());
    }
}
