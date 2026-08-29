package day9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollections {
    public static void main(String[] args) {
        List<Integer> items = List.of(20, 30, 40, 500, 60, 8);
        System.out.println(items);
        Set<Integer> st = Set.of(987, 54, 76, 42, 43);
        // st.add(4);                       
        // st.remove(Integer.valueOf(54)); 
        System.out.println(st);
        Map<Integer, String> mp = Map.of(
                2,"Java",3,"Python",4,"SQL");
        System.out.println(mp);
    }
}