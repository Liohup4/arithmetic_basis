package day01;

import java.util.Scanner;

public class Code02_SumOfFactorial {

    public static void Factorial(int N) {
        int cur = 1;
        int sum = 0;
        for(int i = 1; i <= N ; i++){
            cur = cur * i;
            sum += cur;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        int N = 3;
        Factorial(N);
    }
}