package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 10;
        float b = 6.5f;
        String key = "key";
        int value = 1613;
        Calculator calculator = new Calculator();
        Pair pair = new Pair(key, value);


//        String[] arr1 = new String[] {"apple", "pear", "cherry"};
//        String[] arr2 = new String[] {"apple", "pear", "cherry"};
//        String[] arr2 = new String[] {"apple", "pear", "cherry", "juice"};
        Integer[] arr2 = new Integer[] {1, 2, 3};
        Integer[] arr1 = new Integer[] {1, 2, 4};

        System.out.println(calculator.sum(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.divide(a, b));
        System.out.println(calculator.substract(a, b));
        System.out.println(calculator.compareArrays(arr1, arr2));
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}