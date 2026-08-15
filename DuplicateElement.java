import java.util.HashSet;

public class DuplicateElement
{
    public static void main(String[] args)
 {
        int[] arr = {1, 2, 3, 4, 2, 5, 3};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        for(int num:duplicates)
        {
            System.out.println("Duplicate: " + num);
        }
    }

        
    
}