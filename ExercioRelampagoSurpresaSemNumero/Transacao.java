package ExcRelampagoSemN;

public abstract class Transacao {
    private String dataTransacao;
    private int qtde;
    private Produto produto;

    public Transacao(String dataTransacao, Produto produto, int qtde) {
        this.setDataTransacao(dataTransacao);
        this.setQtde(qtde);
        this.setProduto(produto);
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }
    public String getDataTransacao() {
        return this.dataTransacao;
    }
    public void setQtde(int qtde) {
        if( qtde < 1 ) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this.qtde = qtde;
    }
    public int getQtde() {
        return this.qtde;
    }
    public void setProduto(Produto produto) {
        if( produto == null ) {
            throw new IllegalArgumentException("Produto invalido");
        }
        this.produto = produto;
    }
    public Produto getProduto() {
        return this.produto;
    }
}
