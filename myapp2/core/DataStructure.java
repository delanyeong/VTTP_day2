package myapp2.core;

import java.util.*;

public class DataStructure {
    
    public static void main (String [] args) {

        //Create a list of Integer
        //List - generics
        //cannot assign a link of string to a link of integer
        List <Integer> intList = new LinkedList<Integer>();
        intList.add(Integer.parseInt("42"));
        intList.add(10);
        intList.add(50);
        intList.add(2, 15);

        System.out.println(intList);

        for (int i = 0; i < intList.size(); i++) {
            System.out.printf("%d = %d\n", i, intList.get(i) );
        }


    }
}
