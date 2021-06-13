/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex34;
import java.util.Scanner;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        displayEmployees(employees);
        employees = removeEmployee(employees);
        displayEmployees(employees);
    }

    public static void displayEmployees(String[] employees) {
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();
    }

    public static String[] removeEmployee(String[] employees) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an employee name to remove: ");
        String employee = input.nextLine();
        System.out.println();

        String[] copy = new String[employees.length - 1];

        for(int i = 0, j = 0; i < employees.length; i++) {
            if(!employees[i].equals(employee)) {
                copy[j++] = employees[i];
            }
        }

        return copy;
    }
}