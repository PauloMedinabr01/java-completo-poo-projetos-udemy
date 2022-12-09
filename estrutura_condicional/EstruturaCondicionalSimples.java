package estrutura_condicional;

import java.util.Scanner;

/* Estrutura condicional:
*É uma estrutura de controle que permite definir que um certo bloco de comandos somente 
* será executado dependendo de uma condição

                                   ********
                                  *CONDIÇÃO*
                                  ***********
                                 *           *
                                *             *
                      VERDADEIRO               FALSO
*/

public class EstruturaCondicionalSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();

        if (hora <= 12) {
            System.out.println("Bom dia!");

        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        /*
         * Regra: Se Verdadeiro executa o bloco de comando, se Falso pula o bloco de
         * comandos
         */

    }
}
