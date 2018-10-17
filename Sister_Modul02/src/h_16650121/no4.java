/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package h_16650121;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author LAB_TI
 */
public class no4 {
    public static void main(String[] args) throws IOException {
        try {
            OutputStream output = System.out;
            OutputStreamWriter writer = new OutputStreamWriter(output);
            writer.write("Hello world");
            writer.flush();
            writer.close();
        } catch (IOException ioe) {
            System.out.println("I/O error : " + ioe);
        }
    }
}
