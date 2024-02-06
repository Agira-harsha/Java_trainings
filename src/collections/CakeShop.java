package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CakeShop<String> implements Iterable<String> {
    private List<String> cakeFlavors;

    CakeShop() {
        this.cakeFlavors = new ArrayList<>();
    }

    private static int totalFlavors = 0;

    public void addCake(String element) {
        cakeFlavors.add(element);
        totalFlavors++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iter = new Iterator<String>() {
             int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < totalFlavors;
            }

            @Override
            public String next() {
                return cakeFlavors.get(currentIndex++);
            }
            @Override
            public void remove() {
                if (currentIndex > 0) {
                    cakeFlavors.remove(--currentIndex);
                    totalFlavors--;
                } else {
                    throw new IllegalStateException("remove() called before next()");
                }
            }
        };
        return iter;

    }
}
