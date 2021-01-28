package com.tts;
import java.util.Arrays;
import java.lang.Math;

// Write a program to sum all the values of a given Array in Java.

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num[] = fill();
        int sum = sum(num);
        System.out.printf("the sum of the numbers is %d\n", sum);
        int size = 4;
        int power = 2;
        int [] result = toPower(size, power);
        System.out.printf("the power of %d, with a size of %d is = %s\n", power, size, Arrays.toString(result));
    }
    public static int [] fill() {
        int [] num = {1,5,6,5,4,22};
        return (num);
    }
    public static int sum(int[] num) {
        // find sum
        int sum = 0;
        for(int i = 0; i < num.length; i++) {
            //System.out.printf("%d\n", num[i]);
            sum += num[i];
        }
        return sum;
    }
    // Write a public static method called "toPower" that takes in as parameters two integers called size and power. The method should return an array of size "size" with each array index raised to the value of "power."
    // So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].
    public static int [] toPower(int size, int power) {
        int [] powers = new int[size];
        Arrays.fill(powers, 0);

        for(int i = 0; i < size; i++) {
            powers[i] = (int)Math.pow(i, power);
        }
        return powers;
    }
}

