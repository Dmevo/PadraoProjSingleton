import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzariaTest {

    @Test
    public void deveRetornarNomePizzaria() {
        Pizzaria.getInstance().setNomePizzaria("Pizzaria Sabor Feliz");
        assertEquals("Pizzaria Sabor Feliz", Pizzaria.getInstance().getNomePizzaria());
    }

    @Test
    public void deveRetornarLogoPizzaria() {
        Pizzaria.getInstance().setLogoPizzaria("logo_pizzaria.png");
        assertEquals("logo_pizzaria.png", Pizzaria.getInstance().getLogoPizzaria());
    }

    @Test
    public void deveRetornarIngrediente() {
        Pizzaria.getInstance().setIngrediente("Molho de Tomate");
        assertEquals("Molho de Tomate", Pizzaria.getInstance().getIngrediente());
    }
}
