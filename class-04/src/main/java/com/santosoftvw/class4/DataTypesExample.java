/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosoftvw.class4;

/**
 *
 * @author subhasish
 */
public class DataTypesExample {
    
   //instance variables
   boolean checked=true;
   byte code=127;
   short morseCode=32767;
   int rollNo=999999999;
   long longNumber=1999999999;
   
   String gdp="24343244234.1234567777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777799999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999F";
   double totalSavings=234233423234.99999999999999999999999999999999999999999999999999999999999999999999999999999999;
   
   //static method
   public static void main(String[] args){
       boolean checked=false;
       byte code=17;
       short morseCode=37;
       int rollNo=9999;
       long longNumber=123;
       DataTypesExample obj = new DataTypesExample();
       
       System.out.println("Deafualt value of Boolean: "+checked);
       System.out.println("Deafualt value of Byte: "+obj.code);
       System.out.println("Deafualt value of Short: "+obj.morseCode);
       System.out.println("Deafualt value of Integer: "+obj.rollNo);
       System.out.println("Deafualt value of Long: "+obj.longNumber);
       System.out.println("Deafualt value of Float: "+/*Float.valueOf*/(obj.gdp));
       System.out.println("Deafualt value of Double: "+obj.totalSavings);
       
   }   
    
}
