package controller;

import br.com.filagenerica.Fila;

public class ImpressoraController {
	public void insereDocumento(Fila<String> fila, String documento) {
		fila.insert(documento);
	}
	
	public void imprime(Fila<String> fila) {
		while (!fila.isEmpty()) {
			try {
				System.out.println(fila.remove());
			} catch (Exception e) {
				e.getMessage();
			}
			try {
				Thread.sleep((int) (Math.random() * 2000) + 1000);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
