public class Programa {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(5,10);
        Ponto p3 = new Ponto(7,10);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.printf("p1 -> origem = %.2f\n", p1.distancia());
        System.out.printf("p2 -> p1 = %.2f\n", p2.distancia(p1));
        System.out.printf("p3 -> p2 = %.2f\n", p3.distancia(p2));
    }
}
