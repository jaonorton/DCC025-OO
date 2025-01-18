package exrcPI;

public class Curso {

    private Professor coordenador;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public Curso(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public Professor getCoordenador() {
        return this.coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if (coordenador != null) {
            this.coordenador = coordenador;
        }
    }

    public Escola getEscola() {
        return this.escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public TipoEnsino getTipoEnsino() {
        return this.tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getNomeTipoEnsino () {
        if (this.tipoEnsino == null) {
            throw new NullPointerException("Curso sem tipo de ensino");
        }
        return this.tipoEnsino.getNome();
    }

    public String getDescricaoEscolaridadeCoordenador() {
        if (this.coordenador == null) {
            throw new NullPointerException("Curso sem coordenador");
        }
        return this.coordenador.getDescricaoEscolaridade();
    }

    public String retornaEstadoCurso() {
        if (this.escola == null) {
            throw new NullPointerException("Curso sem escola");
        }
        return this.escola.getEstadoEscola();
    }

    public String getNomeCoordenadorCurso() {
        if (this.coordenador == null) {
            throw new NullPointerException("Curso sem coordenador");
        }
        return this.coordenador.getNome();
    }

    public String getNomeDiretor(){
        if (this.escola == null){
            throw new NullPointerException("Curso sem escola");
        }
        return this.escola.getNomeDiretor();
    }
}
