package com.api;
/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "mike"),
                new Employee(2, "adam"),
                new Employee(3, "stallin")
        );

        List<EmployeeDto> dtos = employees.stream().map(A::mapToDto).collect(Collectors.toList());

    }

    static EmployeeDto mapToDto(Employee employee) {
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        return dto;
    }
}
*/
/*

public class A{
    public static void main(String[] args) {
        A a1=new A();
       int val= a1.test();
       System.out.println(val);
       C c1=new C();
       c1.test2();
    }
    public int test(){
        B b1=new B();

        return b1.test1();
    }
}
*/
/*

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Ignore non-alphanumeric characters and convert to lowercase
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

program of palindrome program
Logic To Sort an Array using bubble sort
*/