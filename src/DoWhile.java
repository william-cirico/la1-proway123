import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.print("Selecione uma opção:\n" +
                    "1) Cadastrar\n" +
                    "2) Visualizar\n" +
                    "3) Editar\n" +
                    "4) Remover\n" +
                    "0) Sair\n" +
                    "Opção escolhida: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Vai cadastrar");
                    break;
                case 2:
                    System.out.println("Vai visualizar");
                    break;
                case 3:
                    System.out.println("Vai editar");
                    break;
                case 4:
                    System.out.println("Vai remover");
                    break;
                case 0:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        } while (opcao != 0);


        sc.close();
    }
}
