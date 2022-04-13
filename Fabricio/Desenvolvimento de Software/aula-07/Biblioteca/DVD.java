public class DVD extends Midia {
    private String diretor, estudio, legendas;

    DVD(String produtor, String genero, int duracao, int codigo, String titulo, String diretor, String estudio, String legendas) {
        super(produtor, genero, duracao, codigo, titulo);
        this.diretor = diretor;
        this.estudio = estudio;
        this.legendas = legendas;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getEstudio() {
        return estudio;
    }

    public String getLegendas() {
        return legendas;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void setLegendas(String legendas) {
        this.legendas = legendas;
    }
}
