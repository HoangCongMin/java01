/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject15;

import java.util.Scanner;

/**
 *
 * @author hoangminh
 */
public class Mavenproject15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count=0;

        n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");

            array[i] = sc.nextInt();
            if (array[i] > 100) {
                break;
            }
//            int temp = (int)Math.sqrt(i);
            if(array[i]%2==0){
               count++;
            }
        }
        System.out.println( count);
    }
}
