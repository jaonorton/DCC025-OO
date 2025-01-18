import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfessorTest
{
    private Professor professor;
    @BeforeEach
    public void setUp()
    {
        professor = new Professor();
    }
    @Test
    public void deveRetornarBacharelado(){
        professor.setTitulacaoMaxima("Bacharelado");
        assertEquals("Bacharelado", professor.getTitulacaoMaxima());
    }
    @Test
    public void deveRetornarSexoMestrado(){
        professor.setTitulacaoMaxima("Mestrado");
        assertEquals("Mestrado", professor.getTitulacaoMaxima());
    }
    @Test
    public void deveRetornarSexoDoutorado(){
        professor.setTitulacaoMaxima("Doutorado");
        assertEquals("Doutorado", professor.getTitulacaoMaxima());
    }
    @Test
    public void testeDeveRetornarExcecaoTitularidadeInvalido(){
        try{
            professor.setTitulacaoMaxima("a");
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Titulacao invalida", e.getMessage());
        }
    }
}
