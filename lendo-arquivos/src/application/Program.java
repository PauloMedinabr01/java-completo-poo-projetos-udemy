package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * FileWriter e BufferedWriter
 * Classes
• FileWriter (stream de escrita de caracteres em de arquivos)
• https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html
• Cria/recria o arquivo: new FileWriter(path)
• Acrescenta ao arquivo existente: new FileWriter(path, true)
• BufferedWriter (mais rápido)
• https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html
 */

public class Program {
    public static void main(String[] args) throws Exception {

        String[] lines = new String[] { "Bom dia! ", "Boa tarde ", "Boa noite!" };

        String path = "C:\\Temp\\Texto.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
