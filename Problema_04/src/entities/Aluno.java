package entities;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota3 + nota3;
    }

    public double calcularMedia() {
        return notaFinal() / 3;
    }

    public String toString() {
        return "Nota final: "
                + String.format("%.2f%n", notaFinal())
                + "Media final: "
                + String.format("%.2f%n", calcularMedia());
    }

}