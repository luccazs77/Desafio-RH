package DesafioRh;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Funcionario> funcionario = new ArrayList<>();
	        
	        boolean funcionarios = false;
	        boolean rodando = true;
	        while(rodando) {
	        	
	        	  System.out.println("Escolha uma opção:");
	              System.out.println("[1] - Adicionar funcionário");
	              System.out.println("[2] - Listar funcionarios");
	              System.out.println("[3] - Remover funcionário");
	              System.out.println("[4] - Atualizar informações do funcionário");
	              System.out.println("[5] - Pesquisar funcionário");
	              
	              int opcao = scanner.nextInt();

	              switch (opcao) {
	              
	                  case 1:{
	                	  System.out.print("Digite o nome: ");
	                      String nome = scanner.next();

	                      
	                      System.out.print("Digite o email: ");
	                      String email = scanner.next();
	                      
	                      System.out.print("Digite o cpf: ");
	                      int cpf = scanner.nextInt();
	                      
	                      System.out.println("Digite sua idade:");
	                      int idade = scanner.nextInt();
	                      
	                      System.out.println("Digite seu telefone");
	                      double telefone = scanner.nextDouble();

	                      System.out.print("Digite o salário: ");
	                      double salario = scanner.nextDouble();
	                      
	                      Funcionario funcionario1 = new Funcionario();
	                      funcionario1.setNome(nome);
	                      funcionario1.setEmail(email);
	                      funcionario1.setCpf(cpf);
	                      funcionario1.setIdade(idade);
	                      funcionario1.setTelefone(telefone);
	                      funcionario1.setSalario(salario);
	                      
	                      funcionarios = true;
	                      
	                      funcionario.add(funcionario1);
	                   
	                      System.out.println("Funcionário adicionado com sucesso!");
	                  }
	                      break;
	                      
	                  case 2: {
	                	  if (funcionarios) {
	                		  System.out.println("Funcionários listados:");
	                          for (int i = 0; i < funcionario.size(); i++) {
	                              System.out.println("Índice: " + i);
	                              System.out.println("Nome: " + funcionario.get(i).getNome());
	                              System.out.println("cpf: " + funcionario.get(i).getCpf());
	                              System.out.println("email:" + funcionario.get(i).getEmail());
	                              System.out.println("Salário: " + funcionario.get(i).getSalario());
	                              System.out.println("----------------------");
	                          }
	                          
	                      } else {
	                    	  System.out.println("Não há funcionários cadastrados."); 
	                      }
	                	  
	                }
	                  break;
	                  
	                 case 3:{
	                	 System.out.print("Digite o índice do funcionário a ser removido: ");
	              	        int indice = scanner.nextInt();

	              	        if (indice >= 0 && indice < funcionario.size()) {
	              	            funcionario.remove(indice);
	              	            System.out.println("Funcionário removido com sucesso!");
	              	        } else {
	              	            System.out.println("Índice inválido!");
	              	        }
	                	  
	                	  
	                  }
	                   break;
	                   
	                 case 4:{
	                	 System.out.print("Digite o índice do funcionário a ser atualizado: ");
	                      int indice = scanner.nextInt();

	                      if (indice >= 0 && indice < funcionario.size()) {
	                          System.out.print("Digite o novo nome: ");
	                          String nome = scanner.next();

	                          System.out.print("Digite o novo email: ");
	                          String email = scanner.next();

	                          System.out.print("Digite o novo cpf: ");
	                          int cpf = scanner.nextInt();
	                          
	                          System.out.println("Digite sua nova idade:");
	                          int idade = scanner.nextInt();
	                          
	                          System.out.println("Digite seu novo telefone");
	                          double telefone = scanner.nextDouble();
	                          
	                          System.out.println("Digite seu novo salário:");
	                          double salario = scanner.nextDouble();

	                          Funcionario funcionario1 = funcionario.get(indice);
	                          funcionario1.setNome(nome);
	                          funcionario1.setEmail(email);
	                          funcionario1.setCpf(cpf);
	                          funcionario1.setIdade(idade);
	                          funcionario1.setTelefone(telefone);
	                          funcionario1.setSalario(salario);
	                          System.out.println("Informações do funcionário atualizadas com sucesso!");
	                      } else {
	                          System.out.println("Índice inválido!");
	                      }
	                	 
	                 }
	                 
	                      
	                  /*case 2:{
	                	  System.out.print("Digite o índice do funcionário a ser removido: ");
              	        int indice = scanner.nextInt();

              	        if (indice >= 0 && indice < funcionario.size()) {
              	            funcionario.remove(indice);
              	            System.out.println("Funcionário removido com sucesso!");
              	        } else {
              	            System.out.println("Índice inválido!");
              	        }
	                	
	                  }
	                      
	                      break;
	                  case 3:{
	                	  System.out.print("Digite o índice do funcionário a ser atualizado: ");
	                      int indice = scanner.nextInt();

	                      if (indice >= 0 && indice < funcionario.size()) {
	                          System.out.print("Digite o novo nome: ");
	                          String nome = scanner.next();

	                          System.out.print("Digite o novo email: ");
	                          String email = scanner.next();

	                          System.out.print("Digite o novo cpf: ");
	                          int cpf = scanner.nextInt();
	                          
	                          System.out.println("Digite sua nova idade:");
	                          int idade = scanner.nextInt();
	                          
	                          System.out.println("Digite seu novo telefone");
	                          double telefone = scanner.nextDouble();
	                          
	                          System.out.println("Digite seu novo salário:");
	                          double salario = scanner.nextDouble();

	                          Funcionario funcionario1 = funcionario.get(indice);
	                          funcionario1.setNome(nome);
	                          funcionario1.setEmail(email);
	                          funcionario1.setCpf(cpf);
	                          funcionario1.setIdade(idade);
	                          funcionario1.setTelefone(telefone);
	                          funcionario1.setSalario(salario);
	                          System.out.println("Informações do funcionário atualizadas com sucesso!");
	                      } else {
	                          System.out.println("Índice inválido!");
	                      }
	                  }
	                      
	                      break;
	                  case 4:{
	                	  if (funcionario.isEmpty()== false) {
	                          System.out.println("Não há funcionários cadastrados.");
	                      } else {
	                          System.out.println("Funcionários listados:");
	                          for (int i = 0; i < funcionario.size(); i++) {
	                              System.out.println("Índice: " + i);
	                              System.out.println("Nome: " + funcionario.get(i).getNome());
	                              System.out.println("cpf: " + funcionario.get(i).getCpf());
	                              System.out.println("email:" + funcionario.get(i).getEmail());
	                              System.out.println("Salário: " + funcionario.get(i).getSalario());
	                              System.out.println("----------------------");
	                          }
	                      }
	                  }
	                      
	                      break;*/
	                  case 5:
	                     
	                      break;
	                  
	              }
	        	
	        	
	        }
	        

	       
	}

}
