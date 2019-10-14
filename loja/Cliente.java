
package loja;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa {
    private String codigo;

    public Cliente(String codigo, String nome, String cpf) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Cliente: "+getNome()+"\tCPF: "+getCpf()+"\tCódigo: "+codigo;
    }
}
