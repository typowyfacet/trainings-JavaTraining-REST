package builder;

import static enums.Dough.THICK;
import static enums.Sauce.TOMATO;
import static enums.Topping.HAM;
import static enums.Topping.CHEESE;
import static enums.Topping.PINEAPPLE;
import static enums.Shape.ROUND;

/**
 * ConcreteBuilder
 */

public class HawaiianPizzaBuilder extends PizzaBuilder {


    public void buildDough() {
        pizza.setDough(THICK);
    }

    public void buildSauce() {
        pizza.setSauce(TOMATO);
    }

    public void buildTopping() {
        pizza.setToppings(HAM, CHEESE, PINEAPPLE);
    }

    public void buildShape() {
        pizza.setShape(ROUND);
    }
}
