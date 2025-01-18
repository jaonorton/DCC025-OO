package ExcRelampagoSemN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {
    @Test
    void compraNaoDeveOcorrer() {
        try {
            Produto produto = new Produto("Livro", 15, 100.1f, 3, 15);
            Compra compra = new Compra("1/1/1", produto, 5);
            compra.comprar();
            fail();
        }
        catch (RuntimeException r) {
            assertEquals("Estoque maior do que maximo - compra nao realizada", r.getMessage());
        }
    }
    @Test
    void compraDeveOcorrerCorretamente() {
        Produto produto = new Produto("Revista", 5, 20.0f, 1, 15);
        Compra compra = new Compra("2/2/2", produto, 8);
        assertEquals("Valor da compra: 8000.0", compra.comprar());
    }
}
