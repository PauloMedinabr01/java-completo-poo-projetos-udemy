package application;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<>();

        list.add("Maria"); // adicionar a lista
        list.add("Silvio"); // adicionar a lista
        list.add("AlexF"); // adicionar a lista
        list.add("Esdra"); // adicionar a lista
        list.add("João"); // adicionar a lista
        list.add("Julia"); // adicionar a lista
        list.add(4, "Marcia"); // adicionar a lista na posição informada
        System.out.println("----------");

        System.out.println(list.size()); // mostra o tamanho da lista
        System.out.println(list); // mostra a lista

        System.out.println("----------");

        list.remove(2); // remove um item da lista na posição (n)
        list.remove("Julia"); // remove um item da lista
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------");

        list.removeIf(x -> x.charAt(0) == 'M'); // remove itens da lista com o caracter M
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------");
        System.out.println("Indice de Esdra= " + list.indexOf("Esdra")); // imprime o indice de um item da lista
        System.out.println("Indice de Paulo= " + list.indexOf("Paulo")); // imprime o indice de um item da lista (-1
                                                                         // quando não existe na lista)
        System.out.println("----------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList()); // Cria uma
                                                                                                          // nova lista
                                                                                                          // apenas com
                                                                                                          // itens com a
                                                                                                          // Letra (E)
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("----------");

    }
}
