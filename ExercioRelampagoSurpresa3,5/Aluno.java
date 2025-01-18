public abstract class Aluno extends Pessoa
{
    private int matricula;
    protected int nota1;
    protected int nota2;
    protected boolean aprovado;

    public void setMatricula(int matricula){
         this.matricula = matricula;
     }
    public int getMatricula(){
        return matricula;
    }
    
    public void setNota1(int nota1){
        if(nota1 < 0 || nota1 > 10){
            throw new IllegalArgumentException("Nota invalida");
        }
        this.nota1 = nota1;
     }
    public int getNota1(){
        return nota1;
    }
    
    public void setNota2(int nota2){
         if(nota2 < 0 || nota2 > 10){
            throw new IllegalArgumentException("Nota invalida");
        }
        this.nota2 = nota2;
     }
    public int getNota2(){
        return nota2;
    }
    
    public void setAprovado(boolean aprovado){
         this.aprovado = aprovado;
     }
    public boolean getAprovado(){
        return aprovado;
    }
}
