package Class;

public class BolsaValores extends CarteiraInvestimento{
    public void investir(float valor) {
        if(valor<=0){
            throw new IllegalArgumentException("Não é possível investir negativo ou 0");
        }
        if(this.saldo < 50.0f){
            throw new IllegalArgumentException("Não possui saldo suficiente para taxa");
        }
        this.saldo = this.saldo - 50.0f;
        this.saldo = this.saldo + valor;
    }

    public void resgatar(float valor) {
        if(valor<=0){
            throw new IllegalArgumentException("Não é possível resgatar negativo ou 0");
        }
        if (this.saldo < valor){
            throw new IllegalArgumentException("Valor sacado é maior que o saldo");
        }
        this.saldo = this.saldo - valor;
    }
}
