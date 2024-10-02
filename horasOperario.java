import java.util.Scanner;

public class horasOperario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis
        int c;
        int n;
        double salarioHora = 10.00;
        double valorExcedente = 20.00;
        double valorPagamento;
        double excesso = 0;
        double pagamentoExcedente = 0;

        // Entrada
        System.out.println("Digite o código do funcionário: ");
        c = leia.nextInt();

        System.out.println("Agora digite o total de horas trabalhadas: ");
        n = leia.nextInt();

        // Processamento
        if (n > 50) {
            excesso = n - 50;
            pagamentoExcedente = excesso * valorExcedente;
            valorPagamento = (50 * salarioHora) + pagamentoExcedente;
        } else if (n <= 50) {
            valorPagamento = n * salarioHora;
        } else {
            valorPagamento = 0;
        }

        // Saída
        System.out.printf("Código do funcionário: %d%n", c);
        System.out.printf("Salário total: R$ %.2f%n", valorPagamento);
        System.out.printf("Salário excedente: R$ %.2f%n", pagamentoExcedente);

        leia.close();
    }
}
