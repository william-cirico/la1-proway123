import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // While sendo usado como um for (ERRADO!)
        int i = 1;
        while (i <= 100) {
            System.out.println("Repetindo pela " + i + " vez");
            i++;
        }

        Scanner sc = new Scanner(System.in);

        int num = 0;
        // Saber se um número é par:
        //  15 % 2 = 0
        //  15 | 2
        // -14   7
        //   1 -> Esse é o resto
        // 15 % 2 != 0 -> Ímpar
        while (num % 2 == 0) {
            System.out.println("O número par: " + num);
            System.out.print("Digite um número par para continuar ou um número ímpar para parar: ");
            num = Integer.parseInt(sc.nextLine()); // Conversão de um tipo string para inteiro = "123" -> 123
        }

        System.out.println("O número ímpar que parou o código foi: " + num);

        sc.close();
    }
}
