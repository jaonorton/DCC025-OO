package Class;

public abstract class CarteiraInvestimento {
    int numeroCarteira;
    float saldo = 0.0f;

    public int getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(int numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo<0){
            throw new IllegalArgumentException("Saldo não pode ser negativo");
        }
        this.saldo = saldo;
    }

    public abstract void investir(float valor);
    public abstract void resgatar(float valor);
}
