package ExcRelampagoSemN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {
    @Test
    void deveRetornarQuantidadeInvalida() {
        try {
            Venda venda = new Venda("1", null, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }
    @Test
    void deveRetornarQuantidadeValida() {
        Venda venda = new Venda("1", new Produto("L", 10, 1.0f, 2, 15), 5);
        assertEquals(5, venda.getQtde());
    }
    @Test
    void deveRetornarProdutoInvalido() {
        try {
            Venda venda = new Venda("1/1/1", null, 1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Produto invalido", e.getMessage());
        }
    }
    @Test
    void deveRetornarProdutoValido() {
        Produto produto = new Produto("A", 10, 1.0f, 2, 15);
        Venda venda = new Venda("1/1/1", produto, 1);
        assertEquals(produto, venda.getProduto());
    }
    @Test
    void vendaNaoDeveOcorrer() {
        try {
            Produto produto = new Produto("Livro", 10, 1000.0f, 2, 15);
            Venda venda = new Venda("1/1/1", produto, 11);
            venda.vender();
            fail();
        }
        catch (RuntimeException r) {
            assertEquals("Venda nao realizada", r.getMessage());
        }
    }
    @Test
    void vendaDeveOcorrerCorretamente() {
        Produto produto = new Produto("Livro", 10, 1000.0f, 2, 15);
        Venda venda = new Venda("1/1/1", produto, 8);
        assertEquals("Valor da venda: 8000.0", venda.vender());
    }
}
