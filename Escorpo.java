import java.util.Scanner;

public class Escorpo {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a sua Idade: ");
        int idade = entrada.nextInt();

        boolean podeDirigir = idade >= 18;
        String nomePai = "";

        if (!podeDirigir) {
            System.out.print("Nome do pai: ");

            nomePai = entrada.next();
        }

        System.out.println("voce pode dirigir?");

        if (podeDirigir) {
            System.out.println("Sim, Voce pode dirigir!");
        } else {
            System.out.println("Nao, se fizer isso, seu pai " + nomePai + " pode ser preso!");
        }
    }
}