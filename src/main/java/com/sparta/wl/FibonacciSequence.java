package com.sparta.wl;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibbonaciNumber(13));
    }

    public static int fibbonaciNumber(int position) {
        if (position > 2)
            return fibbonaciNumber(position - 1) + fibbonaciNumber(position - 2);
        else if (position > 1)
            return 1;
        else
            return 0;
    }
}
