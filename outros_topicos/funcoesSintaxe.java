package outros_topicos;

import java.util.Scanner;

/*
* Funções
• Representam um processamento que possui um significado
• Math.sqrt(double)
• System.out.println(string)
• Principais vantagens: modularização, delegação e reaproveitamento
• Dados de entrada e saída
• Funções podem receber dados de entrada (parâmetros ou argumentos)
• Funções podem ou não retornar uma saída
• Em orientação a objetos, funções em classes recebem o nome de 
"métodos"
Problema exemplo
Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
*/

public class funcoesSintaxe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Maior = " + a);
        } else if (b > c) {
            System.out.println("Maior = " + b);
        } else {
            System.out.println("Maior = " + c);
        }
        sc.close();
    }
}
