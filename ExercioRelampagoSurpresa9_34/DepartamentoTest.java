package ExcRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test

    void deveRetonarNomeEscolaridadeChefe() {
        Escolaridade escolaridade = new Escolaridade("Mestre");
        Funcionario funcionario = new Funcionario(escolaridade, new Departamento(new Empresa(new Grupo(new Pais()))));
        funcionario.setEscolaridade(escolaridade);
        departamento.setChefe(funcionario);

        assertEquals("Mestre", departamento.getNomeEscolaridadeChefe());
    }


    
}