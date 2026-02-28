package array;

public class E2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(arr[1]);
        arr[1] = 50;
        System.out.println(arr[1]);

        // Access & Update elements in an array -> TC O(1)
        // This is because of index-based access
        // direct index-mapping
        // [dx = pos - 1] or pos = idx + 1

        // .length is a Property
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        for(Object o : arr) {
            System.out.print(o+" ");
        }
        System.out.println();
        String name = "Java";
        System.out.print(name.length()); // length() - Method
    }
}
/*
✅array.length is a property
✅sring.length() is a method

ℹ️memory Manegment
⭐array  object is sored in the heap
⭐variable reference is stored inthe stack
⭐elements are stored in te cntiguous memory blocks
*/