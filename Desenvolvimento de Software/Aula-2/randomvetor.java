import java.util.Random;
import java.util.Scanner;

public class randomvetor {
    public static void main(String args[]) {
        int i, j, x;
        int[] vet = new int [20];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        for (i = 0; i < 20; i++) {
            x = 1 + random.nextInt(100);
            for (j = 0; j < vet.length; j++) {
                if (x == vet[j]) {
                    i--;
                }
                else {
                    vet[i] = x;
                }
            }
            System.out.println(vet[i]);
        }

    }
}
