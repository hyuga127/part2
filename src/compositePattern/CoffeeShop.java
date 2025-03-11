package compositePattern;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements IComponent{
    private final List<IComponent> tables = new ArrayList<>();

    public void addTable(IComponent table) {
        tables.add(table);
    }

    @Override
    public double getPrice() {
        return tables.stream().mapToDouble(IComponent::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Coffee Shop Revenue: " + getPrice() + " VND";
    }
}
