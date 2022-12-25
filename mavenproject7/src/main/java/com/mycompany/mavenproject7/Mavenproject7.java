/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author hoangminh
 */
//        Scanner sc = new Scanner(System.in);
//        int b=sc.nextInt();
public class Mavenproject7 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n;
       
//       do {
//		System.out.println("Nhập vào số phần tử của mảng: ");
//	 n = sc.nextInt();
//	} while (n > 0);
//        int array[] = new int[n];

int array[] ;
        
        
        System.out.println("Nhập các phần tử cho mảng: ");
	for (int i = 0; i < n; i++) {
		System.out.print("Nhập phần tử thứ " + i + ": ");
		array[i] = sc.nextInt();
                if(array[i]==0){
                    return ;
                }
	}

        int b = array[0];
        for (int i = 0; i < array.length; i++) {
            if (b < array[i]) {
                b = array[i];
            }
        }
        System.out.println(b);

    }
}
