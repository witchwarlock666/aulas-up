import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("João", 15, 43));
        pessoas.add(new Pessoa("Maria", 13, 47));
        pessoas.add(new Pessoa("Sexo e bagunça", 17, 89));
        pessoas.add(new Pessoa("Simone", 26, 57 ));
        pessoas.add(new Pessoa("Edilson Modo Fuga", 37, 120));
        pessoas.add(new Pessoa("Gambá", 3, 2));
        // foreach
        for(Pessoa p : pessoas){
            System.out.println(p);
        }
        // Ordenar a lista
        Collections.sort(pessoas);
        System.out.println("---------------------ORDENAÇÃO-------------------------");
         // foreach ordenado
         for(Pessoa p : pessoas){
            System.out.println(p);
        }
         //teste do map
        Pessoa p = new Pessoa("Gusta", 38, 90);
        p.getTelefones().put("Residencial",  " 2345678");
        p.getTelefones().put("Comercial", "41 986596- 3123");
        p.getTelefones().put("celular", "78789023");
        System.out.println(p);
        System.out.printf("Telefone celular: %s \n", p.getTelefones().get("celular"));


    }
}
