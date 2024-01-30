package application;

import entities.Cliente;
import entities.LinkedList;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Scanner;

public class MainClients {
    public static void main(String[] Args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        LinkedList<Cliente> clientList = new LinkedList<Cliente>();

        System.out.println("Type clients data: ");
        String answer = "";
        while (!answer.equalsIgnoreCase("exit")) {
            System.out.println("Cpf: ");
            String cpf = scan.nextLine();
            System.out.println("Name: ");
            String name = scan.nextLine();

            clientList.adicionar(new Cliente(cpf, name));
            System.out.println("Wanna exit ?");
            answer = scan.nextLine();
        }
        System.out.println("Size: " + clientList.getTamanho());
        for (int i = 0; i < clientList.getTamanho(); i++) {
            System.out.println(clientList.get(i).getValor());
        }


    }
}
