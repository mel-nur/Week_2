/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: Dairenin yarıçapını gir
Adım3: Dairenin çevresini hesapla
Adım4: Dairenin alanını hesapla
Adım5: Bitir
*/

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz");
        double r = input.nextDouble();
        double çevre = 2*Math.PI*r;
        double alan = Math.PI*Math.pow(r, 2);
        System.out.println("Çevre=" +çevre+ "Alan=" +alan);
    }
    
}
