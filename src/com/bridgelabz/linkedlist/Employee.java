package com.bridgelabz.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Employee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeRecord emp = new EmployeeRecord();
        int choice;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    emp.addEmployee();
                    break;
                case 2:
                    emp.showEmployee();
                    break;
                case 3:
                    emp.searchEmployee();
                    break;

                default:
                    System.out.println("Please Enter Valid Choice . .");
            }
        } while (choice != 5);
    }


}
