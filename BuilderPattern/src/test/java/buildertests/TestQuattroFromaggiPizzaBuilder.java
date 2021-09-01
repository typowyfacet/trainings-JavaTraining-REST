package buildertests;

import builder.QuattroFormaggiPizzaBuilder;
import builder.Pizza;
import builder.PizzaBuilder;
import builder.Waiter;
import org.junit.Test;

import static enums.Dough.SUPER_THICK;
import static enums.Topping.CHEESE;
import static enums.Sauce.TOMATO;
import static enums.Shape.ROUND;
import static org.assertj.core.api.Assertions.assertThat;

public class TestQuattroFromaggiPizzaBuilder {

    @Test
    public void quattroFromaggiPizza() {
        Waiter waiter = new Waiter();
        PizzaBuilder quattroFormaggiPizzaBuilder = new QuattroFormaggiPizzaBuilder();
        waiter.setPizzaBuilder(quattroFormaggiPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        assertThat(pizza.getDough()).isEqualByComparingTo(SUPER_THICK);
        assertThat(pizza.getSauce()).isEqualByComparingTo(TOMATO);
        assertThat(pizza.getShape()).isEqualByComparingTo(ROUND);
        assertThat(pizza.getToppings()).isSubsetOf(CHEESE, CHEESE, CHEESE, CHEESE);
    }
}
