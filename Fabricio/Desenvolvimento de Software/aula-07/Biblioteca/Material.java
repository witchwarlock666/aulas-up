public class Material {
    private int codigo;
    private String titulo;

    public Material(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    } 

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(":\nCodigo = %d\nTitulo = %s\n", this.codigo, this.titulo);
    }
}