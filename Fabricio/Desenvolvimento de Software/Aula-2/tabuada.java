public class tabuada {
    public static void main(String args[]) {
        int i, j;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {

                if (j < 10) {
                    System.out.print("| " + i + "x" + j + " = " + i*j + " ");
                }
                else {
                    System.out.println("| " + i + "x" + j + " = " + i*j + " |");
                }
            }
        }
    }
}
