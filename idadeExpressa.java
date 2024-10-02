import java.util.Scanner;

public class idadeExpressa {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        //Variaveis
        int idadeAnos;
        int idadeMeses;
        int idadeDias;
        int totalDias;



        //Entrada
        System.out.println("Qual a sua idade em anos:  ");
        idadeAnos = leia.nextInt();

        System.out.println("E quantos meses: ");
        idadeMeses = leia.nextInt();

        System.out.println("E quantos dias: ");
        idadeDias = leia.nextInt();

        //processamento
        totalDias = (idadeAnos*365) + (idadeMeses*30) + idadeDias;




        //Saida
        System.out.printf("Você já viveu aproximadamente %d dias",totalDias);
        leia.close();



    }

    public static class rendimentoDiario {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);

            //variaveis
            double pesoTomate;
            double excesso = 0;
            double multa = 0;
            double multaValor = 4.0;
            double pesoEstabelecido = 50.0;

            //entrada
            System.out.println("Quanto esta pesando o tomate em kilos: ");
            pesoTomate = leia.nextDouble();

            //processamento
            if (pesoTomate > pesoEstabelecido) {
                excesso = pesoTomate - pesoEstabelecido;
                multa = excesso * multaValor;
                System.out.printf("Você vai pagar %.2f de multa", multa);
            }
              else {
                  System.out.println ("Você vai pagar 0,00");
            }
            //saída
            System.out.println("\nObrigada(o) e volte sempre\n");
        }

    }
}
