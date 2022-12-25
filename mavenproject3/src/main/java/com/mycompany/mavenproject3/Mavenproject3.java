/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author hoangminh
 */
public class Mavenproject3 {
    public static void main(String[] args) {
         int[]   myNames= { 3, 2, 7, 9,10,1,4,5,8,6};
         
         for(int i=0; i<myNames.length;i++){
             
              if(myNames[i] % 2 != 0 )
              {
                 System.out.print(myNames[i] + " ");
              }
             
         }
        
    }
}
