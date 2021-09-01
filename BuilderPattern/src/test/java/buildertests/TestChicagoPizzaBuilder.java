package buildertests;

import builder.ChicagoPizzaBuilder;
import builder.Waiter;
import builder.PizzaBuilder;
import builder.Pizza;
import org.junit.Test;

import static enums.Shape.RECTANGLE;
import static enums.Topping.CHEESE;
import static enums.Topping.SAUSAGE;
import static enums.Topping.ONION;
import static enums.Sauce.BBQ;
import static enums.Dough.SUPER_FLUFFY;
import static org.assertj.core.api.Assertions.assertThat;

public class TestChicagoPizzaBuilder {

    @Test
    public void chicagoPizza() {
        Waiter waiter = new Waiter();
        PizzaBuilder chicagoPizzaBuilder = new ChicagoPizzaBuilder();
        waiter.setPizzaBuilder(chicagoPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        assertThat(pizza.getDough()).isEqualByComparingTo(SUPER_FLUFFY);
        assertThat(pizza.getSauce()).isEqualByComparingTo(BBQ);
        assertThat(pizza.getShape()).isEqualByComparingTo(RECTANGLE);
        assertThat(pizza.getToppings()).isSubsetOf(CHEESE, SAUSAGE, ONION);
    }
}

