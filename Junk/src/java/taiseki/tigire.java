/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taiseki;


import java.util.Random;

/**
 *
 * @author guest1Day
 */

public class tigire {
    
    public static void main (String args[]){
  
    
    int stack = 0;
    for(int i=0;i<18;i++){
        
    int Pow = 20 - stack;
        Random shot = new Random();
    int kkjd = shot.nextInt(100);
    
    if (kkjd%Pow == 0){
    System.out.print("kakkiiiiiin!!");}
    
    else{
    stack++;
    System.out.print("Booon..." + "   "+ "stack+" + stack );
    }
    
    }
    }
}

    
   
    

   
    

