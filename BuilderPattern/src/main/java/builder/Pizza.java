package builder;

import enums.Dough;
import enums.Sauce;
import enums.Shape;
import enums.Topping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Product
 */

public class Pizza {

    private Dough dough;
    private Sauce sauce;
    private ArrayList<Topping> toppings = new ArrayList<>();
    private Shape shape;

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setToppings(Topping... toppings) {
        this.toppings.addAll(Arrays.asList(toppings));
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public Shape getShape() {
        return shape;
    }
}
