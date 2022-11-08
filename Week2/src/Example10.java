/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Adım1: Başla
Adım2: Bir a değeri giriniz
Adım3: Küpün hacmini bulunuz
Adım4: Bitir
*/

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir a değeri giriniz:");
        int a = input.nextInt();
        int küp = a^3;
        System.out.println("Küpün hacmi=" +küp);
    }
    
}
