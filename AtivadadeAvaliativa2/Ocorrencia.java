package ExercicioNatal;
// João Pedro Ribeiro Norton | 202265051AC

import java.util.Date;

public class Ocorrencia {
    private TesteData dataOcorrencia;
    private float valorAcrescimo;
    private float valorDesconto;
    private String descricaoOcorrencia;

    public Ocorrencia(TesteData dataOcorrencia, String descricaoOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
        this.descricaoOcorrencia = descricaoOcorrencia;
        valorAcrescimo = 0.0f;
        valorDesconto = 0.0f;
    }

    public TesteData getDataOcorrencia() {
        return this.dataOcorrencia;
    }

    public void setDataOcorrencia(TesteData dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public float getValorAcrescimo() {
        return this.valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorDesconto() {
        return this.valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getDescricaoOcorrencia() {
        return this.descricaoOcorrencia;
    }

    public void setDescricaoOcorrencia(String descricaoOcorrencia) {
        this.descricaoOcorrencia = descricaoOcorrencia;
    }
}
