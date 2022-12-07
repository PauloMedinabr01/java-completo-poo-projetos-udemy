public class Casting {
    public static void main(String[] args) {

        // Exemplo 1
        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        // Exemplo 2
        int a;
        double b;
        a = 5;
        b = 2 * a;
        System.out.println(a);
        System.out.println(b);

        // Exemplo 3 - area do trapezio
        double b1, b2, altura, area;
        b1 = 6.0d;
        b2 = 8.0d;
        altura = 5.0d;
        area = (b1 + b2) / 2.0 * altura;
        System.out.println(area);

        /*
         * Boa prática: Sempre indique o tipo do número, se a
         * expressão for de ponto flutuante (não inteira).
         * Para double use:.0
         * Para float use: f
         */

        // Exemplo 4
        int c, d;
        double resultado;
        c = 5;
        d = 2;
        resultado = (double) c / d;
        System.out.println(resultado);

        // Exemplo 5
        double e;
        int f;
        e = 5.0;
        f = (int) e;

        System.out.println(f);

    }
}
