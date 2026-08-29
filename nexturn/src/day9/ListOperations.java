package day9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(6);
        numbers.add(7);
        numbers.add(879);
        numbers.add(4);
        numbers.add(78);        

        int count = (int)numbers.stream().count();

        int min = numbers.stream()
                .min(Integer::compareTo)
                .get();


        
        int max = Collections.max(numbers);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println("Count = " + count);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}