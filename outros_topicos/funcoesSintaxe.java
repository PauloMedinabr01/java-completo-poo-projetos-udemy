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
    public static void main(String[] args) { // função padrão (entry point)

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maior = max(a, b, c);  // função responsavel por encontrar o maior entre os int
                                   
        mostrarResultado(maior);

        sc.close();
    }

    public static int max(int x, int y, int z) { // função personalizada
        int aux;                                 // variavel local da função
        if (x > y && x > z) {                    // logica para encontrar o maior int
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void mostrarResultado(int valor) {
        System.out.println("maior = " + valor);
    }
}