package builder;

import static enums.Dough.SUPER_THICK;
import static enums.Sauce.TOMATO;
import static enums.Shape.ROUND;
import static enums.Topping.CHEESE;

/**
 * ConcreteBuilder
 */

public class QuattroFormaggiPizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough(SUPER_THICK);
    }

    public void buildSauce() {
        pizza.setSauce(TOMATO);
    }

    public void buildTopping() {
        pizza.setToppings(CHEESE, CHEESE, CHEESE, CHEESE);
    }

    public void buildShape() {
        pizza.setShape(ROUND);
    }
}
