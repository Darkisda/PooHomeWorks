package polimorfismo;

public class Conta {
    private int numConta;
    private double saldo;

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public boolean sacar(double valor){
        if(valor < this.saldo) {
            saldo -= valor;
            System.out.println("Saque no valor de R$ " + valor + " concluido com sucesso");
            return  true;
        }
        else {
            System.out.println("Você nao possui este valor para saque");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta{" + "numConta=" + numConta + ", saldo=" + saldo + '}';
    }
    
}
