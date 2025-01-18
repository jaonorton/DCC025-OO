import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class PessoaTest
{
    private Pessoa pessoa;
    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
    }
    @Test
    public void deveRetornarSexoMasculino(){
        pessoa.setSexo("Masculino");
        assertEquals("Masculino", pessoa.getSexo());
    }
    @Test
    public void deveRetornarSexoFeminino(){
        pessoa.setSexo("Feminino");
        assertEquals("Feminino", pessoa.getSexo());
    }
    @Test
    public void testeDeveRetornarExcecaoSexoInvalido(){
        try{
            pessoa.setSexo("a");
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Sexo invalido", e.getMessage());
        }
    }
}
    
