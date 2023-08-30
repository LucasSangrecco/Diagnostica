import java.util.Scanner;

public class Diagnostica2 {
    public static void main(String[] args) {
        int[][] estoque = new int[4][5];
        int opcao = 0;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite o número da prateleira");
            int prateleira = ler.nextInt();
            System.out.println("Digite o número do armário");
            int armario = ler.nextInt();


            if (prateleira < 0 || prateleira > 3) {
                System.out.println("Prateleira Inexistente");
            }

            if (armario < 0 || armario > 4) {
                System.out.println("Armário Inexistente");
            }

            if (estoque[armario][prateleira] >= 10) {
                System.out.println("Espaço Insuficiente");
            }

            else{
                estoque[armario][prateleira]++;
                System.out.println("Caixa Adicionada");
            }


            System.out.println("Deseja continuar? <1>Sim <2>Não");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        while (opcao != 2);

        System.out.println("Quantidade de caixas em cada prateleira/armario");

        for (int i= 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque.length; j++) {
                System.out.print(estoque[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}