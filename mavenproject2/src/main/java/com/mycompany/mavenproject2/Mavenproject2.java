/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author hoangminh
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int[] myNames = { 3, 2, 7, 9,10,1,4,5,8,6};
        int i;
        int j;
        
        
        for(i=0;i<myNames.length-1;i++){
           int myNttame=myNames[i];
            for(j=i+1;j<myNames.length;j++){
                if(myNttame<myNames[j]){
                 myNames[i]=myNames[j];
                 myNames[j] = myNttame;
                 myNttame=myNames[i];
                }
                
            }
        }
        for(int x : myNames)
        System.out.println(x);
    }
}
