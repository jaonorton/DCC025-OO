package exrcPI;

public class Pessoa {

    private String nome;
    private Escolaridade escolaridade;
    private Cidade cidade

    public Pessoa(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade{
        this.naturalidade = naturalidade;
    }

    public String getGrauEscolaridade() {
        if (this.escolaridade == null) {
            throw new NullPointerException("Não possui escolaridade");
        }
        return this.escolaridade.getGrau();
    }

    public String getEstadoCidade() {
        if (this.cidade == null){
            throw new NullPointerException("Pessoa sem estado");
        }
        return this.cidade.getNomeEstado();
    }

    public String getNomeCidade() {
        if (this.cidade == null){
            throw new NullPointerException("Pessoa sem cidade");
        }
        return this.cidade.getNome();
    }

}
