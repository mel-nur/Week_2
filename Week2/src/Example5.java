/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: Derece cinsinden açıyı gir
Adım3: Girilen açıyı radyan cinsinden hesapla
Adım4: Girilen açıyı gradyan cinsinden hesapla
Adım5: Bitir
*/

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("LÜtfen derece cinsinden açıyı giriniz:");
        double acı = input.nextDouble();
        double radyan = acı*Math.PI/180;
        double gradyan = acı*Math.PI/200;
        System.out.println("Radyan=" + radyan + "Gradyan=" + gradyan);
    }
    
}
