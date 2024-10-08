import java.util.Random;

public class TestHeaps {
    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap();
        Random rand = new Random();

        for (int i = 0; i <= 7; i++) {
            int element = rand.nextInt(20) + 1;
            heap.add(element);
        }

        System.out.println(heap);
    }
}
