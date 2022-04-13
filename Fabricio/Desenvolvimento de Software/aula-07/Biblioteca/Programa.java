import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String data = dtf.format(now);

        Revista r = new Revista(1, "titulo", "editora", "edicao", data, "editorial", "reportagemCapa");

        System.out.println(r.toString());
    }
}
