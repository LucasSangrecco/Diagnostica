import java.util.Random;

public class Diagnostica1 {
    public static void main(String[] args) {

        int vetor[] = new int[8];
        int somaTrinta=0, countTrinta=0,somaTotal=0;
        Random numRandomico = new Random();

        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = numRandomico.nextInt(99);
        }

        System.out.println("Vetor: ");

        for (int num:vetor){
            System.out.println(num + " ");
            if(num>30){
                countTrinta++;
                somaTrinta+=num;
            }
            somaTotal+=num;
        }
        System.out.println("Quantidade de numeros maiores que 30: " + countTrinta);
        System.out.println("Soma dos valores maiores que 30: " + somaTrinta );
        System.out.println("Soma total: " + somaTotal);
    }
}
