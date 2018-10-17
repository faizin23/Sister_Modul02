/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package h_16650121;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LAB_TI
 */
public class tgs_no4 {
    public static void main(String[] args) throws IOException {
        boolean bol = true;
        int counter = 1;
        String data;
        Scanner scan = new Scanner(System.in);

        while (bol) {
            System.out.println("Masukkan text. Ketik 'exit' untuk keluar");
            System.out.print("Tulislah Hai Kawan : ");
            data = scan.nextLine();
            System.out.println("anda menulis : " + counter + ". " + data);
            if (data.equalsIgnoreCase("exit")) {
                bol = false;
                System.out.println("terima kasih");
            }
            counter++;
        }
    }
}
