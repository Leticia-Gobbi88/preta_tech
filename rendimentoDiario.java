import java.util.Scanner;

public class rendimentoDiario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis
        double pesoTomate;
        double excesso = 0;
        double multa = 0;
        double multaValor = 4.0;
        double pesoEstabelecido = 50.0;

        // Entrada
        System.out.print("Quanto está pesando o tomate em quilos: ");
        pesoTomate = leia.nextDouble();

        // Processamento
        if (pesoTomate > pesoEstabelecido) {
            excesso = pesoTomate - pesoEstabelecido;
            multa = excesso * multaValor;
            System.out.printf("Você vai pagar R$ %.2f de multa%n", multa);
        } else {
            System.out.println("Você não terá que pagar multa. Multa: R$ 0,00");
        }

        // Saída
        System.out.println("\nObrigada(o) e volte sempre\n");

        leia.close(); // Fechar o scanner
    }
}
