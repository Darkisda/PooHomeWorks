
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
        System.out.println("---Menu Imobiliaria---\n1 - Cadastrar Imovel\n2 - Alugar Imovel\n3 - Sair");
    }
    
    private void cadastrarImovel(){
        System.out.println("===Cadastrar Imovel===\n1 - Residencia\n2 - Comercial");
    }
    
    private void alugarImovel(){
        int flag =0;
        System.out.println("===Nossos Imoveis===");
        listarImoveis();
        
        System.out.println("-Qual Imovel gostaria de alugar?-");
        codigo = entrada.nextInt();
        
        if(imoveis.get(codigo) instanceof Comercial){
            if(((Comercial)imoveis.get(codigo)).isDisponivel() == true){
                ((Comercial)imoveis.get(codigo)).setDisponivel(false);
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
