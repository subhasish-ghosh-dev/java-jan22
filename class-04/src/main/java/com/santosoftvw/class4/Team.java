/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosoftvw.class4;

import java.io.*;
import java.util.*;

/**
 *
 * @author subhasish
 */
public class Team {
    
    public static void main(String[] args){
        
        try {
            Scanner sc = new Scanner(new File("test.txt"));
            
            int n =  0;
            int idx = 0;
            int solved=0;
            
            while(sc.hasNextLine()){
                String line = sc.nextLine();
            
                int ability = 0;
                //System.out.println(line);
                if(idx<=0)
                    n = Integer.valueOf(line);
                else if(idx<=n){ //1 1 1
                    StringTokenizer tokens = new StringTokenizer(line);
                    
                    Iterator it = tokens.asIterator();
                    while(it.hasNext()){
                        //System.out.println(it.next());
                        if(it.next().equals("1")){
                            ability++;
                        }
                    }
                }
                if(ability>1){                    
                    solved++;
                }
                ability=0;
                idx++;
            }
            System.out.println(solved);
            sc.close();
        }
        
        catch (FileNotFoundException ex) {
           ex.printStackTrace();
        }
        
    }
    
    
}
