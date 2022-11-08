/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: Kürenin yarıçapını gir
Adım3: Kürenin hacmini hesapla
Adım4: Kürenin alanını hesapla
Adım5: Bitir
*/

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kürenin yarıçapını giriniz:");
        double r = input.nextDouble();
        double hacim = 4/3*Math.PI*Math.pow(r,3);
        double alan = 4*Math.PI*Math.pow(r, 2);
        System.out.println("Hacim=" +hacim+ "Alan=" +alan);
        
    }
    
}
