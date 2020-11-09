/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservestrings;

import java.util.Scanner;

/**
 *
 * @author klinton
 */
public class ReserveStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word1;
        String revWord = "";
       
      System.out.println("Enter the word to be reversed;");
      Scanner sc = new Scanner(System.in);
      
      word1 = sc.nextLine();
      
      StringBuffer sb = new StringBuffer(word1);
      revWord = sb.reverse().toString();
      
      System.out.println("Original String is: "+ word1);
      System.out.println("Reversed String is: "+ revWord);
    }
    }
    
    

