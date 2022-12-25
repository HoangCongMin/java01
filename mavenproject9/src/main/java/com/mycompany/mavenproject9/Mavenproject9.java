/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

import java.util.Scanner;

/**
 *
 * @author hoangminh
 */
public class Mavenproject9 {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               int a,b,c;
                a = sc.nextInt();
                b = sc.nextInt();
                c=sc.nextInt();

        int gcd = 1;
        for (int i = 1; i <= a && i <= b && i<=c; i++) {
            if (a % i == 0 && b % i == 0 && c % i==0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
