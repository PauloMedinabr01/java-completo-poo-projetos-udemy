import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String s = " ";
        int x;
        double y;
        char z = ' ';

        System.out.print("Digite um nome: ");
        s = sc.next();

        System.out.print("Digite um Int: ");
        x = sc.nextInt();

        System.out.print("Digite um Double: ");
        y = sc.nextDouble();

        System.out.print("Digite um Caractere: ");
        z = sc.next().charAt(0);
        
        System.out.println("Dados digitados: ");
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();

    }

}
