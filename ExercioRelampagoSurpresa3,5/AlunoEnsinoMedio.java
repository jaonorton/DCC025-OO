public class AlunoEnsinoMedio extends Aluno
{
    public boolean verificaAprovacao(){
        int media = (nota1 + nota2) / 2;
        if( media >= 6){
            aprovado = true;
        }
        else{
            aprovado = false;
        }
        return aprovado;
    }
}
