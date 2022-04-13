import java.util.Random;
import java.util.Scanner;

public class randomvetor {
    public static void main(String args[]) {
        int i, j, x, n;
        int[] vet = new int[20];
        boolean is, teste;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        for (i = 0; i < 20; i++) {
            teste = false;
            x = 1 + random.nextInt(100);
            for (j = 0; j < 20; j++) {
                if (x == vet[j]) {
                    teste = true;
                    break;
                }
            }
            if (!teste == true) {
                vet[i] = x;
                System.out.println(vet[i]);
            } else {
                i--;
            }
        }

        System.out.print("Digite um numero de 1 a 100: ");
        n = input.nextInt();
        is = false;
        for (i = 0; i < 20; i++) {
            if (n == vet[i]) {
                is = true;
                break;
            }
        }
        if (is) {
            System.out.println("O seu numero existe no index: " + i);
        } else {
            System.out.println("O seu numero não existe no vetor");
        }

        input.close();

    }
}
