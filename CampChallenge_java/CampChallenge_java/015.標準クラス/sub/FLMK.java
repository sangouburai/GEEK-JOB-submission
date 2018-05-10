/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filemaker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author guest1Day
 */
public class FLMK {
        public static void main(String[] args) throws IOException {
        // ファイルオープン
        File fp = new File("sas.txt");

        // FileWriter作成
        FileWriter fw = new FileWriter(fp);
        // 書き込み
        fw.write("Name: Ikeshita Hikaru " + "age:20 ");
        // クローズ
        fw.close();
        
    }
    
}
