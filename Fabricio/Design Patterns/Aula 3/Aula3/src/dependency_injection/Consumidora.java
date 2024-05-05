package dependency_injection;

public class Consumidora {
    private SuperClasse gerador;
    
    public Consumidora(SuperClasse gerador) {
        this.gerador = gerador;
    }
}
