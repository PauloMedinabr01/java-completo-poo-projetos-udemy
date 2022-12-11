package estrutura_repetitiva_for;

import java.util.Scanner;

/*
* Estrutura repetitiva For
* É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
* Quando usar: quando se sabe previamente a quantidade de repetições ou o intervalo de valores.
* Fazer um programa que lê um valor inteiro N e depois N números inteiros.
* Ao final, mostra a soma dos N números lidos.
*
*     executa a primeira vez  | V: executa e volta   |Executa toda vez depois de voltar
*                               F:
*     for (inicio;              condição;             index++)
*/

public class For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos numeros quer somar: ");
        int n = sc.nextInt(); // quantidade de vezes a repetir a leitura

        int soma = 0;
        for (int i = 0; i < n; i++) { // i com valor inicial de 0, enquanto i for menor n que (vezes a repetir) incrementa n
            System.out.println("Digite um número: ");
            int x = sc.nextInt(); // armazena os valores após a leitura
            soma = soma + x; // soma os valores de x enquato o laço de repetição for executado                        
            

        }

        System.out.println("A soma dos números é de = " + soma);

        sc.close();

    }
}
