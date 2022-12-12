package outros_topicos;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class OperadoresBitWise {

    /*
     * Operador Significado
     * & Operação "E" bit a bit
     * | Operação "OU" bit a bit
     * ^ Operação "OU-exclusivo" bit a bit
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        int n = sc.nextInt();

        int mask = 32; // int mask = 0b00100000
        if ((n & mask) != 0)
            System.out.println("6º bit é verdadeiro! ");
        else {
            System.out.println("6º bit é falso!");
        }

        sc.close();

    }
}