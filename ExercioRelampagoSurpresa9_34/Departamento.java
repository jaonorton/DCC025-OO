package ExcRelampagoSurpresa934;

public class Departamento {

    private Empresa empresa;
    private Funcionario chefe;

    public Departamento(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return this.chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public String getEscolaridadeChefe(){
	return this.chefe.getNomeEscolaridadeFuncionario();
    }

}
