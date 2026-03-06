package Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,4,5,6,6,6} ;
        System.out.println(Arrays.toString(arr));
        Set<Integer> uniqueElements = new HashSet<>();

        for(int x : arr) {
            uniqueElements.add(x);
        }
        System.out.println(uniqueElements);
    }
}
