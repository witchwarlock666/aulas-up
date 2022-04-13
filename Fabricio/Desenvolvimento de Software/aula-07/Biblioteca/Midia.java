public class Midia extends Material {
    private String produtor;
    private String genero;
    private int duracao;

    public Midia(String produtor, String genero, int duracao, int codigo, String titulo) {
        super(codigo, titulo);
        this.produtor = produtor;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getProdutor() {
        return produtor;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
