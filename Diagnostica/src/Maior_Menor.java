import java.util.Random;

public class Maior_Menor {

    public static void main(String[] args) {
        int vetor[] = new int[50];

        Random numRandomico = new Random();
        int maxValue = Integer.MIN_VALUE;
        int mimValue = Integer.MAX_VALUE;

        for (int i = 0; i < 50; i++) {
            vetor[i] = numRandomico.nextInt(999);
        }

        for (int i = 0; i < 50; i++) {
            if (vetor[i] > maxValue)
                maxValue = vetor[i];
            if (vetor[i] < mimValue)
                mimValue = vetor[i];
        }

        System.out.println("O maior valor é: " + maxValue);
        System.out.println("O menor valor é: " + mimValue);

        System.out.println("Vetor randômico: ");

        for(int num:vetor)
            System.out.println(num);

    }
}