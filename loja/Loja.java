
package loja;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Loja {
    
    private Scanner entrada = new Scanner(System.in);
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    public void menu(){
        int opcao;
        
        do{
            System.out.println("--Loja--\n1 - Cadastrar Pessoas\t2 - Remover\t3 - Buscar Pessoa\n4 - Adicionar Produtividade\t5 - Gerar Folha de Pagamento\t6 - Mostrar Pessoas\n7 - Sair");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    cadastrar();
                    break;
                    
                case 2:
                    remover();
                    break;
                    
                case 3:
                    buscar();
                    break;
                    
                case 4:
                    adicionarProdutividade();
                    break;
                    
                case 5:
                    gerarFolhaPagamento();
                    break;
                
                case 6:
                    listar();
                    break;
                    
                case 7:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Tecla invalida insira novamente uma válida");
                    break;
            }
        }while(opcao != 7);
    }
    
    private void cadastrar(){
        int opcao, matricula;
        String cpf, nome, codigo;
        double salario;
        
        do{
            System.out.println("==Cadastrar==\n1 - Cliente\t2 - Administrativo\n3 - Vendedor\t4 - Voltar");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Insira o nome do cliente:");
                    nome = entrada.next();
                    System.out.println("Insira o CPF do cliente");
                    cpf = entrada.next();
                    System.out.println("Insira o Codigo do cliente");
                    codigo = entrada.next();
                    
                    pessoas.add(new Cliente(codigo, nome, cpf));
                    break;
                
                case 2:
                    System.out.println("Insira o nome do administrador:");
                    nome =  entrada.next();
                    System.out.println("Insira o CPF do administrador:");
                    cpf = entrada.next();
                    System.out.println("Insira a Matricula do administrador:");
                    matricula = entrada.nextInt();
                    System.out.println("Insira o Salario do administrador:");
                    salario = entrada.nextDouble();
                    
                    pessoas.add(new Administrativo(matricula, salario, nome, cpf));
                    break;
                    
                case 3:
                    System.out.println("Insira o nome do vendedor:");
                    nome = entrada.next();
                    System.out.println("Insira o CPF do vendedor:");
                    cpf = entrada.next();
                    System.out.println("Insira a Matricula do vendedor:");
                    matricula = entrada.nextInt();
                    System.out.println("Insira o Salario do vendedor:");
                    salario = entrada.nextDouble();
                    
                    pessoas.add(new Administrativo(matricula, salario, nome, cpf));
                    break;
                    
                case 4:
                    System.out.println("Voltando....");
                    
                    break;
            }
        }while(opcao != 4);
    }
    
    private void remover(){
        String cpf;
        
        System.out.println("Insira o CPF:");
        cpf = entrada.next();
        
        if(buscar(cpf) != null){
            pessoas.remove(buscar(cpf));
            System.out.println("Removido com Sucesso!");
        }
    }
    
    private void buscar(){
        String cpf;
        System.out.println("Insira o CPF:");
        cpf = entrada.next();
        
        if(buscar(cpf) != null){
            System.out.println(pessoas.get(pessoas.indexOf(buscar(cpf))));
        }
    }
    
    private Pessoa buscar(String cpf){
        for(Pessoa pessoa : pessoas){
            if(pessoa.getCpf().equals(cpf)){
                return pessoa;
            }
        }
        System.out.println("Pessoa nao encontrada");
        return null;
    }
    
    private void listar(){
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa);
        }
    }
    
    private void adicionarProdutividade(){
        String cpf;
        System.out.println("Digite o CPF");
        cpf = entrada.next();
        
        if(buscar(cpf) != null){
            if(buscar(cpf) instanceof Vendedor){
                System.out.println("Insira os valores das vendas");
                ((Vendedor)buscar(cpf)).setVendas(entrada.nextDouble());
            }
            else if(buscar(cpf) instanceof Administrativo){
                System.out.println("Insira o numeros de horas");
                ((Administrativo)buscar(cpf)).setHoras(entrada.nextDouble());
            }
            else if(buscar(cpf) instanceof Cliente){
                System.out.println("Não é um funcionário");
            }
        }
    }
    
    private void gerarFolhaPagamento(){
        for(Pessoa pessoa: pessoas){
            if(pessoa instanceof Vendedor){
                System.out.println("Salario de " + pessoa.getNome() + ": " + ((Vendedor) pessoa).calcPagamento());
            }else if (pessoa instanceof Administrativo){
                System.out.println("Salario de " + pessoa.getNome() + ": " + ((Administrativo) pessoa).calcPagamento());
            }
        }
    }
}
