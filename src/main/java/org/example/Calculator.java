package org.example;

import java.util.List;

public class Calculator {


    public static  <T extends Number> T sum(T numberOne,  T numberTwo){
        return (T) new Double(numberTwo.doubleValue() + numberOne.doubleValue());
    }

    public static  <T extends Number> T multiply(T numberOne,  T numberTwo){
        return (T) new Double(numberTwo.doubleValue() * numberOne.doubleValue());
    }

    public static  <T extends Number> T divide(T numberOne,  T numberTwo){
        return (T) new Double(numberOne.doubleValue() / numberTwo.doubleValue());
    }

    public static  <T extends Number> T substract(T numberOne,  T numberTwo){
        return (T) new Double(numberOne.doubleValue() - numberTwo.doubleValue());
    }

    public <T> boolean compareArrays(T[] arrayOne, T[] arrayTwo) {
        if (arrayOne.length == arrayTwo.length
                && arrayOne.getClass().getSimpleName().equals(arrayTwo.getClass().getSimpleName())) {
            for (int i = 0; i < arrayOne.length; i++) {
               if(!(arrayOne[i] == arrayTwo[i])){
                   return false;
               }
            }
        } else {
            return false;
        }
        return true;
    }
}
