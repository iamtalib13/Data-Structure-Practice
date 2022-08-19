package com.bridgelabz.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


class EmployeeDetail {
    private String eid;
    private String ename;
    private String esalary;

    public EmployeeDetail(String eid, String ename, String esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public String getEmployeeId() {
        return eid;
    }

    public String getEmployeeName() {
        return ename;
    }

    public String getEmployeeSalary() {
        return esalary;

    }

    public String toString() {
        return eid + " " + ename + " " + esalary;
    }


}

public class Employee {

    public static void main(String[] args) {
        LinkedList<EmployeeDetail> EmpList = new LinkedList<EmployeeDetail>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);


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
                    System.out.println("Enter Employee Id :");
                    String eid = sc1.nextLine();
                    System.out.println("Enter Employee Name :");
                    String ename = sc2.nextLine();
                    System.out.println("Enter Employee Salary :");
                    String esalary = sc3.nextLine();
                    EmpList.add(new EmployeeDetail(eid, ename, esalary));
                    break;
                case 2:
                    System.out.println("---------------------------");
                    Iterator<EmployeeDetail> i = EmpList.iterator();
                    while (i.hasNext()) {
                        EmployeeDetail e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("---------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter Employee ID to Search :");
                    String empno = sc4.nextLine();
                    System.out.println("---------------------------");
                    i = EmpList.iterator();
                    while (i.hasNext())
                    {
                        EmployeeDetail e = i.next();
                        if (e.getEmployeeId() == empno)
                        {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found)
                        {
                            System.out.println("Record Not Found");
                        }
                        System.out.println("---------------------------");
                        break;


                        default:
                            System.out.println("Please Enter Valid Choice . .");
                    }
            } while (choice != 5) ;
        }


    }
