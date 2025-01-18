package ExcRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    public void deveRetronarEscolaridadePresidente() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Funcionario presidente = new Funcionario(escolaridade, new Departamento(new Empresa(new Grupo(new Pais()))));
        Grupo grupo = new Grupo(new Pais());
        grupo.setPresidente(presidente);
        assertEquals("Mestrado", grupo.getPresidente().getEscolaridade().getGrau());
    }
}