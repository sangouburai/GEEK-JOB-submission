/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfaa;



/**
 *
 * @author guest1Day
 */

class roon {
    
     String tnp = "";
     int bt = 0;

    
    void setroon(String glid, int adc) {
       
        this.tnp = glid;
        this.bt = adc;
    }
}

class RJeraser extends roon {
     void clear() {
         this.tnp = null;
         this.bt = 0;
        String msg = (this.tnp + "," +this.bt);
        System.out.print(msg);
    }
}

 class doom {

 public static void main(String[] args) {
    RJeraser soeda = new RJeraser();
     soeda.clear();
}
}
        
 
     



    

