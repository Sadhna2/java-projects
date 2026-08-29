package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Day3.Employee;

public class EmployeeMain {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int choice;
        EmployeeOperations e = new EmployeeOperations();
        while (true) {
            System.out.println("\npress 1 for adding Employee");
            System.out.println("press 2 for updating Employee");
            System.out.println("press 3 for deleting Employee");
            System.out.println("press 4 for Showing Employee list");
            System.out.println("press 5 for Search for Employee");
            System.out.println("press 6 for exit");

            choice = sc.nextInt();

            switch (choice) {
            case 1: {
                System.out.println("enter employeeNo, employee name, employee salary");

                int employeeNo = sc.nextInt();
                String employeeName = sc.next();
                double employeeSalary = sc.nextDouble();

                System.out.println(
                    e.addEmployee( employeeNo, employeeName, employeeSalary)
                );

                break;
            }
            case 2: {
                System.out.println("enter employeeNo, employee name, employee salary to update");

                int employeeNo = sc.nextInt();
                String employeeName = sc.next();
                double employeeSalary = sc.nextDouble();

                System.out.println(
                    e.updateEmployee( employeeNo, employeeName, employeeSalary)
                );

                break;
            }

            case 3: {
                System.out.println("enter employeeNo to delete");

                int employeeNo = sc.nextInt();

                System.out.println(
                    e.deleteEmployee( employeeNo)
                );

                break;
            }
            case 4: {
                System.out.println(e.showEmployeeDetails());
                break;
           }
           case 5: {
                System.out.println("enter employeeNo to search");
                int employeeNo = sc.nextInt();
                System.out.println(
                    e.searchForEmployee( employeeNo)
                );

                break;
            }
            case 6: {
                System.out.println("Program exited");
                return;
            }
            default:
                System.out.println("Invalid choice");
            }
        }
    }
}