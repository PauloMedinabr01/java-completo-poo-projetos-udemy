package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

/*
 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no 
 * estoque). Em seguida:
 * • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
 * estoque)
 * • Realizar uma entrada no estoque e mostrar novamente os dados do produto
 * • Realizar uma saída no estoque e mostrar novamente os dados do produto
 */

public class Programa {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto.toString());

        System.out.println();
        System.out.println("Quantidade de produtos a adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProdutosEstoque(quantidade);

        System.out.println();
        System.out.println("Estoque atualizado: " + produto);

        System.out.println();
        System.out.println("Quantidade de produtos a retirar do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutosEstoque(quantidade);

        System.out.println();
        System.out.println("Estoque atualizado: " + produto);

        sc.close();
    }
}
