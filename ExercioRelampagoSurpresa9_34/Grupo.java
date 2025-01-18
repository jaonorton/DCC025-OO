package ExcRelampagoSurpresa934;

public class Grupo {
    private Pais sede;
    private Funcionario presidente;

    public Grupo(Pais sede) {
        this.sede = sede;
    }

    public Pais getSede() {
        return this.sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return this.presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getEscolaridadePresidente(){
        return this.presidente.getEscolaridade().getGrau();
    }
}
