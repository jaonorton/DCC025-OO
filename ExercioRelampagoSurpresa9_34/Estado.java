package ExcRelampagoSurpresa934;

public class Estado {

    private String nome;
    private Pais pais;

    public Pais getPais() {
        return this.pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado(Pais pais) {
        this.pais = pais;
    }
}
