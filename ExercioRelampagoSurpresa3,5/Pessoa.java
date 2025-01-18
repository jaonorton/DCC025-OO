public class Pessoa
{
    protected String nome;
    protected String sexo;
    protected int dataNascimento;
    
    public void setNome(String nome){
         this.nome = nome;
     }
    public String getNome(){
        return nome;
    }
    
    public void setDataNascimento(int dataNascimento){
         this.dataNascimento = dataNascimento;
     }
    public int getDataNascimento(){
        return dataNascimento;
    }
    
    public void setSexo(String sexo){
        if(!(sexo.equals("Masculino") || sexo.equals("Feminino"))){
            throw new IllegalArgumentException("Sexo invalido");
        }
        this.sexo = sexo;
    }
    public String getSexo(){
        return this.sexo;
    }
}

