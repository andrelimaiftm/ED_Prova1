package br.edu.iftm.ed.prova.questoes;

import br.edu.iftm.ed.prova.classes.Contato;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        LinkedList<Contato> agenda = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        int opcao, posicao;
        String nome, telefone, email;
        Contato c;

        do {
            System.out.println("Agenda");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato por posição");
            System.out.println("3 - Remover Contato por posição");
            System.out.println("4 - Imprime Agenda");
            System.out.println("5 - Busca Contato por Nome");
            System.out.println("6 - Remove Contato por Nome");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Adiciona Contato");
                    System.out.println("Nome: ");
                    nome = entrada.next();
                    System.out.println("Telefone: ");
                    telefone = entrada.next();
                    System.out.println("E-mail: ");
                    email = entrada.next();
                    c = new Contato(nome, telefone, email);
                    agenda.add(c);
                    break;
                case 2:
                    System.out.println("Busca Contato por posição");
                    System.out.println("Digite a posição do contato que deseja buscar: ");
                    posicao = entrada.nextInt();
                    c = agenda.get(posicao);
                    System.out.println(c);
                    break;
                case 3:
                    System.out.println("Remove por posição");
                    System.out.println("Digite a posição do contato que deseja remover: ");
                    posicao = entrada.nextInt();
                    c = agenda.remove(posicao);
                    System.out.println("Contato Removido");
                    System.out.println(c);
                    break;
                case 4:
                    for (Contato contato : agenda) {
                        System.out.println(contato);
                    }
                    break;
                case 5:
                    System.out.println("Busca Contato por Nome");
                    System.out.println("Digite o nome do contato que deseja buscar: ");
                    nome = entrada.next();
                    for (Contato contato : agenda) {
                        if (contato.getNome().equals(nome)) {
                            System.out.println(contato);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Remove Contato por Nome");
                    System.out.println("Digite o nome do contato que deseja remover: ");
                    nome = entrada.next();
                    for (Contato contato : agenda) {
                        if (contato.getNome().equals(nome)) {
                            agenda.remove(contato);
                            System.out.println("Contato Removido");
                            System.out.println(contato);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        } while (opcao != 0);
    }
}
