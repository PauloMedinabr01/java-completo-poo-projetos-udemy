package application;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n]; // Matriz de N linha s e N colunas

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt(); // preenche as prosições na matriz
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " "); // imprime os itens na diagonal principal da matriz
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++; // percorre a matriz e verica os itens negativos
                }
            }
        }
        System.out.println("Números negativos = " + count); // imprime os itens negativos da matriz

        sc.close();
    }
}