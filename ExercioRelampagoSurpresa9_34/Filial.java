package ExcRelampagoSurpresa934;

public class Filial {

    private Cidade cidade;
    private Empresa empresa;

    public Filial(Cidade cidade, Empresa empresa) {
        this.cidade = cidade;
        this.empresa = empresa;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
s
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNomeDiretorEmpresa() {
        return this.empresa.getNomeDiretor();
    }
}
