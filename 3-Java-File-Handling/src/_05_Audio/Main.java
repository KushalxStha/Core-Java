package _05_Audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);
        File sound = new File("files/AnytimeAnywhere.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(sound);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while(!response.equals("Q")) {
            System.out.println("P = Play | S = Stop | R = Reset | Q = Quit");
            System.out.print("Enter your Choice: ");
            response = sc.next().toUpperCase();

            switch(response) {
                case("P"): clip.start();
                    break;
                case("S"): clip.stop();
                    break;
                case("R"): clip.setMicrosecondPosition(0);
                    break;
                case("Q"): clip.close();
                    break;
                default: System.out.println("Not valid input.");
            }
        }
        sc.close();
        System.out.println("Audio player is closed.");
    }
}
