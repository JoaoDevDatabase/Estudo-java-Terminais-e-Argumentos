import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        double altura;

        System.out.println("\n**********ENTRADA DO USUÁRIO**********\n");

        System.out.println("Qual seu nome ?");
        nome = input.nextLine();

        System.out.println("\n");

        System.out.println("Qual sua idade ?");
        idade = input.nextInt();

        System.out.println("\n");

        System.out.println("Qual sua altura aproximadamente ?");
        altura = input.nextDouble();

        System.out.println("\n");

        System.out.println("SEU NOME: " + nome);
        System.out.println("\nSUA IDADE : " + idade);
        System.out.println("\nSUA ALTURA : " + altura);

    }
}
