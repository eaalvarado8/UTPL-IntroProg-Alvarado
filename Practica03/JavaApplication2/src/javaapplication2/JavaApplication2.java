/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      int a ;
      int b ;
      char op ;
      System.out.print("Ingrese a: ");
      a = sc.nextInt();
      System.out.print("Ingrese b: ");
      b = sc.nextInt();
      System.Char ("Ingrese op:" + '' );
      op = sc.nextcharArt('');
      System.out.print("El resultado es : ");
      if ( op == '+' ) {
          System.out.println( a + b);
      } else if ( op == '-') {
          System.out.println( a - b);
      } else if ( op == '*') {
          System.out.println( a * b);
      } else if ( op == '/') {
          System.out.println( a / b);
      }
    }
    
}
