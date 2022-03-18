import java.util.Scanner;

public class meses {
    public static void main(String args[]) {
        System.out.print("Digite um numero de 1 a 12: ");
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        System.out.print("IF: ");
        ifel(y);
        System.out.print("SWITCH: ");
        cas(y);
        System.out.print("VECTOR: ");
        list(y);

        x.close();
    }

    public static void ifel(int x) {
        if (x == 1) {
            System.out.println("Janeiro");
        } else if (x == 2) {
            System.out.println("Fevereiro");
        } else if (x == 3) {
            System.out.println("Marco");
        } else if (x == 4) {
            System.out.println("Abril");
        } else if (x == 5) {
            System.out.println("Maio");
        } else if (x == 6) {
            System.out.println("Junho");
        } else if (x == 7) {
            System.out.println("Julho");
        } else if (x == 8) {
            System.out.println("Agosto");
        } else if (x == 9) {
            System.out.println("Setembro");
        } else if (x == 10) {
            System.out.println("Outubro");
        } else if (x == 11) {
            System.out.println("Novembro");
        } else if (x == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Digite um numero valido");
        }
    }

    public static void cas(int x) {
        switch (x) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Marco");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Digite um numero valido");
                break;
        }
    }

    public static void list(int x) {
        String[] m = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        System.out.println(m[x - 1]);
    }
}