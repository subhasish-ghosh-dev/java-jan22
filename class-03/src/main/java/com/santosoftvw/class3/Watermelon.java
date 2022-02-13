/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosoftvw.class3;



import java.io.*;

import java.util.*;

public class Watermelon {
    
    
    
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));    
        String st = null;
        int w = 1;
        int cnt=0;
        try {
            while((st=reader.readLine())!=null){
                w = Integer.valueOf(st);                
                break;                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        PrintWriter writer = new PrintWriter(System.out);
        
        
        if(w % 2 == 0){
            writer.println("YES");
        }
        else{
            writer.println("NO");
        }
        try {
            reader.close();
        } catch (IOException ex) {
            
        }
       writer.flush();
    }   
    
}