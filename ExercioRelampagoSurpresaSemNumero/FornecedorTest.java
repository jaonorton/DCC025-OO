package ExcRelampagoSemN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {
    @Test
    void deveRetornarCnpjCorreto() {
        Fornecedor fornecedor = new Fornecedor("Joao", "0001");
        assertEquals("0001", fornecedor.getCnpj());
    }

}
