package ExcRelampagoSurpresa934;

public class Empresa {

    private Grupo grupo;
    private Funcionario diretor;

    public Empresa(Grupo grupo) {
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Funcionario getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public String getNomeDiretor() {
        return this.diretor.getNome();
    }
}
