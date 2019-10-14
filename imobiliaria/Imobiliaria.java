
package imobiliaria;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Luan
 */
public class Imobiliaria {
    
    private Scanner entrada = new Scanner(System.in);
    private ArrayList<Imovel> imoveis = new ArrayList();
    private int codigo = 0;
    
    public void menu(){
        int opcao;
        do{
            System.out.println("---Menu Imobiliaria---\n1 - Cadastrar Imovel\n2 - Alugar Imovel\n3 - Sair");
            opcao = entrada.nextInt();
        
            switch(opcao){
                case 1:
                    cadastrarImovel();
                    break;

                case 2:
                    alugarImovel();
                    break;

                case 3:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Tecla errada");
                    break;
            }
        }while(opcao != 3);
    }
    
    private void cadastrarImovel(){
        int opcao;
        String regiao;
        double valorImovel;
        int numQuartos;
        double areaUtil;
       
            System.out.println("===Cadastrar Imovel===\n1 - Residencia\n2 - Comercial\n3 - Sair");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("--Qual a regiao?--");
                    regiao = entrada.next();
                    System.out.println("--Qual o valor?--");
                    valorImovel = entrada.nextDouble();
                    System.out.println("--Quantidade de quartos?--");
                    numQuartos = entrada.nextInt();
                    imoveis.add(new Residencial(numQuartos, codigo, regiao, valorImovel, true));
                    System.out.println("Imovel Residencial adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("--Qual a regiao?--");
                    regiao = entrada.next();
                    System.out.println("--Qual o valor?--");
                    valorImovel = entrada.nextDouble();
                    System.out.println("--Qual a area util?--");
                    areaUtil = entrada.nextDouble();
                    imoveis.add(new Comercial(areaUtil, codigo, regiao, valorImovel, true));
                    System.out.println("Imovel Comercial adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("Voltando....");
                    break;
                    
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        
        codigo++;
    }
    
    private void alugarImovel(){
        if(listarImoveis()){
            System.out.println("===Nossos Imoveis===");
            
            System.out.println("-Qual Imovel gostaria de alugar?-");
            codigo = entrada.nextInt();
        
            if(imoveis.get(codigo) instanceof Comercial){
                if(((Comercial)imoveis.get(codigo)).isDisponivel() == true){
                    ((Comercial)imoveis.get(codigo)).setDisponivel(false);
                    System.out.println("Imovel alugado com sucesso");
                }else {
                    System.out.println("Imovel nao disponivel");
                }
            }
            
            if(imoveis.get(codigo) instanceof Residencial) {
                if(((Residencial)imoveis.get(codigo)).isDisponivel() == true){
                    ((Residencial)imoveis.get(codigo)).setDisponivel(false);
                    System.out.println("Imovel alugado com sucesso");
                }else {
                    System.out.println("Imovel nao disponivel");
                }
            }
        }
    }
    
    private boolean listarImoveis(){
        if(imoveis.isEmpty()){
            System.out.println("Não tem Imoveis cadastrados");
            return false;
        }else {
            for(Object imovel : imoveis){
                System.out.println(imovel.toString());
            }
            return true;
        }
    }
}
