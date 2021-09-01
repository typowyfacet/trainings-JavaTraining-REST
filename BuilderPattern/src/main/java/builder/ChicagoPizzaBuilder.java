package builder;

import static enums.Dough.SUPER_FLUFFY;
import static enums.Sauce.BBQ;
import static enums.Topping.CHEESE;
import static enums.Topping.SAUSAGE;
import static enums.Topping.ONION;
import static enums.Shape.RECTANGLE;

/**
 * ConcreteBuilder
 */

public class ChicagoPizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough(SUPER_FLUFFY);
    }

    public void buildSauce() {
        pizza.setSauce(BBQ);
    }

    public void buildTopping() {
        pizza.setToppings(CHEESE, SAUSAGE, ONION);
    }

    public void buildShape() {
        pizza.setShape(RECTANGLE);
    }
}
