package application;

import java.io.BufferedReader;

/*
 * FileReader e BufferedReader
 * Classes
• FileReader (stream de leitura de caracteres a partir de arquivos)
• https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html
• BufferedReader (mais rápido)
• https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html
• https://stackoverflow.com/questions/9648811/specific-difference-betweenbufferedreader-and-filereade
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        String path = "C:\\Temp\\Texto.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
