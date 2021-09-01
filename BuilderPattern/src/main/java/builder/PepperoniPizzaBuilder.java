package builder;

import static enums.Dough.THICK;
import static enums.Sauce.SPICY;
import static enums.Topping.ONION;
import static enums.Topping.CHEESE;
import static enums.Topping.PEPPERONI;
import static enums.Topping.PEPPERONI_HAM;
import static enums.Shape.ROUND;

/**
 * ConcreteBuilder
 */

public class PepperoniPizzaBuilder extends PizzaBuilder {


    public void buildDough() {
        pizza.setDough(THICK);
    }

    public void buildSauce() {
        pizza.setSauce(SPICY);
    }

    public void buildTopping() {
        pizza.setToppings(ONION, CHEESE, PEPPERONI, PEPPERONI_HAM);
    }

    public void buildShape() {
        pizza.setShape(ROUND);
    }
}
