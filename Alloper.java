package Operators;

// Demonstrates the use of different Java operators with simple integer and boolean values.
public class Alloper {
    public static void main(String[] args) {
        // Two integer values used to test arithmetic, relational, and bitwise operations.
        int a = 10;
        int b = 5;

        // Arithmetic operators perform mathematical calculations on numeric values.
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational operators compare values and return a boolean result.
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical operators combine boolean expressions.
        boolean x = true;
        boolean y = true;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Bitwise operators work on the individual bits of integer values.
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise NOT: " + (~a));

        // Assignment operators update the value of a variable using shorthand notation.
        int c = 20;
        c -= 5; // Equivalent to: c = c - 5
        System.out.println("Assignment Operator -= : " + c);
    }
}
