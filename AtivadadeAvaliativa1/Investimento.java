package Class;

public class Investimento extends CarteiraInvestimento{
    public void investir(float valor) {
        if(valor<=0){
            throw new IllegalArgumentException("Não é possível investir negativo ou 0");
        }
        this.saldo = this.saldo + valor;

    }
    public void resgatar(float valor) {
        if(valor<=0){
            throw new IllegalArgumentException("Não é possível resgatar negativo ou 0");
        }
        float taxa = valor * 0.01f;
        if (this.saldo < valor){
            throw new IllegalArgumentException("Valor sacado é maior que o saldo");
        }
        if(this.saldo - valor < taxa){
            throw new IllegalArgumentException("Não tem saldo para a taxa de saque");
        }
        this.saldo = this.saldo - valor - taxa;

    }
}
