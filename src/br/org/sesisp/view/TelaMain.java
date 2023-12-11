package br.org.sesisp.view;
import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Passeio;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TelaMain {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		//instanciando passeio
		CrudDAO inserir_passeio = new CrudDAO();
		Passeio passeio1 = new Passeio();
		
		/*/***************************************************************************
		System.out.println("******************************************************");
		System.out.println("CRIANDO PASSEIO . . . . . . . . . . .");
		//interação com o console
		System.out.println("Digite o nome do passeio:");
		passeio1.setNome(entrada.next());
		System.out.println("Digite a regiao do passeio:");
		passeio1.setRegiao(entrada.next());
		System.out.println("Digite o estado do passeio:");	
		passeio1.setEstado(entrada.next());
			System.out.println("Digite o preco do passeio:");
			passeio1.setPreco(entrada.nextFloat());
			//inserindo aluno na banco
			inserir_passeio.create(passeio1);
			System.out.println("Nome: " + passeio1.getNome() + "\nEstado: " + passeio1.getEstado() + 
					"\nRegiao: " + passeio1.getRegiao() + "\nPreco: " + passeio1.getPreco() );
			
		//**********************************************************************************
		System.out.println("******************************************************");
		System.out.println("LENDO PASSEIOS DISPONIVEIS . . . . . . . . . . .");
		for(Passeio passeio : inserir_passeio.read()) {
			System.out.println("\nDADOS DO ALUNO: " + "\nID: " + passeio.getId() + "\nPasseio: " 
					+ passeio.getNome() + "\nRegiao:" + passeio.getRegiao() + "\nPreco: " + passeio.getPreco());
		}
		
		//**********************************************************************************
		System.out.println("******************************************************");	
		System.out.println("ATUALIZANDO PASSEIO . . . . . . . . . . .");
		System.out.println("Atualize o passeio de ID:");
		int idAtualizar = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Atualize o nome do passeio:");
		String novoNome = entrada.nextLine();
		System.out.println("Atualize a regiao do passeio:");
		String novaRegiao = entrada.next();
		System.out.println("Atualize o estado do passeio:");
		String novoEstado = entrada.next();
		System.out.println("Atualize o preco do passeio:");
		Float novoPreco = entrada.nextFloat();
		entrada.nextLine(); //limpa buffer
		passeio1.setId(idAtualizar);
		passeio1.setNome(novoNome);
		passeio1.setRegiao(novaRegiao);
		passeio1.setEstado(novoEstado);
		passeio1.setPreco(novoPreco);
		System.out.println("Nome: " + passeio1.getNome() + "\nID: " + passeio1.getId() + 
				"\nRegiao: " + passeio1.getRegiao() + "\nEstado: " + passeio1.getEstado() + 
				"\nPreco: " + passeio1.getPreco());
		inserir_passeio.update(passeio1);
		entrada.nextLine(); //limpa buffer
		
		//**********************************************************************************
		System.out.println("******************************************************");	
		System.out.println("DELETANDO PASSEIO . . . . . . . . . . .");
		System.out.println("Digite o ID do passeio que deseja deletar");
		//entrada.nextLine(); //limpa buffer
		int idParaDeletar = entrada.nextInt();
		CrudDAO deletar_passeio = new CrudDAO();
		deletar_passeio.delete(idParaDeletar);*/
		
		//ALTER TABLE passeios AUTO_INCREMENT = 1;
		//MENU DE ESCOLHAS
		int escolha1;
			do{
				String tela1 = JOptionPane.showInputDialog("O que você deseja fazer? . . . \n"
						+ "1- Adicionar um passeio \n2- Ler os passeios disponiveis "
						+ "\n3- Atualizar um passeio \n4- Apagar um passeio");
				escolha1 = Integer.parseInt(tela1);
				switch(escolha1) {
					//CREATE
					case 1:
						System.out.println("******************************************************");
						System.out.println("CRIANDO PASSEIO . . . . . . . . . . .");
						//interação com o console
						System.out.println("Digite o nome do passeio:");
						passeio1.setNome(entrada.next());
						System.out.println("Digite a regiao do passeio:");
						passeio1.setRegiao(entrada.next());
						System.out.println("Digite o estado do passeio:");	
						passeio1.setEstado(entrada.next());
						System.out.println("Digite o preco do passeio:");
						passeio1.setPreco(entrada.nextFloat());
						//inserindo aluno na banco
						inserir_passeio.create(passeio1);
						System.out.println("Nome: " + passeio1.getNome() + "\nEstado: " + passeio1.getEstado() + 
								"\nRegiao: " + passeio1.getRegiao() + "\nPreco: " + passeio1.getPreco() );
						break;
							
					//READ
					case 2:
						System.out.println("LENDO PASSEIOS DISPONIVEIS . . . . . . . . . . .");
						for(Passeio passeio : inserir_passeio.read()) {
							System.out.println("\nPASSEIO: " +  passeio.getId() + "\nNome: " 
									+ passeio.getNome() + "\nRegiao:" + passeio.getRegiao() + "\nPreco: " + passeio.getPreco());
						}
						break;
							
					//UPDATE
					case 3:
						System.out.println("******************************************************");	
						System.out.println("ATUALIZANDO PASSEIO . . . . . . . . . . .");
						System.out.println("Atualize o passeio de ID:");
						int idAtualizar = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Atualize o nome do passeio:");
						String novoNome = entrada.nextLine();
						System.out.println("Atualize a regiao do passeio:");
						String novaRegiao = entrada.next();
						System.out.println("Atualize o estado do passeio:");
						String novoEstado = entrada.next();
						System.out.println("Atualize o preco do passeio:");
						Float novoPreco = entrada.nextFloat();
						entrada.nextLine(); //limpa buffer
						passeio1.setId(idAtualizar);
						passeio1.setNome(novoNome);
						passeio1.setRegiao(novaRegiao);
						passeio1.setEstado(novoEstado);
						passeio1.setPreco(novoPreco);
						System.out.println("Nome: " + passeio1.getNome() + "\nID: " + passeio1.getId() + 
								"\nRegiao: " + passeio1.getRegiao() + "\nEstado: " + passeio1.getEstado() + 
								"\nPreco: " + passeio1.getPreco());
						inserir_passeio.update(passeio1);
						entrada.nextLine(); //limpa buffer
						break;
								
					//DELETE
					case 4:
						System.out.println("******************************************************");	
						System.out.println("DELETANDO PASSEIO . . . . . . . . . . .");
						System.out.println("Digite o ID do passeio que deseja deletar");
						//entrada.nextLine(); //limpa buffer
						int idParaDeletar = entrada.nextInt();
						CrudDAO deletar_passeio = new CrudDAO();
						deletar_passeio.delete(idParaDeletar);	
						break;
								
					default:
						JOptionPane.showMessageDialog(null, "Insira o número para uma operação válida");
						break;
						
				}//fim switch
					
			}while(escolha1 != 0);		
		
	}//fim main
	
}//fim classe
