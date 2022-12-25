/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;
import java.util.Scanner;


/**
 *
 * @author hoangminh
 */
public class Mavenproject8 {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               int a,b;
                a = sc.nextInt();
                b = sc.nextInt();

        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
