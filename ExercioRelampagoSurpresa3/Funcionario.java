public class Funcionario
{
    private String nome;
    private float salarioBruto;
    private float totalAcrescimo;
    private float totalDesconto;
    private float salarioLiquido;
            
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setSalarioBruto(float salarioBruto)
    {
        this.salarioBruto = salarioBruto;
    }
    public float getSalarioBruto()
    {
        return this.salarioBruto;
    }
    public void setTotalAcrescimo(float totalAcrescimo)
    {
        this.totalAcrescimo = totalAcrescimo;
    }
    public float getTotalAcrescimo()
    {
        return this.totalAcrescimo;
    }
    public void setTotalDesconto(float totalDesconto)
    {
        this.totalDesconto = totalDesconto;
    }
    public float getTotalDesconto()
    {
        return this.totalDesconto;
    }
    public void setSalarioLiquido(float salarioLiquido)
    {
        this.salarioLiquido = salarioLiquido;
    }
    public float getSalarioLiquido()
    {
        return this.salarioLiquido;
    }
    public float calcularSalarioLiquido(){
        salarioLiquido = salarioBruto + totalAcrescimo - totalDesconto;
        return salarioLiquido;
    }
    
}
