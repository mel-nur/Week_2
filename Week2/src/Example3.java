/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: Birinci , ikinci ve üçüncü sayı değerlerini giriniz
Adım3: Girilen sayıları toplayıp yazdırın
Adım4: Girilen sayıların çarpıp yazdırın
Adım5: Toplamı üçe bölüp ortalamayı bulup yazıdırn
Adım: Bitir
*/

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen birinci sayı:");
        int a = input.nextInt();
        System.out.println("Lütfen ikinci sayı:");
        int b= input.nextInt();
        System.out.println("Lütfen üçüncü sayı:");
        int c= input.nextInt();
        int toplam = a+b+c;
        int carpim = a*b*c;
        double ort = (double) toplam/3;
        
        System.out.println("Ortalama:"+ ort+ ",Toplam ," +toplam + "Çaprım:" +carpim);
        
    }
 
}
