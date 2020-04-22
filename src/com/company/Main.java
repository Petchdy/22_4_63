package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] seat = new int[R][C];
        int n = scan.nextInt();
        for (int a=0;a<n;a++){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            if (seat[Y-1][X-1]==0){
                seat[Y-1][X-1] = 1;
                System.out.printf("reserved complete\n");
            }
            else {
                System.out.printf("reserved not complete\n");
            }
        }
    }
}
