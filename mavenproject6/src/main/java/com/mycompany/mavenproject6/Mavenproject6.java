/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject6;
import java.util.Scanner;
/**
 *
 * @author hoangminh
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
                
 
        System.out.println("Giai thừa của " + b + " là: " + tinhGiaithua(b));

    }

    public static long tinhGiaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
}
