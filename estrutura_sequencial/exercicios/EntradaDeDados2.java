package exercicios;

import java.util.Scanner;

public class EntradaDeDados2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        int x;

        x = sc.nextInt();
        sc.nextLine(); // sc.nextLine(); para consumir a quebra de linha pendente
        s1 = sc.nextLine(); // next lê apenas uma palavra, nextLine lê a linha inteira até a quebra de linha
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
