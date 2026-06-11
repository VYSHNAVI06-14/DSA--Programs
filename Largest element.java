public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 9, 6};

        int max = arr[0];
        for (int x : arr) {
            if (x > max) 
              max = x;
        }

        System.out.println("Largest = " + max);
    }
}
