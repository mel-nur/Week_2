/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: km cinsinden bir sayı giriniz
Adım3: km değerini metreye çeviir
Adım4: Bİtir.
*/

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // konsoldan değer almak için tanımladık.
        System.out.println("Lütfen km cinsinden değer giriniz ;");
        int km = input .nextInt();
        int metre = km * 1000; 
        System.out.println("Hesaplanan metre;"+metre); 
              
    }
    
}
