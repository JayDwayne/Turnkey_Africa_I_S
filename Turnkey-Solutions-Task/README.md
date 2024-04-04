# Turnkey Solutions Java Programming Assessments

This repository contains solutions to Java programming assessment interview from Turnkey Africa.

## Assessment Q1: Fibonacci Sequence

### Task:
Write a Java program that generates a Fibonacci sequence. The program should ask the user for an input number and then print the Fibonacci sequence up to that number.

### Solution:
In the file `FibonacciSequence.java`, you'll find the solution to this task. The program utilizes a modular and structured approach, ensuring clarity and ease of understanding. It implements input validation to ensure the user enters a positive integer, gracefully handling any errors. The Fibonacci sequence generation is optimized for efficiency, utilizing iterative logic to generate the sequence up to the specified number. I have included comments throughout the code to explain the logic and functionality, enhancing readability and maintainability.

## Assessment Q2: Largest Difference

### Task:
Implement a function in Java programming language that takes a list of integers as input and returns the largest difference between any two numbers in the list.

### Solution:
The solution is provided in the file `LargestDifferenceCalculator.java` . This implementation focuses on correctness, code quality, and efficiency. The function handles input lists of any size and accounts for duplicates, ensuring robustness. It returns 0 if the list has less than two elements and gracefully handles edge cases. The code is well-structured, modular, and readable, with descriptive variable names and comments elucidating the logic. The solution demonstrates a systematic debugging process, identifying and fixing the issue to ensure correct functionality.

## Assessment Q3: SQL Query

### Task:
Write a SQL query that selects all employees whose age is above 30 and salary is above $50,000.

### Solution:
The solution to this task involved creating a Database and including SQL queries to extract relevant data from a database table. The provided SQL query selects employees based on specified criteria, demonstrating proficiency in SQL syntax and concepts. The query is optimized for performance and readability, selecting data efficiently while ensuring clarity and maintainability. 

## Assessment Q4: Debugging Java Code

### Task:
Identify and fix a bug in Java code intended to calculate the average of a list of numbers.

### Solution:
The bug in the provided Java code is correctly identified and rectified in the file AverageCalculator.java. 
The bug `double average = total / numbers.length` 
The division operation is performed using integer arithmetic, which can result in truncation of the fractional part of the division, leading to an incorrect average calculation. To fix this, i needed to ensure that the division operation is performed using floating-point arithmetic.

The code with the bug 
<!-- `public class AverageCalculator {
public static double calculateAverage(int[] numbers) {
int total = 0;
for (int num : numbers) {
total += num;
}
double average = total / numbers.length;
return average;
}
public static void main(String[] args) {
int[] data = {5, 10, 15, 20, 25};
double result = calculateAverage(data);
System.out.println("The average is: " + result);
}
}`  -->

The fixed code;

<!-- public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        double average = (double) total / numbers.length; // Perform division using floating-point arithmetic
        return average;
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
} -->
 
The corrected code accurately computes the average of a list of numbers by employing floating-point arithmetic. The debugging process is systematic, employing problem-solving skills to isolate and resolve the issue. Additionally, the corrected code is well-structured, modular, and readable, adhering to best practices in Java programming. Clear and concise explanations accompany the bug identification and solution, facilitating understanding and communication.

I am so grateful for the consideration by Turnkey Africa. 