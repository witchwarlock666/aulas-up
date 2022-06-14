import java.util.HashMap;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private int peso;
    private HashMap<String, String> telefones;
    
    public Pessoa(String nome, int idade, int peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.telefones = new HashMap<String, String>();
    }
    
    @Override
    public String toString(){
        return String.format("Nome: %s\nIdade: %d\nPeso: %d\n --------- \n", nome, idade, peso);
    }

    @Override
    public int compareTo(Pessoa o) {
        //typecast de o para Pessoa
        //Pessoa p = (Pessoa) o;
        if(this.idade > o.idade){
            return 1;
        }else if(this.idade < o.idade){
            return -1;
        }
        return 0;
    }
    public HashMap<String, String> getTelefones() {
        return telefones;
    }
   

}