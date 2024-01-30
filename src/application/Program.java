package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // Conteúdo igual
        System.out.println(c1 == c2); // Posições diferentes de memória

        String s1 = "Teste"; // tratamento especial
        String s2 = "Teste";

        System.out.println(s1 == s2); //


        String s3 = new String ("Teste"); // tratamento nao especial
        String s4 = new String ("Teste");

        System.out.println(s3 == s4); //

    }
}
