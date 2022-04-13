import java.util.Date;

public class Revista extends Leitura {
    private String editorial, reportagemCapa, data;


    public Revista(int codigo, String titulo, String editora, String edicao, String data, String editorial, String reportagemCapa) {
        super(editora, edicao, codigo, titulo);
        this.data = data;
        this.editorial = editorial;
        this.reportagemCapa = reportagemCapa;
    }

    public String getReportagemCapa() {
        return reportagemCapa;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getData() {
        return data;
    }

    public void setReportagemCapa(String reportagemCapa) {
        this.reportagemCapa = reportagemCapa;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setData(String data) {
        this.data = data;
    }

    

    @Override
    public String toString() {
        return super.toString() + String.format("Editorial = %s\nReportagem da Capa = %s\nData de Publicacao = %s\n", editorial, reportagemCapa, data);
    }
}
