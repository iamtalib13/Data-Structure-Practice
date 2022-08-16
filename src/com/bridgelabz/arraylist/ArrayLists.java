package com.bridgelabz.arraylist;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

//-----------------------------------------------------------------------
        //Add Elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);
//-----------------------------------------------------------------------
        //get element
        int element = list.get(2);
        System.out.println(element);
//-----------------------------------------------------------------------
        //Add element in between - parameter 1 is for index and parameter 2 is for value
        list.add(0, 1);
        System.out.println(list);
//-----------------------------------------------------------------------
        //set element at index , or modify value at index
        list.set(0, 5);
        System.out.println(list);
//-----------------------------------------------------------------------
        //Delete Element
        list.remove(3);
        System.out.println(list);
//-----------------------------------------------------------------------

        //Size
        int size = list.size();
        System.out.println("ArrayList Size : " + size);
//-----------------------------------------------------------------------
        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

        }
        System.out.println();
//-----------------------------------------------------------------------
        //Sorting
        Collections.sort(list);
        System.out.println(list);


    }
}
