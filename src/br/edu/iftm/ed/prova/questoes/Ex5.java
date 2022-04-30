package br.edu.iftm.ed.prova.questoes;

import br.edu.iftm.ed.prova.estrutura.Pilha;

import java.util.ArrayList;

public class Ex5 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        Pilha<Integer> pilha1 = new Pilha<>();
        Pilha<Integer> pilha2 = new Pilha<>();

        for (int valor : lista) {
            if(valor % 2 == 0){
                pilha1.empilhar(valor);
            }else{
                pilha2.empilhar(valor);
            }
        }

        System.out.println("Lista");
        System.out.println(lista.toString());
        System.out.println("Pilha 1 - Par");
        System.out.println(pilha1.toString());
        System.out.println("Pilha 2 - Impares");
        System.out.println(pilha2.toString());

    }
}
