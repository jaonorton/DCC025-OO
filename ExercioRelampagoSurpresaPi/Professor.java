package exrcPI;

public class Professor extends Pessoa {

    private Curso contratacao;

    public Professor(Escolaridade escolaridade) {
        super(escolaridade);
    }

    public Curso getContratacao() {
        return this.contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String getTipoEnsinoContratacao() {
        if (this.contratacao == null) {
            throw new NullPointerException("Professor sem contratação");
        }
        return this.contratacao.getNomeTipoEnsino();
    }

    public String getNomeDiretorEscola(){
        if (this.contratacao == null) {
            throw new NullPointerException("Professor sem contratação");
        }
        return this.contratacao.getNomeDiretor();
    }

    public String getNomeCoordenadorCurso(){
        if (this.contratacao == null) {
            throw new NullPointerException("Professor sem contratação");
        }
        return this.contratacao.getNomeCoordenadorCurso();
    }

}
