package Task;

import java.util.Scanner;

public class Student implements StudentFee {

    private String name;

    private double fees;

    public Student(String name) {

        this.name = name;

    }

    @Override

    public void getFee() throws InvalidFeeException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fees: ");

        

        if (!sc.hasNextDouble()) {

            throw new InvalidFeeException("Invalid input! Please enter numeric value.");

        }

        fees = sc.nextDouble();

        if (fees <= 0) {

            throw new InvalidFeeException("Fees cannot be negative or zero.");

        }

        System.out.println("Fees accepted for " + name + ": " + fees);

    }

    public static void main(String[] args) {

        Student s = new Student("Nickson");

        try {

            s.getFee();

        } 

        catch (InvalidFeeException e) {

            System.out.println("Exception: " + e.getMessage());

        }

    }

}