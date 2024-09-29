package view;

import java.util.Scanner;

import br.com.filagenerica.Fila;
import controller.ImpressoraController;

public class Principal {
	public static void main(String[] args) {
		Fila<String> fila = new Fila<String>();
		Scanner ler = new Scanner(System.in);
		ImpressoraController ic = new ImpressoraController();
		
		while(true) {
			String arquivo = "";  
			System.out.println("Informe o nome do arquivo a ser impresso: ");
			arquivo = "#PC: " + ((int)(Math.random()*10) + 1) + " – Arquivo: " + ler.nextLine();
			
			ic.insereDocumento(fila, arquivo);
			
			System.out.println("Deseja continuar? \n 1 - Sim \n 2 - Não");
			int resposta = ler.nextInt();
			
			if(resposta == 2) {
				System.out.println("Deseja começar a Impressão? \n 1 - Sim \n 2 - Não");
				int resp = ler.nextInt();
				if(resp == 1) {
					ic.imprime(fila);
				}
				break;
			}
		}
		ler.close();
	}
}
