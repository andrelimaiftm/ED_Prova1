package br.edu.iftm.ed.prova.estrutura;

import java.lang.reflect.Array;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;   

    public Lista(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }
    
    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

	//adiciona o elemento no final vetor
	public boolean adiciona(T elemento){
		this.aumentarCapacidade();
		if(tamanho < elementos.length){
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}

	public boolean adiciona(int posicao, T elemento)throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posicao invalida!");
		}
		this.aumentarCapacidade();
		for(int i = tamanho-1; i >= posicao; i--){
			elementos[i+1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
		return true;
	}

	public void limpar(){
		for (int i = tamanho; i >= 0; i--) {
				elementos[i] = null;
		}
		tamanho = 0;
	}

	public void remover(int posicao)throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posicao invalida!");
		}

		for(int i = posicao; i < tamanho-1; i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;
	}

	private void aumentarCapacidade(){
		if(tamanho == elementos.length){
			T[] elementosNovos = (T[])new Object[elementos.length*2];
			for(int i =0; i < elementos.length; i++){
				elementosNovos[i] = elementos[i];
			}
			elementos = elementosNovos;
		}
	}

	public int tamanho(){
		return tamanho;
	}

	public Object busca(int posicao) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posicao invalida!");
		}
		return elementos[posicao];
	}

	public int busca(Object elemento){
		for (int i = 0; i < tamanho; i++) {
			if(elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		s.append("[");		
		for(int i = 0; i < tamanho-1; i++) {
			s.append(elementos[i]);
			s.append(", ");
		}		
		if(tamanho > 0) {
			s.append(elementos[tamanho-1]);
		}		
		s.append("]");		
		return s.toString();
	}
}
