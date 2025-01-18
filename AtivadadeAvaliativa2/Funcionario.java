package ExercicioNatal;
// João Pedro Ribeiro Norton | 202265051AC

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa{

    private List<Dependente> dependentes;
    private List<Ocorrencia> ocorrencias;
    private Cargo cargo;

    public Funcionario(String nome) {
        super(nome);
        dependentes = new ArrayList<Dependente>();
        ocorrencias = new ArrayList<Ocorrencia>();
    }

    public List<Dependente> getDependente() {
        return this.dependentes;
    }

    public void setDependente(Dependente dependente) {
        this.dependentes.add(dependente);
    }

    public List<Ocorrencia> getOcorrencias() {
        return this.ocorrencias;
    }

    public void setOcorrencias(Ocorrencia ocorrencia) {
        this.ocorrencias.add(ocorrencia);
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public float getSalarioBruto(){
        return this.cargo.getSalarioBruto();
    }

    // Professor, não soube commo usar o TesteData por isso não consegui desenvoler algumas partes

    public float calcularSalarioLiquido(int mes, int ano){
        float salarioLiquido = this.getSalarioBruto();
        for (Dependente dependente : this.dependentes) {
            if (true){ //comparar data
                salarioLiquido += 100.00f;
            }

        }
        for (Ocorrencia ocorrencia : this.ocorrencias){
            if(true){ //comparar data
                salarioLiquido = salarioLiquido + ocorrencia.getValorAcrescimo();
                salarioLiquido = salarioLiquido + ocorrencia.getValorDesconto();
            }
        }
        return salarioLiquido;
    }

    public List<String> exibirNomeDependentes(){
        if(this.dependentes == null){
            throw new IllegalArgumentException("Não há dependetes");
        }
        List<String> nomeDependentes = new ArrayList<String>();
        for (Dependente dependente : this.dependentes) {
            nomeDependentes.add(dependente.getNome());
        }
        return nomeDependentes;
    }
    public List<String> exibirDataAniversárioDependentes(){
        if(this.dependentes == null){
            throw new IllegalArgumentException("Não há dependetes");
        }
        List<String> aniversarioDependentes = new ArrayList<String>();
        for (Dependente dependente : this.dependentes) {
            aniversarioDependentes.add(dependente.getNome());
        }
        return aniversarioDependentes;
    }
}
