/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perevetish;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Perevetish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----Перевертыш----");
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chStr = str.toCharArray();
        char[] rChStr = new char[str.length()];
        
        for (int i = 0; i < rChStr.length; i++) {
            rChStr[i] = chStr[(chStr.length - 1) - i];
        }
        String rStr = new String(rChStr);
        System.out.println("Перевертыш: " + rStr);
        
        
        
        
       
      
                
    }
    
}
