import java.util.Scanner;

public class eventoFabrica {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        //Variaveis
        int tempoExpresso;
        int horas, minutos, segundos;

        //Entrada
        System.out.println("Quantos segundos já se passaram:  ");
        tempoExpresso = leia.nextInt();


        //processamento
        horas = tempoExpresso / 3600; // 1 hora = 3600 segundos
        tempoExpresso %= 3600;

        minutos = tempoExpresso / 60; // 1 minuto = 60 segundos
        segundos = tempoExpresso % 60;




        //Saida
        System.out.printf("O evento já durou %d horas, %d minutos e %d segundos",horas, minutos, segundos);
        leia.close();



    }

    public static class Farenheit {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);

            //Variaveis
            String nomeTurista;
            double tempCelsius;
            double tempFarenheit;

            //Entrada
            System.out.println("Qual seu nome ");
            nomeTurista = leia.nextLine();

            System.out.println("Qual a temperatura em Main.Celsius: ");
            tempCelsius = leia.nextDouble();

           //Processamento
            tempFarenheit = tempCelsius * 1.8 + 32;

            //Saída
            System.out.printf("Oi %s, a temperatura em eventoFabrica.Farenheit é %.2f Fº", nomeTurista, tempFarenheit);






            System.out.print("Entre com a temperatura em Main.Celsius: ");


        }
    }
}

