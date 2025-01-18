import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTeste
{
   @Test
   void testeSemAcrescimoSemDesconto(){
       Funcionario funcionario = new Funcionario();
       funcionario.setNome("Joao");
       funcionario.setSalarioBruto(1000.0f);
       funcionario.setTotalAcrescimo(0.0f);
       funcionario.setTotalDesconto(0.0f);
       assertEquals(1000.0f, funcionario.calcularSalarioLiquido());
   }
   @Test
   void testeSemAcrescimoComDesconto(){
       Funcionario funcionario = new Funcionario();
       funcionario.setNome("Joao");
       funcionario.setSalarioBruto(1000.0f);
       funcionario.setTotalAcrescimo(0.0f);
       funcionario.setTotalDesconto(9.99f);
       assertEquals(990.01f, funcionario.calcularSalarioLiquido());
   }
   @Test
   void testeComAcrescimoSemDesconto(){
       Funcionario funcionario = new Funcionario();
       funcionario.setNome("Joao");
       funcionario.setSalarioBruto(1000.0f);
       funcionario.setTotalAcrescimo(0.01f);
       funcionario.setTotalDesconto(0.0f);
       assertEquals(1000.01f, funcionario.calcularSalarioLiquido());
   }
   @Test
   void testeComAcrescimoComDesconto(){
       Funcionario funcionario = new Funcionario();
       funcionario.setNome("Joao");
       funcionario.setSalarioBruto(1000.0f);
       funcionario.setTotalAcrescimo(42.01f);
       funcionario.setTotalDesconto(0.50f);
       assertEquals(1041.51f, funcionario.calcularSalarioLiquido());
   }

    @Test
    public void teste()
    {
    }
}

