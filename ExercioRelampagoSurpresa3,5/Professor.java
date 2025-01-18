public class Professor extends Pessoa
{
    private String titulacaoMaxima;
    
    public void setTitulacaoMaxima(String titulacaoMaxima){
        if(!(titulacaoMaxima.equals("Bacharelado") || titulacaoMaxima.equals("Mestrado") || titulacaoMaxima.equals("Doutorado"))){
            throw new IllegalArgumentException("Titulacao invalida");
        }
        this.titulacaoMaxima = titulacaoMaxima;
     }
    public String getTitulacaoMaxima(){
        return titulacaoMaxima;
    }
}
