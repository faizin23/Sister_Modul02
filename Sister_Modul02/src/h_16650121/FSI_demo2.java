/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package h_16650121;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author LAB_TI
 */
public class FSI_demo2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String destination = "D:/hai.txt";
        OutputStream output = new FileOutputStream(destination);

        System.out.println("opened "+destination+" for writing");
        String data = "try to write data using output stream";

        for(int i = 0; i<data.length(); i++){
            output.write((byte) data.charAt(i));
        }

        output.close();
        System.out.println("Output Stream Closed");
    }
}
