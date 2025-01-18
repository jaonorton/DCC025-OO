package ExercicioNatal;
// João Pedro Ribeiro Norton | 202265051AC

public class Cargo {
    private float salarioBruto;

    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        if(salarioBruto<0.0f) {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
        this.salarioBruto = salarioBruto;
    }
}
