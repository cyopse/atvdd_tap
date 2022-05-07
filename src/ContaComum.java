public class ContaComum extends Conta {
    public ContaComum(double saldo) {
        super(saldo);
    }

    public void rende() {
        this.saldo *= 1.1;
    }
}

