/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject16;

import java.util.Scanner;

/**
 *
 * @author hoangminh
 */
public class Mavenproject16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");

            array[i] = sc.nextInt();
            if (array[i] > 100) {
                break;
            }

            int myNttame = array[i];
            for (int j = 1; j < array.length; j++) {
                if (myNttame > array[j]) {
                    array[i] = array[j];

                    array[j] = myNttame;

                    myNttame = array[i];

                }

            }

        }
        for (int x : array) 
          System.out.println(x);
        
    }

}
