import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Break
        while (true) {
            System.out.println("Digite um número par: ");
            int num = Integer.parseInt(sc.nextLine());

            if (num % 2 != 0) {
                System.out.println("O número digitado é ímpar: " + num);
                break;
            }

            System.out.println("O número digitado é par: " + num);
        }

        // Continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println("O número é ímpar: " + i);
        }
    }
}
