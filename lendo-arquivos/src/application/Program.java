package application;

import java.io.BufferedReader;

/*
 * Bloco try-with-resources
 * • É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados 
 * • ao final do bloco
 * • Disponível no Java 7 em diante
 * • https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        String path = "C:\\Temp\\Texto.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
