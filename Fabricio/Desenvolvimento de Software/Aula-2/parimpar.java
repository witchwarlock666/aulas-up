import java.util.Scanner;

public class parimpar {
    public static void main(String args[]) {
        boolean i = true;
        int x;
        Scanner input = new Scanner(System.in);

        do {
            x = input.nextInt();

            if (x < 0) {
                i = false;
            } else if (x % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        } while (i == true);
        input.close();
    }
}
