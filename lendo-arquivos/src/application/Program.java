package application;

/*
 * Lendo arquivo texto com classes File e Scanner
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Temp\\Texto.txt"); // Objeto File file instanciado para ler arquivos
        Scanner sc = null; // Scanner para ler os arquivos

        try {
            sc = new Scanner(file); // Tratamento da exceção
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (sc != null) { // teste para verificar e fechar o scanner
                sc.close();
            }

        }

    }

}