
package imobiliaria;

/**
 *
 * @author Luan
 */
public class Residencial extends Imovel{
    private int numQuartos;

    public Residencial(int numQuartos, int codigo, String regiao, double valor, boolean disponivel) {
        super(codigo, regiao, valor, disponivel);
        this.numQuartos = numQuartos;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    @Override
    public String toString() {
        return "Residencial{" + "Codigo = " + super.getCodigo() + "Regiao = " + super.getRegiao() + "Valor =  " + super.getValor() + "Numero de Quartos = " + getNumQuartos() + "Disponibilidade = " + super.isDisponivel() +'}';
    }
}
