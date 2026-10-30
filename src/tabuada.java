import java.sql.SQLOutput;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        menu();
    }



    public static void menu () {
      Scanner Sc = new Scanner(System.in);
        int resposta = 0;
        do {
            System.out.println("Digite 1 para ver a tabuada: \n Ou 2 para sair do programa: ");
            resposta = Sc.nextInt();
            if(resposta == 1){
                tabuada();
            } else if (resposta == 2) {
                System.out.println("Entendido tenha uma Boa Noite!");
                return;

            }

        } while(resposta != 1);

    }
    public static void tabuada() {
        Scanner Sc = new Scanner(System.in);
        int numeroInicial = 0;
        int controlador = 1;
        int numeroFinal = 1;
        System.out.println("Deseje o numero que deseja ver a tabuada, de 1 a 10:");
        numeroInicial = Sc.nextInt();
        if (numeroInicial > 0 || numeroInicial < 11) {

            while (controlador < 11) {
                numeroFinal = numeroInicial * controlador;
                controlador++;
                System.out.println(numeroFinal);
            }
            System.out.println("Tabuada completa");

        }
    }
}


