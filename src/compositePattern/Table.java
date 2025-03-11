package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Table implements IComponent{
    private final List<IComponent> products = new ArrayList<>();

    public void addProduct(IComponent product) {
        products.add(product);
    }

    @Override
    public double getPrice() {
        return products.stream().mapToDouble(IComponent::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Table (Total: " + getPrice() + " VND)";
    }

}
