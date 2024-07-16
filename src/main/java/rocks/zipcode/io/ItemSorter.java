package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private final Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Item[] sortedItems = items.clone();

        //Sort using comparator
        Arrays.sort(sortedItems, comparator);

        return sortedItems;
    }
}
