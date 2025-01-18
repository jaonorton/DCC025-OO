package exrcPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetonarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Bacharel");
        Professor professor = new Professor(escolaridade);

        assertEquals("Bacharel", professor.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarExcecaoParaProfessorSemEscolaridade() {
        try {
            Professor professor = new Professor(null);
            professor.getDescricaoEscolaridade();
            fail();
        } catch (NullPointerException e){
            assertEquals("Pessoa sem escolaridade", e.getMessage());
        }
    }

    @Test
    void deveRetornarCidadeNaturalidadeProfessor() {
        Professor professor = new Professor(new Escolaridade("Doutor"));
        Cidade cidade = new Cidade("Espera Feliz", new Estado("MG"));
        professor.setNaturalidade(cidade);

        assertEquals("Espera Feliz", professor.getNomeCidade());
    }

    @Test
    void deveRetornarExcecaoParaProfessorSemNaturalidade() {
        try {
            Professor professor = new Professor(new Escolaridade("Mestre"));
            professor.getNomeCidade();
            fail();
        } catch (NullPointerException e){
            assertEquals("Pessoa sem naturalidade", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoEnsinoProfessorLeciona() {
        Professor professor = new Professor(new Escolaridade("Mestre"));
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Médio");
        curso.setTipoEnsino(tipoEnsino);
        professor.setContratacao(curso);

        assertEquals("Ensino Médio", professor.getTipoEnsinoContratacao());
    }

    @Test
    void deveRetornarExcecaoParaProfessorSemContratacao() {
        try {
            Professor professor = new Professor(new Escolaridade("Mestre"));
            professor.getTipoEnsinoContratacao();
            fail();
        } catch (NullPointerException e){
            assertEquals("Professor sem contratação", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretorEscola() {
        Professor professor = new Professor(new Escolaridade("Doutor"));
        Professor diretor = new Professor(new Escolaridade("Doutorr"));
        diretor.setNome("Marcio");
        Curso curso = new Curso();
        Escola escola = new Escola(diretor);
        curso.setEscola(escola);
        professor.setContratacao(curso);

        assertEquals("Marcio", professor.getNomeDiretorEscola());
    }

    @Test
    void deveRetornarExcecaoParaProfessorSemContratacaoDiretorEscola() {
        try {
            Professor professor = new Professor(new Escolaridade("Doutor"));
            professor.getNomeDiretorEscola();
            fail();
        } catch (NullPointerException e){
            assertEquals("Professor sem contratação", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeCoordenadorCurso() {
        Professor professor = new Professor(new Escolaridade("Bacharel"));
        Professor coordenador = new Professor(new Escolaridade("Bacharel"));
        coordenador.setNome("Leo");
        Curso curso = new Curso();
        curso.setCoordenador(coordenador);
        professor.setContratacao(curso);

        assertEquals("Leo", professor.getNomeCoordenadorCurso());
    }

    @Test
    void deveRetornarExcecaoParaProfessorSemCoordenadorCurso() {
        try {
            Professor professor = new Professor(new Escolaridade("Bacharel"));
            professor.getNomeCoordenadorCurso();
            fail();
        } catch (NullPointerException e){
            assertEquals("Professor sem contratação", e.getMessage());
        }
    }

}