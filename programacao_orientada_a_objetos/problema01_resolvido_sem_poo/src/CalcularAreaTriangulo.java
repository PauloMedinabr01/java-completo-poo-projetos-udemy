package programacao_orientada_a_objetos.problema01_resolvido_sem_poo.src;

import java.util.Locale;
import java.util.Scanner;

/*
* Resolvendo um problema sem orientação a objetos
* 
* Fazer um programa para ler as medidas dos lados de dois triângulos X e Y 
* (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos 
* dizer qual dos dois triângulos possui a maior área. A fórmula para calcular a área de 
* um triângulo a partir das medidas de seus lados a, b e c é a seguinte 
* (fórmula de Heron):
*/

public class CalcularAreaTriangulo {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Entre com as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Área do triângulo X = %.4f%n", areaX);
        System.out.printf("Área do triângulo Y = %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área X.");
        } else {
            System.out.println("Maior área Y.");
        }
        sc.close();

    }
}
