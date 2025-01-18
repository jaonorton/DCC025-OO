package ExcRelampagoSemN;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
}
