package application;

import entities.LinkedList;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        LinkedList list = new LinkedList();
        String novoValor = "";
        System.out.println("Type the names that you wanna add to the list: ");
        while (!novoValor.equalsIgnoreCase("exit")) {
            novoValor = scan.nextLine();
            if (!novoValor.equalsIgnoreCase("exit")) {
                list.adicionar(novoValor);
            }
        }
        System.out.println("Size: " + list.getTamanho());
        System.out.println("First: " + list.getPrimeiro().getValor());
        System.out.println("Last: " + list.getUltimo().getValor());

        System.out.println("Size: " + list.getTamanho());
        for (int i = 0; i < list.getTamanho(); i++) {
            System.out.println(list.get(i).getValor());
        }

        System.out.println("Wanna remove anny name ?");
        String answer = "";
        while (!answer.equalsIgnoreCase("exit")) {
            answer = scan.nextLine();
            list.remover(answer);
            System.out.println("Name successfully removed!!");
        }
        System.out.println("Size: " + list.getTamanho());
        for (int i = 0; i < list.getTamanho(); i++) {
            System.out.println(list.get(i).getValor());
        }

    }
}