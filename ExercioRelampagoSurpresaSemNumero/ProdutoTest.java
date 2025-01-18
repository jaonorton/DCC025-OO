package ExcRelampagoSemN;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void deveRetornarNomeCorreto() {
        Produto produto = new Produto("Livro", 5, 1.0f, 2, 10);
        assertEquals("Livro", produto.getNome());
    }
    @Test
    void deveRetornarQuantidadeEstoqueInvalida() {
        try {
            Produto produto = new Produto("Revista", -1, 1.0f, 2, 10);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Quantidade estoque invalida", e.getMessage());
        }
    }
    @Test
    void deveRetornarQuantidadeEstoqueValida() {
        Produto produto = new Produto("Jornal", 5, 1.0f, 2, 10);
        assertEquals(5, produto.getQtdeEstoque());
    }
    @Test
    void deveRetornarPrecoUnitarioInvalido() {
        try {
            Produto produto = new Produto("Album", 5, 0.0f, 2, 10);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco unitario invalido", e.getMessage());
        }
    }
    @Test
    void deveRetornarPrecoUnitarioValido() {
        Produto produto = new Produto("Biblia", 5, 1.0f, 2, 10);
        assertEquals(1.0f, produto.getPrecoUnit());
    }
    @Test
    void deveRetornarEstoqueMinimoInvalido() {
        try {
            Produto produto = new Produto("Cigarro", 5, 1.0f, -1, 10);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque minimo invalido", e.getMessage());
        }
    }
    @Test
    void deveRetornarEstoqueMinimoValido() {
        Produto produto = new Produto("Gibi", 5, 1.0f, 2, 10);
        assertEquals(2, produto.getEstoqueMinimo());
    }
    @Test
    void deveRetornarEstoqueMaximoInvalido() {
        try {
            Produto produto = new Produto("Livro", 5, 1.0f, 2, 0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque maximo invalido", e.getMessage());
        }
    }
    @Test
    void deveRetornarEstoqueMaximoValido() {
        Produto produto = new Produto("Revista", 5, 1.0f, 2, 10);
        assertEquals(10, produto.getEstoqueMaximo());
    }
    @Test
    void deveDebitarEstoqueCorretamente() {
        Produto produto = new Produto("Jornal", 5, 1.0f, 2, 10);
        produto.debitarEstoque(1);
        assertEquals(4, produto.getQtdeEstoque());
    }
    @Test
    void deveCreditarEstoqueCorretamente() {
        Produto produto = new Produto("Biblia", 5, 1.0f, 2, 10);
        produto.creditarEstoque(1);
        assertEquals(6, produto.getQtdeEstoque());
    }
    @Test
    void deveVerificarEstoqueBaixo() {
        Produto produto = new Produto("Album", 1, 1.0f, 2, 10);
        assertTrue(produto.verificarEstoqueBaixo());
    }
    @Test
    void deveVerificarEstoqueInsuficiente() {
        Produto produto = new Produto("Cigarro", 1, 1.0f, 5, 10);
        assertTrue(produto.verificarEstoqueInsuficiente(6));
    }
    @Test
    void deveVerificarEstoqueExcedente() {
        Produto produto = new Produto("Jornal", 5, 1.0f, 5, 10);
        assertTrue(produto.verificarEstoqueExcedente(6));
    }
    @Test
    void deveCalcularValorVendaCorreto() {
        Produto produto = new Produto("Revista", 5, 1000.0f, 2, 10);
        assertEquals(8000.0f, produto.calcularValorVenda(8));
    }
    @Test
    void venderDeveRetornarEstoqueAbaixoMinimo() {
        try {
            Produto produto = new Produto("Livro", 5, 1000.0f, 2, 10);
            produto.vender("1", new Cliente("Joao", "111346"), 4);
            fail();
        }
        catch (RuntimeException r) {
            assertEquals("Estoque abaixo do minimo", r.getMessage());
        }
    }
    @Test
    void vendaDeveSerRealizadaCorretamente() {
        Produto produto = new Produto("Revista", 6, 1000.0f, 2, 10);
        produto.vender("30/11/2023", new Cliente("Joao", "111346"), 3);
        assertEquals("-- Venda --Celular Valor da venda: 3000.0", produto.exibirHistorico().get(0));
    }
    @Test
    void compraDeveSerRealizadaCorretamente() {
        Produto produto = new Produto("Biblia", 6, 1000.0f, 2, 10);
        produto.comprar("30/11/2023", new Fornecedor("Joao", "111346"), 1);
        assertEquals("-- Compra --Celular Valor da compra: 1000.0", produto.exibirHistorico().get(0));
    }
}
