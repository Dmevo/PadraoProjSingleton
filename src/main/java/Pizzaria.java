public class Pizzaria {

    private Pizzaria() {};
    private static Pizzaria instance = new Pizzaria();
    public static Pizzaria getInstance() {
        return instance;
    }

    private String nomePizzaria;
    private String logoPizzaria;
    private String ingrediente;

    public String getNomePizzaria() {
        return nomePizzaria;
    }

    public void setNomePizzaria(String nomePizzaria) {
        this.nomePizzaria = nomePizzaria;
    }

    public String getLogoPizzaria() {
        return logoPizzaria;
    }

    public void setLogoPizzaria(String logoPizzaria) {
        this.logoPizzaria = logoPizzaria;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
}
