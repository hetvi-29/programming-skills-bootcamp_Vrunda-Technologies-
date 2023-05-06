package Week1.Day3.Arrays;

import java.util.Scanner;

public class ArraysIntroduction {
    public static void main(String[] args) {

        int x[] = new int[5];
        int y[] = { 11, 21, 31, 41, 51, 61, 71, 81 };

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }

        int q[][] = new int[3][3];
        int p[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                q[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(q[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
