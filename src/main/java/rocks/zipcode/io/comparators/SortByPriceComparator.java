package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

//Creating SortByPriceComparator class so that we can implement the Comparator<Item> interface to compare Items based on price
public class SortByPriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        return Double.compare(item1.getPrice(), item2.getPrice());
    }
}
