package com.company;

public class Main {

    private static final int MAXIMUM = 10;

    public static void main(String[] args) {
	    System.out.println("Good Afternoon!");
        System.out.println("Hope you have a good day.");

        int j = 0;
        for (int i=0; i<MAXIMUM; i++) {j = i;
            j= myMethod(j);
            if (j==50) {
                throw new myException();
            }

        }
    }

    private static int myMethod(int j) {
        int result;
        result = j*MAXIMUM;
        return  j;
    }

    private static class myException extends RuntimeException {
    }
}
