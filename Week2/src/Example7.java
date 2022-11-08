/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: Maddenin kütlesini,hızını ve yerden yükskeliğini giriniz
Adım3: Maddenin yerçekimi ivmesini giriniz
Adım4: Maddenin potansiyel enerjisini hesapla
Adım5: Maddenin kinetik enerjisini hesapla
Adım6: Bitir
*/

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen maddenin kütlesini, hızını ve yerden yüksekliğini giriniz:");
        double m = input.nextDouble();
        double V = input.nextDouble();
        double h = input.nextDouble();
        System.out.println("Lütfen maddenin yerçekimi ivmesini giriniz:");
        double g = input.nextDouble();
        double potansiyel_enerji = m*g*h;
        double kinetik_enerji = 1/2*m*V*V;
        System.out.println("Kinetik Enerji=" +kinetik_enerji+ "Potansiyel Enerji=" +potansiyel_enerji);
    }
    
}
