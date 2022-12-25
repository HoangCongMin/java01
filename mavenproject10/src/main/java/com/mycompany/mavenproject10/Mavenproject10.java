/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject10;

import java.util.Scanner;

/**
 *
 * @author hoangminh
 */
public class Mavenproject10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int a;
        a = sc.nextInt();

        if (a <= 1) {
            System.out.println("sai");
        }

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.println("sai");
            }
        }

        System.out.println("dung");

    }
}
