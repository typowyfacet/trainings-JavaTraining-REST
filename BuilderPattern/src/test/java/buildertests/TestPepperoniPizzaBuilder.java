package buildertests;

import builder.PepperoniPizzaBuilder;
import builder.Pizza;
import builder.PizzaBuilder;
import builder.Waiter;
import org.junit.Test;

import static enums.Topping.CHEESE;
import static enums.Topping.ONION;
import static enums.Topping.PEPPERONI;
import static enums.Topping.PEPPERONI_HAM;
import static enums.Shape.ROUND;
import static enums.Sauce.SPICY;
import static enums.Dough.THICK;
import static org.assertj.core.api.Assertions.assertThat;

public class TestPepperoniPizzaBuilder {

    @Test
    public void pepperoniPizza() {
        Waiter waiter = new Waiter();
        PizzaBuilder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();
        waiter.setPizzaBuilder(pepperoniPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        assertThat(pizza.getDough()).isEqualByComparingTo(THICK);
        assertThat(pizza.getSauce()).isEqualByComparingTo(SPICY);
        assertThat(pizza.getShape()).isEqualByComparingTo(ROUND);
        assertThat(pizza.getToppings()).isSubsetOf(ONION, CHEESE, PEPPERONI, PEPPERONI_HAM);
    }
}
