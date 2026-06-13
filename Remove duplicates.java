import java.util.HashSet;

public class RemoveDuplicates
 {
    public static void main(String[] args) 
   {
        int[] arr = {4, 2, 1, 4, 3, 2, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}