
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoGraduacaoTest
{
    AlunoGraduacao alunoGraduacao;
    @BeforeEach
    public void setUp()
    {
        alunoGraduacao = new AlunoGraduacao();
    }
    @Test
    public void deveRetornarNota1(){
        alunoGraduacao.setNota1(5);
        assertEquals(5, alunoGraduacao.getNota1());
    }
    @Test
    public void deveRetornarNota2(){
        alunoGraduacao.setNota2(5);
        assertEquals(5, alunoGraduacao.getNota2());
    }
    @Test
    public void testeDeveRetornarExcecaoNota1Invalido(){
        try{
            alunoGraduacao.setNota1(11);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Nota invalida", e.getMessage());
        }
    }
    @Test
    public void testeDeveRetornarExcecaoNota2Invalido(){
        try{
            alunoGraduacao.setNota2(11);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Nota invalida", e.getMessage());
        }
    }
    @Test
    public void deveRetornarAprovado(){
        alunoGraduacao.setNota1(7);
        alunoGraduacao.setNota2(7);
        assertEquals(true, alunoGraduacao.verificaAprovacao());
    }
    @Test
    public void deveRetornarReprovado(){
        alunoGraduacao.setNota2(6);
        alunoGraduacao.setNota2(6);
        assertEquals(false, alunoGraduacao.verificaAprovacao());
    }

}
