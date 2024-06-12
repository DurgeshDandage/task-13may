package Day9.String_Program;


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //check Prime Number Program in Java
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number Which You want :");
        int n=sc.nextInt();
        if (n <= 1) {
            System.out.println("This number is not prime Number");
            return;
        }
        int count = 0;
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }

        if (count > 1) {
            System.out.println("This number is not prime Number");
        } else {
            System.out.println("This number is a prime Number");
        }
    }

}

