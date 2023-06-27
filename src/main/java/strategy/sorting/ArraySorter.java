package strategy.sorting;

// Context
public class ArraySorter {

    private SortingStrategy strategy;

    public void setSortingStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void performSort(int[] arr) {
        strategy.sort(arr);
    }

}
