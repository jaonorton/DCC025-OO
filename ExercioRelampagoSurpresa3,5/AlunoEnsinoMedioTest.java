import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoEnsinoMedioTest
{
    private AlunoEnsinoMedio alunoEnsinoMedio;
    @BeforeEach
    public void setUp()
    {
        alunoEnsinoMedio = new AlunoEnsinoMedio();
    }
    @Test
    public void deveRetornarNota1(){
        alunoEnsinoMedio.setNota1(5);
        assertEquals(5, alunoEnsinoMedio.getNota1());
    }
    @Test
    public void deveRetornarNota2(){
        alunoEnsinoMedio.setNota2(5);
        assertEquals(5, alunoEnsinoMedio.getNota2());
    }
    @Test
    public void testeDeveRetornarExcecaoNota1Invalido(){
        try{
            alunoEnsinoMedio.setNota1(11);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Nota invalida", e.getMessage());
        }
    }
    @Test
    public void testeDeveRetornarExcecaoNota2Invalido(){
        try{
            alunoEnsinoMedio.setNota2(11);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Nota invalida", e.getMessage());
        }
    }
    @Test
    public void deveRetornarAprovado(){
        alunoEnsinoMedio.setNota1(6);
        alunoEnsinoMedio.setNota2(6);
        assertEquals(true, alunoEnsinoMedio.verificaAprovacao());
    }
    @Test
    public void deveRetornarReprovado(){
        alunoEnsinoMedio.setNota2(5);
        alunoEnsinoMedio.setNota2(5);
        assertEquals(false, alunoEnsinoMedio.verificaAprovacao());
    }
    
}
