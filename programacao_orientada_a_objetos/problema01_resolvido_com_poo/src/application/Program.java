package programacao_orientada_a_objetos.problema01_resolvido_com_poo.src.application;

import java.util.Locale;
import java.util.Scanner;

import programacao_orientada_a_objetos.problema01_resolvido_com_poo.src.entities.Triangulo;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triângulo X área: %.4f%n", areaX);
        System.out.printf("Triângulo Y área: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área X.");
        } else {
            System.out.println("Maior área Y.");
        }

        sc.close();
    }

}
