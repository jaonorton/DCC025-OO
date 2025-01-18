package ExcRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test

    public void deveRetornarPaisAlocacao(){
        Pais sede = new Pais();
        sede.setNome("Brasil");
        Departamento alocação = new Departamento(new Empresa(new Grupo(sede)));
        Funcionario funcionario = new Funcionario(new Escolaridade("Mestre"),alocação);
        assertEquals("Brasil", funcionario.getPaisAlocacaoFuncionario());
    }

    @Test

    public void deveRetornarEstadoCoordenacao(){
        Funcionario funcionario = new Funcionario(new Escolaridade("Bacharel"), new Departamento(new Empresa(new Grupo(new Pais()))));
	Estado estado = new Estado();
	estado.setNome("MG");
        Filial filial = new Filial(new Cidade(estado, new Empresa(new Grupo(new Pais()))));
        Cidade cidade = new Cidade(new Estado("MG"));
        filial.setCidade(cidade);
        funcionario.setCoordenacao(filial);

        assertEquals("MG", funcionario.getNomeEstadoFilialCoordenacao());
    }


    @Test
    void deveRetonarMensagemFuncionarioSemCoordenacao() {
        Funcionario funcionario = new Funcionario(new Escolaridade("Bacharel"), new Departamento(new Empresa(new Grupo(new Pais()))));

        assertEquals("Funcionario nao é coordenador", funcionario.getEstadoFilialCoordena());
    }


}