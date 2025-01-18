package exrcPI; 

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoAluno() {
        Aluno aluno = new Aluno(new Escolaridade("Ensino superior"));
        Cidade cidade = new Cidade("Espera Feliz", new Estado("MG"));
        aluno.setCidade(cidade);

        assertEquals("MG", aluno.getEstadoCidade());
    }

    @Test
    void deveRetornarExcecaoAlunoSemEstado() {
        try {
            Aluno aluno = new Aluno(new Escolaridade("Ensino Médio"));
            aluno.getEstadoCidade();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Pessoa sem estado", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoAlunoEstuda() {
        Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
        Curso curso = new Curso();
        Escola escola = new Escola();
        Cidade cidade = new Cidade("Carangola", new Estado("MG"));
        escola.setCidade(cidade);
        curso.setEscola(escola);
        aluno.setCurso(curso);

        assertEquals("MG", aluno.retornaEstadoEscolaAluno());
    }

    @Test
    void deveRetornarExcecaoAlunoSemCurso() {
        try {
            Aluno aluno = new Aluno(new Escolaridade("Ensino Medio"));
            aluno.retornaEstadoEscolaAluno();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Aluno sem curso", e.getMessage());
        }
    }

    @Test
    void deveRetornarCoordenadorCursoAluno() {
        Aluno aluno = new Aluno(new Escolaridade("Ensino Medio"));
        Curso curso = new Curso();
        Professor professorCoordenador = new Professor(new Escolaridade("Bacharel"));
        professorCoordenador.setNome("Marcio");
        curso.setCoordenador(professorCoordenador);
        aluno.setCurso(curso);

        assertEquals("Marcio", aluno.getNomeCoordenadorCursoAluno());
    }

    @Test
    void deveRetornarExcecaoAlunoSemCoordenadorCurso() {
        try {
            Aluno aluno = new Aluno(new Escolaridade("Ensino Primario"));
            aluno.getNomeCoordenadorCursoAluno();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Aluno sem curso", e.getMessage());
        }
    }

}