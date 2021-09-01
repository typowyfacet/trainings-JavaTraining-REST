package buildertests;

import builder.HawaiianPizzaBuilder;
import builder.Pizza;
import builder.PizzaBuilder;
import builder.Waiter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static enums.Dough.THICK;
import static enums.Sauce.TOMATO;
import static enums.Shape.ROUND;
import static enums.Topping.PINEAPPLE;
import static enums.Topping.HAM;
import static enums.Topping.CHEESE;


public class TestHawaiianPizzaBuilder {

    @Test
    public void hawaiianPizza() {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        assertThat(pizza.getDough()).isEqualByComparingTo(THICK);
        assertThat(pizza.getSauce()).isEqualByComparingTo(TOMATO);
        assertThat(pizza.getShape()).isEqualByComparingTo(ROUND);
        assertThat(pizza.getToppings()).isSubsetOf(PINEAPPLE, HAM, CHEESE);
    }
}
