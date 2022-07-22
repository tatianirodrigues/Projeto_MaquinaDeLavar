/**
 * 
 */
package maquinaDeLavar;

import java.util.Scanner;

/**
 * @author tatianirodriuges
 *
 */
public class Principal {
	/**
	 * @param args
	 */
	public static void main(String[] args)  throws InterruptedException {

		Scanner entrada = new Scanner(System.in);

		int nMenu1 = 888, nMenu2 = 888, voltagem = 0, kg = 0, duracao1 = 0, duracao2 = 0, duracao3 = 0, duracao4 = 0, duracao5 = 0, estagio;
		int i;
		String  nome = "a", mode = "a";

		while (nMenu1 !=1) {
			System.out.println("\n==========================================\nMENU SIMULACAO\n==========================================");
			System.out.println ("\n1 - Configurar a Maquina de Lavar\n2 - Simular a maquina de lavar\n0 - Sair");
			nMenu1 = entrada.nextInt();

			if (nMenu1 == 0) {
				System.out.println("FINALIZADO");
				break;
			}
			switch (nMenu1) {
			case 1:
				System.out.println("\n==========================================\nCONFIGURACAO DA MAQUINA DE LAVAR\n==========================================");
				entrada.nextLine();
				System.out.println("Modelo:");
				mode = entrada.nextLine();
				System.out.println("Nome:");
				nome = entrada.nextLine();
				System.out.println("Voltagem 220 ou 110:");
				voltagem = entrada.nextInt();
				while (voltagem != 220 && voltagem != 110) {
					System.out.println("Voltagem Invalida!\n\nTente novamente");
					System.out.println("\nVoltagem 220 ou 110:");
					voltagem = entrada.nextInt();
				}
				System.out.println("Quantos KG?");
				kg = entrada.nextInt();
				System.out.println("Duracao do Estagio 1 - Lavacao Pesada: ");
				duracao1 = entrada.nextInt();
				System.out.println("Duracao do Estagio 2 - Lavacao Normal: ");
				duracao2 = entrada.nextInt();
				System.out.println("Duracao do Estagio 3 - Lavacao Leve: ");
				duracao3 = entrada.nextInt();
				System.out.println("Duracao do Estagio 4 - Enxague: ");
				duracao4 = entrada.nextInt();
				System.out.println("Duracao do Estagio 5 - Centrifuga: ");
				duracao5 = entrada.nextInt();
				break;

			default:
				System.out.println("ATENCAO! Configure a Maquina primeiro!");
				break;
			}		
		}
		while (nMenu2 !=0) {

			System.out.println("\n==========================================\nMENU SIMULACAO\n==========================================");
			System.out.println ("\n1 - Configurar a Maquina de Lavar\n2 - Simular a maquina de lavar\n0 - Sair");
			nMenu2 = entrada.nextInt();

			if (nMenu2 == 0) {
				System.out.println("FINALIZADO");
				break;
			}

			switch (nMenu2) {
			case 1:
				System.out.println("\n==========================================\nCONFIGURACAO DA MAQUINA DE LAVAR\n==========================================");
				System.out.println("Modelo:");
				entrada.nextLine();
				mode = entrada.nextLine();
				System.out.println("Nome:");
				nome = entrada.nextLine();
				System.out.println("Voltagem 220 ou 110:");
				voltagem = entrada.nextInt();
				while (voltagem != 220 && voltagem != 110) {
					System.out.println("Voltagem Invalida!\n\nTente novamente");
					System.out.println("\nVoltagem 220 ou 110:");
					voltagem = entrada.nextInt();
				}
				System.out.println("Quantos KG?");
				kg = entrada.nextInt();
				System.out.println("Duracao do Estagio 1 - Lavacao Pesada: ");
				duracao1 = entrada.nextInt();
				System.out.println("Duracao do Estagio 2 - Lavacao Normal: ");
				duracao2 = entrada.nextInt();
				System.out.println("Duracao do Estagio 3 - Lavacao Leve: ");
				duracao3 = entrada.nextInt();
				System.out.println("Duracao do Estagio 4 - Enxague: ");
				duracao4 = entrada.nextInt();
				System.out.println("Duracao do Estagio 5 - Centrifuga: ");
				duracao5 = entrada.nextInt();
				break;

			case 2:
				System.out.println("\n==========================================\nSIMULACAO DA MAQUINA DE LAVAR\n==========================================");
				System.out.println("Simulando o modelo:" + mode + " - " + nome + " - " + kg + "kg  - Voltagem:" + voltagem);
				System.out.println("==========================================\nQUAL ESTAGIO VOCE QUER COMECAR?\n==========================================");
				System.out.println ("1 - Lavacao Pesada\n2 - Lavacao Normal\n3 - Lavacao Leve\n4 - Enxague\n5 - Centrifuga");
				System.out.println("Selecione o estagio inicial: ");
				estagio = entrada.nextInt();

				switch(estagio){
				case 1:	
					for (i = 0; i < 5; i++) {
						Thread.sleep(duracao1*1000/5);
						System.out.println("Estagio 1 -  Em lavacao pesada: " + 20 * (i + 1) + "%");
					}
					System.out.println("\n");
				case 2:	
					for (i = 0; i < 5; i++) {
						Thread.sleep(duracao2*1000/5);
						System.out.println("Estagio 2 -  Em lavacao normal: " + 20 * (i + 1) + "%");
					}
					System.out.println("\n");
				case 3:	
					for (i = 0; i < 5; i++) {
						Thread.sleep(duracao3*1000/5);
						System.out.println("Estagio 3 -  Em lavacao leve: " + 20 * (i + 1) + "%");
					}
					System.out.println("\n");
				case 4:	
					for (i = 0; i < 5; i++) {
						Thread.sleep(duracao4*1000/5);
						System.out.println("Estagio 4 -  Em enxague: " + 20 * (i + 1) + "%");
					}
					System.out.println("\n");
				case 5:	
					for (i = 0; i < 5; i++) {
						Thread.sleep(duracao5*1000/5);
						System.out.println("Estagio 5 -  Em centrÌfuga: " + 20 * (i + 1) + "%");
					}
					break;	

				default:
					System.out.println("\nNumero invalido");

					break;
				}

				System.out.println("\nSIMULACAO FINALIZADA.");
				break;
			default:
				System.out.println("\nNumero invalido");
				break;
			}
		}
	}
}
