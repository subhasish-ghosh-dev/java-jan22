/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosoftvw.class3;



import java.util.*;

public class WayTooLongWords {

    
        public WayTooLongWords(){
            
        }
	
	
	public String abbreviateWords(String word){
		StringBuilder strb = new StringBuilder();
		if(word.length()>10){
			strb.append(String.valueOf(word.charAt(0)));
			strb.append(word.substring(1,word.length()-1).length());
			strb.append(String.valueOf(word.charAt(word.length()-1)));
			return strb.toString();
		}
		else{
			return word;
		}		
	}
	
	
	public static void main(String[] args){
            
		WayTooLongWords robj = new WayTooLongWords();
                
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int i=1;
		while(sc.hasNext()){
			if(i++>count){
				break;
			}
			System.out.println(robj.abbreviateWords(sc.next()));
		}		
	}	
}
