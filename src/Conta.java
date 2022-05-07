import javax.management.InvalidAttributeValueException;

public class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) throws InvalidAttributeValueException {
        if(valor <= 0) {
            throw new InvalidAttributeValueException();
        }
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
