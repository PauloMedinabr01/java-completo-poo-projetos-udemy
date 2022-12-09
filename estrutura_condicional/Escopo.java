package estrutura_condicional;

/*
 * • Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, 
 * onde ela pode ser referenciada.
 * • Uma variável não pode ser usada se não for iniciada.
 */

public class Escopo {
    public static void main(String[] args) {

        double price = 400.00;
        double discount = 0;

        if (price < 200.0) {
            discount = price * 0.1;
        }

        else {
            discount = 0; // alternativa
        }
        System.out.println(discount);
    }

}
