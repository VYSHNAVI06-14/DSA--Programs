public class Secondmax {
    public static void main(String[] args) 
   {
        int[] arr = {5, 2, 9, 1, 6};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr)
       {
            if (x > first) 
              {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }

        System.out.println("Second Largest = " + second);
    }
}