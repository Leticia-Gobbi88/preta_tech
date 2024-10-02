import java.util.Scanner;

public class Idade {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        //ingredientes - variaveis
        String nomePessoa;
        int anoNascimento;
        int idade;

        //entrada - processamento
    System.out.print("Qual seu nome ");
    nomePessoa = leia.nextLine();

    System.out.print("Qual seu ano de nascimento ");
    anoNascimento = leia.nextInt();

    //processamento
        idade =  2024 - anoNascimento;


        //saida
        System.out.printf("Oi %s, sua idade aproximada é %d anos", nomePessoa, idade);

        leia.close();
    }
}
