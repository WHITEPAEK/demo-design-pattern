package strategy.sorting;

// ConcreteStrategy
public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble Sort를 사용하여 배열을 정렬합니다.");
    }

}
