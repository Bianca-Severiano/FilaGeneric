package model;

public class Fila<T> {

	NoFila<T> inicio;
	NoFila<T> fim;
	
	public Fila() {
		inicio = null;
		fim = inicio;
	}
	
	public boolean isEmpty() {
		if(fim == inicio && inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insert(T dado) {
		
		NoFila<T> elemento = new NoFila<>();
		elemento.dado = dado;
		elemento.proximo = null;
		if (isEmpty()) {
			inicio = elemento;
			fim = inicio;
		} else {
			fim.proximo = elemento;
			fim = elemento;
		}
	}
	
	public T remove () throws Exception{
		if(isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		
		T dado = inicio.dado;
		if(inicio==fim & inicio == null) { // Fila 1 elemento
			inicio = null;
			fim = inicio; // Volta a ser uma pilha vazia
		} else {
			inicio = inicio.proximo;
		}
		
		return dado;
	}
	
	public void list() throws Exception{
		if(isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		
		NoFila<T> auxiliar = inicio;
		while (!isEmpty()) {
			System.out.print(auxiliar.dado + " ");
			auxiliar = auxiliar.proximo;
		}
		
		System.out.println("");
	}
	
	public int size () {
		int cont = 0;
		if (!isEmpty()) {
			NoFila<T> auxiliar = inicio;
			while (auxiliar != null) {
				cont ++;
				auxiliar = auxiliar.proximo;
			}
		}
		
		return cont;
	}
}
