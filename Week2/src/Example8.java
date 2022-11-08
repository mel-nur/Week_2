/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: İletkenin direncini ve akımını giriniz
Adım3: İletkenin gerilimini gir
Adım4: Bitir
*/
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iletkenin direncini ve akımını giriniz:");
        double R = input.nextDouble();
        double I = input.nextDouble();
        double gerilim = R*I;
        System.out.println("Gerilim=" +gerilim);
    }
    
}
