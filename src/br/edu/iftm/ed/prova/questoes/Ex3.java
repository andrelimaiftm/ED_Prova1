package br.edu.iftm.ed.prova.questoes;

import br.edu.iftm.ed.prova.estrutura.Lista;

public class Ex3 {

    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<Integer>(5);
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista);
        lista.limpar();
        System.out.println(lista);
    }
}
