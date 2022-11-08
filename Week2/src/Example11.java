/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: Bir üeün tutarı giriniz
Adım3: Kdv'li fiyatını bulunuz
Adım4: Bitir
*/

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ürün tutarı giriniz");
        double tutar, kdvlifiyat, kdv = 0.18;
        tutar = input.nextDouble();
        kdvlifiyat = tutar + (kdv*tutar);
        System.out.println("Ürünün KDV'li fiyatı=" +kdvlifiyat);
    }
    
}
