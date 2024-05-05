package heranca;

public class Cliente {

    //#region attributes

    private String name;
    private String cpf;

    //#endregion

    Cliente() {}

    Cliente(String cpf) {
        if (cpf.equals("666")) {
            this.name = "Capeta De Monio";
            this.cpf = cpf;
        }
    }

    //#region methods



    //#endregion
}
