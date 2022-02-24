package com;

import java.util.Scanner;
import java.util.ArrayList;


public class employees {
    String firstName;
    String lastName;
    int age;
    int salary;

    public employees(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;


    }
    public class Employeelist {
        public static void main(String ar[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter no of the employees");
            int NumberOfEmployees = in.nextInt();
            ArrayList<employees> empList = new ArrayList<>();
            for (int i = 0; i < NumberOfEmployees; i++) {
                System.out.println("Enter Employee" + "(i+1) " + "details");
                System.out.println("Enter first name : ");
                String firstName = in.next();
                System.out.print("Enter last name : ");
                String lastName = in.next();
                System.out.println("Enter age : ");
                int age = in.nextInt();
                System.out.println("Enter salary : ");
                int salary = in.nextInt();
                employees emp = new employees(firstName, lastName, age, salary);
                empList.add(emp);
            }
            System.out.println("Enter first name and last name to search in Employee list");
            System.out.println("Enter first name");
            String firstName = in.next();
            System.out.println("Enter last name");
            String lastName = in.next();
            int f = 0;

            for (int i = 0; i < NumberOfEmployees; i++) {
                employees e = empList.get(i);
                if (e.firstName.equals(firstName) && e.lastName.equals(lastName)) {
                    f = 1;
                    System.out.println("Employee details are : ");
                    System.out.println("Name : " + (e.firstName + " " + e.lastName) + "age:" + e.age + "salary:" + e.salary + "\n");
                    break;
                }
            }
            if (f == 0) {
                System.out.println(firstName + " " + lastName + "is not present in employee list!");
            }
            System.out.println("Maximum salary is:");
            int maxSalary = Integer.MIN_VALUE;
            double averageAge = 0;
            employees oldestEmployee = empList.get(0);
            employees eldestEmployee = empList.get(0);
            for (int i = 0; i < NumberOfEmployees; i++) {
                employees e = empList.get(i);
                averageAge += e.age;
                if (oldestEmployee.age < e.age) {
                    oldestEmployee = e;
                }
                if (eldestEmployee.age > e.age) {
                    eldestEmployee = e;
                }
                if (e.salary > maxSalary) {
                    maxSalary = e.salary;
                }
            }
            System.out.println(maxSalary);
            System.out.println("Average age of all the employee's is:" + (averageAge / NumberOfEmployees));
            System.out.println("Eldest employee is:" + eldestEmployee.firstName + " " + eldestEmployee.lastName + "with age:" + eldestEmployee.age);
            System.out.println("oldest employee is:" + oldestEmployee.firstName + " " + oldestEmployee.lastName + "with age:" + oldestEmployee.age);
        }
    }
}

