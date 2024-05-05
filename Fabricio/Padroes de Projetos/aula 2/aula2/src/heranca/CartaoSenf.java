package heranca;

public class CartaoSenf extends Cartao {
    CartaoSenf(String number, String date, String name) {
        super(number, date, name);
    }

    @Override
    public boolean validadeDate() {
        if (this.date.equalsIgnoreCase("2020")) {
            return false;
        }
        return true;
    }
}
