/* @file DecimalToBinary.java
@brief Converting decimals to binaries.
@author Sara Barker
@date 9/7/2018 */

import java.util.Scanner;

    public class DecimalToBinary {

        public static void main(String[] args) {

            //variable declarations

            int decimal;
            int digit_1;
            int digit_2;
            int digit_3;
            int digit_4;
            int digit_5;
            int digit_6;
            int digit_7;
            int digit_8;
            int digit_9;
            int digit_10;

            Scanner frodo = new Scanner (System.in);

            //asking user for data

            System.out.println("Decimal to Binary Conversion: Enter an Integer Less Than or Equal to 1,000!");
            decimal = frodo.nextInt();

            System.out.println(decimal);

            //calculations

            digit_1 = decimal % 2;
            decimal = decimal / 2;

            digit_2 = decimal % 2;
            decimal = decimal / 2;

            digit_3 = decimal % 2;
            decimal = decimal / 2;

            digit_4 = decimal % 2;
            decimal = decimal / 2;

            digit_5 = decimal % 2;
            decimal = decimal / 2;

            digit_6 = decimal % 2;
            decimal = decimal / 2;

            digit_7 = decimal % 2;
            decimal = decimal / 2;

            digit_8 = decimal % 2;
            decimal = decimal / 2;

            digit_9 = decimal % 2;
            decimal = decimal / 2;

            digit_10 = decimal % 2;
            decimal = decimal / 2;

            //print results

            System.out.println();
            System.out.println("Your number is " + digit_10 + digit_9 + digit_8 + digit_7 + digit_6 + digit_5 + digit_4 + digit_3 + digit_2 + digit_1);
        }

    }
