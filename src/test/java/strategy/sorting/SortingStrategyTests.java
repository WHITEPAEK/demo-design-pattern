package strategy.sorting;

import org.junit.jupiter.api.Test;

class SortingStrategyTests {

    @Test
    void array_sort_test() {
        int[] arr = {8, 5, 4, 7, 10, 1};

        ArraySorter arraySorter = new ArraySorter();
        arraySorter.setSortingStrategy(new BubbleSort());
        arraySorter.performSort(arr);

        System.out.println("------------------");
        arraySorter.setSortingStrategy(new QuickSort());
        arraySorter.performSort(arr);
    }

}
