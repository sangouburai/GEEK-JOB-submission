/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filemaker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guest1Day
 */
public class FR {
    public static void main(String[] args) {
File fp = new File("sas.txt");

    // FileReader作成
    FileReader fr = null;
        try {
            fr = new FileReader(fp);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FR.class.getName()).log(Level.SEVERE, null, ex);
        }
    // BufferedReader作成
    BufferedReader br = new BufferedReader(fr);
        try {
            // 1行読み出し
            System.out.print(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(FR.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(FR.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
}
