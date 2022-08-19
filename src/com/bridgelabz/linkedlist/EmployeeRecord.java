package com.bridgelabz.linkedlist;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeRecord {
    LinkedList<EmployeeRecord> EmpList = new LinkedList<EmployeeRecord>();
    private String eid;
    private String ename;
    private String esalary;
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);

    public EmployeeRecord(String eid, String ename, String esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public EmployeeRecord() {

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

    public void addEmployee() {
        System.out.println("Enter Employee Id :");
        String eid = sc1.nextLine();
        System.out.println("Enter Employee Name :");
        String ename = sc2.nextLine();
        System.out.println("Enter Employee Salary :");
        String esalary = sc3.nextLine();
        EmpList.add(new EmployeeRecord(eid, ename, esalary));
    }

    public void showEmployee() {
        System.out.println("---------------------------");
        Iterator<EmployeeRecord> i = EmpList.iterator();
        while (i.hasNext()) {
            EmployeeRecord e = i.next();
            System.out.println(e);
        }
        System.out.println("---------------------------");
    }

    public void searchEmployee() {
        boolean found = false;
        System.out.println("Enter Employee ID to Search :");
        String empno = sc4.nextLine();
        System.out.println("---------------------------");
        Iterator<EmployeeRecord> i = EmpList.iterator();
        while (i.hasNext()) {
            EmployeeRecord e = i.next();
            if (e.getEmployeeId() == empno) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record Not Found");
        }
        System.out.println("---------------------------");
    }

}
