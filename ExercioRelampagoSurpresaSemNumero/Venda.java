package ExcRelampagoSemN;

public class Venda extends Transacao {
    public Venda(String dataVenda, Produto produto, int qtdeVendida) {
        super(dataVenda, produto, qtdeVendida);
    }
    public String vender() {
        if(this.getProduto().verificarEstoqueInsuficiente(this.getQtde())) {
            throw new RuntimeException("Venda nao realizada");
        }
        this.getProduto().debitarEstoque(this.getQtde());
        return "Valor da venda: " + this.getProduto().getPrecoUnit()*this.getQtde();
    }
}
