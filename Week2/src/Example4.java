/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Adım1: Başla
   Adım2: Üçgenin kenar uzunluğunu ve yüksekliğini gir.
   Adım3: Üçgenin alanını hesapla.
   Adım4: Bitir 
*/

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
      System.out.println("Lütfen üçgene ait kenar uzunluğunu ve yüksekliğini giriniz:");
      int a = input.nextInt();
      int b = input.nextInt();
      int alan = a*b/2;
      System.out.println("Alan:"+alan);
    }
    
}
