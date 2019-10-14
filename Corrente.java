
package polimorfismo;

public class Corrente extends Conta {
    private double tarifa;

    public Corrente(double tarifa, int numConta, double saldo) {
        super(numConta, saldo);
        this.tarifa = tarifa;
    }
    
    public void debitaTarifa(){
        this.tarifa = super.getSaldo() * 0.85;
    }

    @Override
    public String toString() {
        return "Corrente{" + "tarifa=" + tarifa + '}';
    }
}