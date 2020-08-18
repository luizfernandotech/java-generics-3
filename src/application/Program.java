package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1, 2, 3, 4);
        List<Double> listDouble = Arrays.asList(3.14, 6.55);
        List<Object> listObject = new ArrayList<>();

        copy(listInteger, listObject);
        printList(listObject);

        copy(listDouble, listObject);
        printList(listObject);
    }

    public static void copy(List<? extends Number> source, List<? super Number> target) {
        for(Number number : source) {
            target.add(number);
        }
    }

    public static void printList(List<Object> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
