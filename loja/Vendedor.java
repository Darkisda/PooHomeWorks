
package loja;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario{
    private double vendas = 0;

    public Vendedor(int matricula, double salario, String nome, String cpf) {
        super(matricula, salario, nome, cpf);
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas += vendas;
    }

    @Override
    public String toString() {
        return "\nNome: "+getNome()+"\tCPF: "+ getCpf()+"\nSalário: R$"+getSalario()+"\tTotal em Vendas: R$"+getVendas();
    }
    
    @Override
    public double calcPagamento(){
        setSalario(getSalario()+ (vendas * 0.10));
        return getSalario();
    }
}
