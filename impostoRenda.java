import java.util.Scanner;

public class impostoRenda {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //variaveis
        double salario;
        double salarioLiquido;

        //entradas
        System.out.println("Qual o seu salario: ");
        salario = leia.nextDouble();

        //processamento
        if (salario <= 2000) {
            System.out.println("Você é isento");
        } else if (salario <= 5000) {
            salarioLiquido = salario - (salario * 0.15);
            System.out.printf ("Seu salario  Liquido é %.2f: ", salarioLiquido);
        } else {
            salarioLiquido = salario - (salario * 0.25);
            System.out.printf ("Seu salario Liquido é %.2f: ", salarioLiquido);
        }
        //saida
        System.out.println("\nObrigada por usar a calculadora de imposto\n");
    }


}
