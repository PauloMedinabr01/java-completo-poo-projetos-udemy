package estrutura_repetitiva_while;

import java.util.Scanner;

/*
* Fazer um programa que lê números
*inteiros até que um zero seja lido. Ao
*final mostra a soma dos números lidos.É uma estrutura de controle querepete um bloco de 
*comandos enquanto uma condição for verdadeira. Quando usar: quando não sesabe previamente
*a quantidade de repetições que será realizada.
*
*• Regra:
*• V: executa e volta
*• F: pula fora
*/

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            System.out.println("Digite um numero: ");
            soma += x; // soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();

    }
}
