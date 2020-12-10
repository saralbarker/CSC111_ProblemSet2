/* @file LoanCalculator.java
@brief Implementing floating-point values to calculate loans.
@author Sara Barker
@date 9/10/2018 */

import java.util.Scanner;

public class LoanCalculator {

        public static void main (String[] args) {

            //variable declarations

            double loan;
            double monthly_Payment;
            double annual_InterestRate;
            double total_Interest;
            int term_Loan;

            Scanner frodo = new Scanner (System.in);

            //asking user

            System.out.println("Monthly Loan Payment Calculator!");
            System.out.println("Please enter the loan amount:");
            loan = frodo.nextDouble();

            System.out.println("Please enter the annual interest rate as an integer:");
            annual_InterestRate = frodo.nextDouble();


            System.out.println ("Please enter the term of the loan in years:");
            term_Loan = frodo.nextInt();

            //calculations

            double monthly_InterestRate = (annual_InterestRate / 100) /12;
            int n = 12 * term_Loan;

            //outputs

            monthly_Payment = (loan * (monthly_InterestRate) * Math.pow(1 + monthly_InterestRate, n)) / (Math.pow(1 + monthly_InterestRate, n) - 1);
            System.out.printf("Monthly payment: $%.2f", monthly_Payment);
            System.out.println();

            total_Interest = (monthly_Payment * n) - loan;
            System.out.printf("Total interest paid: $%.2f", total_Interest);
            System.out.println();

            System.out.println("Just a tip.");
            double monthly_Payment2 = (loan * (monthly_InterestRate) * Math.pow(1 + monthly_InterestRate, (n - 12))) / (Math.pow(1 + monthly_InterestRate, (n - 12)) - 1);
            double total_Interest2 = (monthly_Payment2 * (n - 12)) - loan;

            System.out.print("Paying off the loan in " + (term_Loan - 1));
            System.out.printf(" years, could save you $%.2f", (total_Interest - total_Interest2));
            System.out.printf(" in interest with a monthly payment of $%.2f", monthly_Payment2);
            System.out.println();

            double monthly_InterestRate3 = ((annual_InterestRate - 1) / 100) / 12;
            double monthly_Payment3 = loan * (monthly_InterestRate3) * Math.pow(1 + monthly_InterestRate3, n) / (Math.pow(1 + monthly_InterestRate3, n) - 1);
            double total_Interest3 = (monthly_Payment3 * n) - loan;

            System.out.printf("Dropping your rate to %.2f", (annual_InterestRate - 1));
            System.out.print("%");
            System.out.printf(", could save you $%.2f", (total_Interest - total_Interest3));
            System.out.printf(" in interest with a monthly payment of $%.2f", monthly_Payment3);

        }

    }

