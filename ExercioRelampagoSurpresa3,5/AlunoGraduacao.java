public class AlunoGraduacao extends Aluno
{
    public boolean verificaAprovacao(){
        int media = (nota1 + nota2) / 2;
        if( media >= 7){
            aprovado = true;
        }
        else{
            aprovado = false;
        }
        return aprovado;
    }
}
