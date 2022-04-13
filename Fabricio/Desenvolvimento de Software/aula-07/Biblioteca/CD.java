public class CD extends Midia {
    private String banda;
    private int anoLancamento, numFaixas;

    CD(String produtor, String genero, int duracao, int codigo, String titulo, String banda, int anoLancamento, int numFaixas) {
        super(produtor, genero, duracao, codigo, titulo);
        this.banda = banda;
        this.anoLancamento = anoLancamento;
        this.numFaixas = numFaixas;
    }

    public String getBanda() {
        return banda;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
