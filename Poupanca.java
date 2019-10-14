package polimorfismo;

public class Poupanca extends Conta {
    private double rendimento;

    public Poupanca(double rendimento, int numConta, double saldo) {
        super(numConta, saldo);
        this.rendimento = rendimento;
    }
    
    public void creditaRendimento() {
        this.rendimento = super.getSaldo() * 1.10;
    }

    @Override
    public String toString() {
        return "Poupanca{" + "rendimento=" + rendimento + '}';
    }
}