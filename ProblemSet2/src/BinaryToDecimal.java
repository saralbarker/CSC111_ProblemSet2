/* @file BinaryToDecimal.java
@brief Converting binaries to decimals.
@author Sara Barker
@date 9/7/2018 */

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        //variable declarations

        int binaryNumber;
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
        int result;

        Scanner frodo = new Scanner (System.in);

        //ask for data

        System.out.println("Binary to Decimal Conversion: Enter a binary number!");
        binaryNumber = frodo.nextInt();

        System.out.println(binaryNumber);

        //calculations

        digit_1 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        digit_2 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        digit_3 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        digit_4 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        digit_5 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        digit_6 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        digit_7 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        digit_8 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        digit_9 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        digit_10 = binaryNumber%10;
        binaryNumber = binaryNumber / 10;

        result = digit_1 * 1 + digit_2 * 2 + digit_3 * 4 + digit_4 * 8 + digit_5 * 16 + digit_6 * 32 +digit_7 * 64 + digit_8 * 128 + digit_9 * 256 + digit_10 * 512;

        //print results

        System.out.println();
        System.out.println("Your number is " + result);
    }

}
