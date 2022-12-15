package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Programa {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Digite a largura e a altura do retângulo :");
        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();

        System.out.println(ret.toString());

        sc.close();
    }

}
