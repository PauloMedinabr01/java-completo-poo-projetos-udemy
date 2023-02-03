package application;

import entities.Cliente;

public class Program {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("Alex", "alex@gmail.com");

        System.out.println();
        System.out.println();

        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);

    }
}
