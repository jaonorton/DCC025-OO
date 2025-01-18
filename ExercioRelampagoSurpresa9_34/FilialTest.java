package ExcRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetonarNomeDiretorEmpresaFilial() {
        Funcionario funcionario = new Funcionario(new Escolaridade("Mestre"), new Departamento(new Empresa(new Grupo(new Pais()))));
	funcionario.setNome("Joao");
        Empresa empresa = new Empresa(new Grupo(new Pais()))));
        empresa.setDiretor(funcionario);
        Filial filial = new Filial(new Cidade(new Estado()), empresa);
        filial.setEmpresa(empresa);

        assertEquals("Joao", filial.getNomeDiretorEmpresa());
    }

}