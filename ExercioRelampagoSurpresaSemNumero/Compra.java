package ExcRelampagoSemN;

public class Compra extends Transacao {
    public Compra(String dataCompra, Produto produto, int qtdeComprada) {
        super(dataCompra, produto, qtdeComprada);
    }

    public String comprar() {
        if(this.getProduto().verificarEstoqueExcedente(this.getQtde())) {
            throw new RuntimeException("Estoque maior do que maximo - compra nao realizada");
        }
        this.getProduto().creditarEstoque(this.getQtde());
        return "Valor da compra: " + this.getProduto().getPrecoUnit()*this.getQtde();
    }
}
