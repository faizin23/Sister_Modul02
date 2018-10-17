/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package h_16650121;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author LAB_TI
 */
public class tgs_no3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String destination = "D:/faizin.txt";
        OutputStream output = new FileOutputStream(destination);
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader bufReader = new BufferedReader(reader);

        System.out.println("opened " + destination + " for writing");
        System.out.print("Tusliskan  : ");
        String name = bufReader.readLine();

        for (int i = 0; i < name.length(); i++) {
            output.write((byte) name.charAt(i));
        }

        output.close();
        System.out.println("Output Stream Closed");
    }
}
