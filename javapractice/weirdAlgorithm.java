// package javapractice;

import java.util.Scanner;

public class weirdAlgorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        while (true){
            System.out.print(n + " ");
            if (n==1) break;
            else if (n%2==0) n/=2;
            else n=n*3+1;
        }
        sc.close();
    }
}
