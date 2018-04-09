/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLCJK;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author guest1Day
 */
abstract class Human {
    public ArrayList<Integer> mycards = new ArrayList<Integer>();
      ArrayList<Integer> cards = new ArrayList<Integer>();
   ArrayList<Integer> deal  = new ArrayList<Integer>();
   ArrayList<Integer> hit = new ArrayList<Integer>();
   ArrayList<Integer> setCard = new ArrayList<Integer>();
   
   
    
   
   
    
    
    public int open(){
        mycards.add(deal.get(0) + deal.get(1) );
        return 0;
    }
    public void setCard(){
        for (int i = 0; i <= 3; i++)
        mycards.add(hit.get(0));
        
                   }
    public boolean checkSum(){
        if
       
        
        return true;
    }
}

class User extends Human{
    
    
}

class Dealer extends Human{
      
   
   void Dealer ()
        { for (int i = 1; i <= 13; i++){  
        for (int j = 0; j < 4; j++)
        cards.add(i);}
            }
    
    ArrayList<Integer> deal(){
    Collections.shuffle(cards);
    deal.add(cards.get(0));
    deal.add(cards.get(1));
      return deal;
    }
   
    ArrayList<Integer> hit(){
    hit.add(cards.get(2));
    return hit;

        }


}

