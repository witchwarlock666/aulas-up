public class Livro extends Leitura {
    private String autor, ISBN;
    private int numPaginas, anoPublicacao;

    public Livro(int codigo, String titulo, String editora, String edicao, String autor, String ISBN, int numPaginas, int anoPublicacao) {
        super(editora, edicao, codigo, titulo);
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Autor = %s\nISBN = %s\nNumero de Paginas = %d\nAno de Publicacao = %d", this.autor, this.ISBN, this.numPaginas, this.anoPublicacao);
    }
}
