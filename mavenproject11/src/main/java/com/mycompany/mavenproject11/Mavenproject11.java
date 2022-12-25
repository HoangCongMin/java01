/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject11;

import java.util.Scanner;

/**
 *
 * @author hoangminh
 */
public class Mavenproject11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n;
        n = sc.nextInt();
        int[] array = new int[n];
//        a = sc.nextInt();

        int s1 = 0;
        
        System.out.println("Nhập các phần tử cho mảng: ");
	for (int i = 0; i < n; i++) {
		System.out.print("Nhập phần tử thứ " + i + ": ");
		array[i] = sc.nextInt();
                if(array[i]>100){
                     break;
                }
	}

        for (int i = 1; i <= n; i += 2) {
            s1 += i;
        }
        System.out.println("Tong cac so le tu 1 den 100 (tinh theo for): " + s1);
    }
}
