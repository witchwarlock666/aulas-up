package heranca;

public class Cartao {
    
    //#region attributes

    protected String number;
    protected String date;
    protected String name;

    //#endregion

    //#region methods

    Cartao(String number, String date, String name) {
        this.number = number;
        this.date = date;
        this.name = name;
    }

    public boolean validadeNumber() {
        return true;
    }

    public boolean validadeDate() {
        return true;
    }

    public boolean validadeName() {
        return true;
    }

    //#endregion
}
