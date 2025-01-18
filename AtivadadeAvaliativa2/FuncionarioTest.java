package ExercicioNatal;
// João Pedro Ribeiro Norton | 202265051AC

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarSalarioLiquidoSemAlteracao(){
        Funcionario funcionario = new Funcionario("Joao");
        Cargo cargo = new Cargo();
        cargo.setSalarioBruto(1000.00f);
        funcionario.setCargo(cargo);
        assertEquals(1000.0f,  funcionario.calcularSalarioLiquido(1,1));
    }

    @Test
    void deveRetornarSalarioLiquidoComDependente(){
        TesteData dataNascimento = new TesteData(new Date());
        dataNascimento(dataNascimento.converterStringParaData("01/01/2003"));
        Dependente dependente = new Dependente("Joao", dataNascimento);
        Funcionario funcionario = new Funcionario("Jeane");
        funcionario.setDependente(dependente);
        Cargo cargo = new Cargo();
        cargo.setSalarioBruto(1000.0f);
        funcionario.setCargo(cargo);
        assertEquals(1100.0f, funcionario.calcularSalarioLiquido(12,2023));
    }

    @Test
    void deveRetornarNomeDependentes(){
        Dependente dependente1 = new Dependente("Joao", new TesteData(new Date()));
        Dependente dependente2 = new Dependente("Leticia", new TesteData(new Date()));
        Funcionario funcionario = new Funcionario("Jeane");
        funcionario.setDependente(dependente1);
        funcionario.setDependente(dependente2);
        List<String> nomes = Arrays.asList("Joao", "Leticia");
        assertEquals(nomes, funcionario.exibirNomeDependentes());
    }
}