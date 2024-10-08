import java.util.Arrays;

public class BinaryHeap {
    private static final int INITIAL_SIZE = 10;
    private int[] heap;
    private int size;

    public BinaryHeap() {
        heap = new int[INITIAL_SIZE];
    }

    public void add(int element) {
        //the next available spot will be at the "size" index
        heap[size] = element;

        //adjust ordering
        swim(size);

        size++;
    }

    private void swim(int childIndex) {
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {
            if (heap[childIndex] < heap[parentIndex]) {
                swap(childIndex, parentIndex);
            } else {
                break;
            }

            //move childIndex to the parent
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
    }

    private void swap(int one, int two) {
        int temp = heap[one];
        heap[one] = heap[two];
        heap[two] = temp;
    }

    public void remove() {

    }

    public int peek() {
        return 0;
    }

    public String toString() {
        return Arrays.toString(heap);
    }
}
