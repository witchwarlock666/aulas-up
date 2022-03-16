import java.util.Random;

public class sorteio {
    public static void main(String args[]) {
        int maior, menor, i, x;
        float media;
        media = 0;
        i = 0;
        Random random = new Random();
        x = 1 + random.nextInt(100);
        maior = x;
        menor = x;
        while (i < 999) {
            x = 1 + random.nextInt(100);
            if (x > maior) {
                maior = x;
            } else if (x < menor) {
                menor = x;
            }
            media += x;
            i++;
        }
        media /= 1000;
        System.out.println("Media: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
