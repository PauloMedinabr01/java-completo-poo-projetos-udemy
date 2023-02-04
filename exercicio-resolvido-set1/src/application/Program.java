package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

/*
 * Um site de internet registra um log de acessos dos usuários. Um registro de log consiste no 
 * nome de usuário (apenas uma palavra) e o instante em que o usuário acessou o site no padrão 
 * ISO 8601, separados por espaço, conforme exemplo. Fazer um programa que leia o log de acessos
 *  a partir de um arquivo, e daí informe quantos usuários distintos acessaram o site.
 */

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); // instanciado o Scanner

        System.out.println("Enter file full path:");
        String path = sc.nextLine(); // c:\\temp\\in.txt

        try (BufferedReader br = new BufferedReader(new FileReader(path));) {

            Set<LogEntry> set = new HashSet<>(); // instanciado o Set

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(" "); // recorta o String antes do espaço e armazena no vetor
                String userName = fields[0]; // recebe o String recortado na posição 0
                Date moment = Date.from(Instant.parse(fields[1])); // armazena a data no formato ISO 8601
                set.add(new LogEntry(userName, moment)); // insere username e moment no Set e se algum item for
                                                         // duplicado a Set barra

                line = br.readLine(); // lê a proxima linha e a estrutura será repetida até ser null

            }

            System.out.println("Total users: " + set.size());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
