
package loja;

/**
 *
 * @author Aluno
 */
public class Administrativo extends Funcionario{
    
    private double horas;

    public Administrativo(int matricula, double salario, String nome, String cpf) {
        super(matricula, salario, nome, cpf);
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas += horas;
    }

    @Override
    public String toString() {
        return "\nNome: "+getNome()+"\tCPF: "+ getCpf()+"\nSalário: R$"+getSalario()+"\tHoras: "+getHoras();
    }
    
    @Override
    public double calcPagamento(){
        setSalario(getSalario() + ((getSalario()*0.01)*horas));
        return getSalario();
    }
}
