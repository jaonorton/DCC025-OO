package ExercicioNatal;
// João Pedro Ribeiro Norton | 202265051AC

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome==null){
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
        this.nome = nome;
    }
}
