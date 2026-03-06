package Sets;

import java.util.ArrayList;
import java.util.List;

public class WildCard {

    public static void printList(List<?> list) {
        for(Object o : list) {
            System.out.println(o+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Java");
        strings.add("Python");
        strings.add("C");
        printList(strings);

    }
}