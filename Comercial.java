
package imobiliaria;
/**
 *
 * @author Luan
 */
public class Comercial extends Imovel{
    private double areaUtil;

    public Comercial(double areaUtil, int codigo, String regiao, double valor, boolean disponivel) {
        super(codigo, regiao, valor, disponivel);
        this.areaUtil = areaUtil;
    }

    public double getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(double areaUtil) {
        this.areaUtil = areaUtil;
    }

    @Override
    public String toString() {
        return "Comercial{" + "Codigo = " + super.getCodigo() + "Regiao = " + super.getRegiao() + "Valor =  " + super.getValor() + "Area Util = " + getAreaUtil() + "Disponibilidade = " + super.isDisponivel() +'}';
    }
}