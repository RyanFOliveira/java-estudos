import java.util.Scanner;

public class DescobreAnoBissexto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ano:");

        // obtém entrada do tipo int
        int ano = entrada.nextInt();

        if (ano % 400 == 0) { // Todos os múltiplos de 400 são bissextos
                System.out.println("O ano\"" + ano + "\" eh um ano bissexto");
        }else if (ano % 100 != 0){ //Múltipos de 4 e não multiplos de 100 são bissextos
                      System.out.println("O ano\"" + ano + "\" nao eh um ano bissexto");  
        } else {
            System.out.println("O ano \"" + ano + "\" nao eh um ano bissexto");
        }

    }
}