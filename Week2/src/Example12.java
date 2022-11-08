/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: a,b ve c değeri giriniz
Adım3: Dikdörtgenler prizmasının hacmini bulunuz
Adım4: Bitir
*/
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir a.b ve c değeri giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c =input.nextInt();
        int dikdortgenler_prizmasi = a*b*c ;
        System.out.println("Dikdörtgenler prizmasının hacmi=" +dikdortgenler_prizmasi);
        
    }
    
}
