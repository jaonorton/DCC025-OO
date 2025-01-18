package ExcRelampagoSemN;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int qtdeEstoque;
    private float precoUnit;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private final ArrayList<String> historico;

    public Produto(String nome, int qtdeEstoque, float precoUnit, int estoqueMinimo, int estoqueMaximo) {
        this.setNome(nome);
        this.setQtdeEstoque(qtdeEstoque);
        this.setPrecoUnit(precoUnit);
        this.setEstoqueMinimo(estoqueMinimo);
        this.setEstoqueMaximo(estoqueMaximo);
        this.historico = new ArrayList<String>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setQtdeEstoque(int qtdeEstoque) {
        if( qtdeEstoque < 0 ) {
            throw new IllegalArgumentException("Quantidade estoque invalida");
        }
        this.qtdeEstoque = qtdeEstoque;
    }
    public int getQtdeEstoque() {
        return this.qtdeEstoque;
    }
    public void setPrecoUnit(float precoUnit) {
        if( precoUnit <= 0 ) {
            throw new IllegalArgumentException("Preco unitario invalido");
        }
        this.precoUnit = precoUnit;
    }
    public float getPrecoUnit() {
        return this.precoUnit;
    }
    public void setEstoqueMinimo(int estoqueMinimo) {
        if( estoqueMinimo < 0 ) {
            throw new IllegalArgumentException("Estoque minimo invalido");
        }
        this.estoqueMinimo = estoqueMinimo;
    }
    public int getEstoqueMinimo() {
        return this.estoqueMinimo;
    }
    public void setEstoqueMaximo(int estoqueMaximo) {
        if( estoqueMaximo < 1 ) {
            throw new IllegalArgumentException("Estoque maximo invalido");
        }
        this.estoqueMaximo = estoqueMaximo;
    }
    public int getEstoqueMaximo() {
        return this.estoqueMaximo;
    }

    public void debitarEstoque(int quantidade) {
        this.setQtdeEstoque(this.qtdeEstoque - quantidade);
    }
    public void creditarEstoque(int quantidade) {
        this.setQtdeEstoque(this.qtdeEstoque + quantidade);
    }
    public boolean verificarEstoqueBaixo() {
        return this.qtdeEstoque < this.estoqueMinimo;
    }
    public boolean verificarEstoqueInsuficiente(int quantidade) {
        return this.qtdeEstoque < quantidade;
    }
    public boolean verificarEstoqueExcedente(int quantidade) {
        return (this.qtdeEstoque + quantidade) > this.estoqueMaximo;
    }

    public float calcularValorVenda(int quantidade) {
        return this.precoUnit*quantidade;
    }
    public void vender(String dataVenda, Cliente cliente, int qtdeVendida) {
        Venda venda = new Venda(dataVenda, this, qtdeVendida);
        String info = venda.vender();
        this.registrarHistorico("-- Venda --" + this.nome + " " + info);
        if(this.verificarEstoqueBaixo()) {
            throw new RuntimeException("Estoque abaixo do minimo");
        }
    }
    public void comprar(String dataCompra, Fornecedor fornecedor, int qtdeComprada) {
        Compra compra = new Compra(dataCompra, this, qtdeComprada);
        String info = compra.comprar();
        this.registrarHistorico("-- Compra --" + this.nome + " " + info);

    }

    public void registrarHistorico(String registro) {
        this.historico.add(registro);
    }
    public ArrayList<String> exibirHistorico() {
        return this.historico;
    }
}
