package exrcPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetonarEscolaridadeCoordenador() {
        Escolaridade escolaridade = new Escolaridade();
        Professor professor = new Professor(escolaridade);
        Curso curso = new Curso(professor);
        escolaridade.setDescricao("Mestrado");

        assertEquals("Mestrado", curso.getDescricaoEscolaridadeCoordenador());
    }

    @Test
    public void deveRetornarExcecaoCursoSemCoordenadorEscolaridade() {
        try {
            Curso curso = new Curso();
            curso.getDescricaoEscolaridadeCoordenador();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Curso sem coordenador", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEstadoCurso() {
        Cidade cidade = new Cidade("Espera Feliz", new Estado("MG"));
        Curso curso = new Curso();
        Escola escola = new Escola();
        escola.setCidade(cidade);
        curso.setEscola(escola);
        assertEquals("MG", curso.retornaEstadoCurso());
    }

    @Test
    public void deveRetornarExcecaoCursoSemEscola() {
        try {
            Curso curso = new Curso();
            curso.retornaEstadoCurso();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Curso sem escola", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Fundamental");
        Curso curso = new Curso();
        curso.setTipoEnsino(tipoEnsino);

        assertEquals("Ensino Fundamental", curso.getNomeTipoEnsino());
    }

    @Test
    public void deveRetornarExcecaoCursoSemTipoEnsino() {
        try {
            Curso curso = new Curso();
            curso.getNomeTipoEnsino();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Curso sem tipo de ensino", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeCoordenador(){
        Curso curso = new Curso();
        Professor coordenador = new Professor(new Escolaridade("PHD"));
        curso.setCoordenador(coordenador);
        coordenador.setNome("Almir");

        assertEquals("Almir", curso.getNomeCoordenadorCurso());
    }

    @Test
    public void deveRetornarExcecaoCursoSemCoordenador() {
        try {
            Curso curso = new Curso();
            curso.getNomeCoordenadorCurso();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Curso sem coordenador", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeDiretor(){
        Curso curso = new Curso();
        Professor diretor = new Professor(new Escolaridade("Doutorado"));
        Escola escola = new Escola(diretor);
        diretor.setNome("Thiago");
        curso.setEscola(escola);

        assertEquals("Thiago", curso.getNomeDiretor());
    }

    @Test
    public void deveRetornarExcecaoCursoSemEscolaDiretor() {
        try {
            Curso curso = new Curso();
            curso.getNomeDiretor();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Curso sem escola", e.getMessage());
        }
    }

}