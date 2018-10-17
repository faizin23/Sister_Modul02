/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package h_16650121;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author LAB_TI
 */
public class audio {
    public static void main(String[] args) throws Exception {
        String audioFile = "C:/Windows/Media/tada.wav";
        InputStream in = new FileInputStream(audioFile);
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }
}
