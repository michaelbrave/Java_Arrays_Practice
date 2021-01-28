package com.tts;

// Write a program to sum all the values of a given Array in Java.

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num[] = fill();
        sum(num);
    }
    public static int [] fill() {
        int [] num = {0, 0, 0, 0, 0};
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
}

