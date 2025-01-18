package ExcRelampagoSurpresa934;

public class Funcionario {

    private String nome;
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public Funcionario(Escolaridade escolaridade, Departamento alocacao) {
        this.escolaridade = escolaridade;
        this.alocacao = alocacao;
    }

    public String getNome() {
        return this.nome;
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

    public Departamento getAlocacao() {
        return this.alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return this.coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getPaisAlocacaoFuncionario(){
        return alocacao.getEmpresa().getGrupo().getSede().getNome();
    }
    public String getEstadoFilialCoordena(){
	if (this.coordenacao == null) {
            return "Funcionario nao é coordenador";
        }
        return coordenacao.getCidade().getEstado().getNome();
    }
	
    public String getNomeEscolaridadeFuncionario() {
        return this.escolaridade.getNome();
    }

}
