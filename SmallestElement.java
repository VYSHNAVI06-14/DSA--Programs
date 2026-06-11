public class SmallestElement {
    public static void main(String[] args)
  {
        int[] arr = {2, 5, 1, 9, 6};

        int min = arr[0];
        for (int x : arr) {
            if (x < min) 
              min = x;
        }

        System.out.println("Smallest = " + min);
    }
}
