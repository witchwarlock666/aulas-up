public class Leitura extends Material {
    private String editora;
    private String edicao;

    Leitura(String editora, String edicao, int codigo, String titulo) {
        super(codigo, titulo);
        this.editora = editora;
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Editora = %s\nEdicao = %s", this.editora, this.edicao);
    }
}
