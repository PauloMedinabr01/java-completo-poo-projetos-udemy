package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>(); // inatanciada uma lista

        String path = "C:\\temp\\in.txt"; // local do arquivo que será lido

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine(); // scanner para ler as linhas do arquivo
            while (employeeCsv != null) { // laço de repetição para ler a linha até o final
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); // adiciona os dados em uma lista
                employeeCsv = br.readLine(); // reinicia a leitura de outra linha se ouver conteudo
            }
            Collections.sort(list); // sort ordena os itens em uma lista
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary()); // imprimi os dados lidos do arquivo, após
                                                                            // fazer a comparação e ordenação
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}