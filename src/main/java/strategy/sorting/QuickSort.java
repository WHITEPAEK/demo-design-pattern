package strategy.sorting;

// ConcreteStrategy
public class QuickSort implements SortingStrategy {

    @Override
    public void sort(int[] arr) {
        System.out.println("Quick Sort를 사용하여 배열을 정렬합니다.");
    }

}
