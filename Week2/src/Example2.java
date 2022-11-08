/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım21: Fahrenheit cinsinden değer giriniz.
Adım3: Fahrenheit değerini celciusa çeviriniz
Adım4: Bitir
*/

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
       System.out.println("Lütfen fahrenheit derecesi:");
        double fahrenheit = input .nextDouble();
        double celcius = (fahrenheit-32)/1.8;
        System.out.println("değer:"+celcius);
        
       
    }
}
