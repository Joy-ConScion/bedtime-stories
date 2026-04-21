//package com.pluralsight;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Application {
//    static Scanner keyboard = new Scanner(System.in);
//
//
//    public static void main(String[] args) throws IOException {
//
//
//        System.out.println("""
//                Stories Available:
//                goldilocks.txt
//                hansel_and_gretel.txt
//                mary_had_a_little_lamb.txt
//                """);
//        System.out.print("Choose story file: ");
//        String storyFile = keyboard.nextLine();
//
//        FileReader fileReader = new FileReader(storyFile);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        System.out.println("");
//        String storyPiece = bufferedReader.readLine();
//        int number = 1;
//
//        while (storyPiece != null) {
//            System.out.print(number++ + ". ");
//            System.out.println(storyPiece);
//            storyPiece = bufferedReader.readLine();
//
//        }
//    }
//}
//

//++number (1 is added before number is read | EX. jumps from 0 to 2 and starts at 2) vs num+-ber++ (1 is added after number is read | EX starts from 1 instead of jumping to 2)
//--------------------------------------------------------------------------------------------------struggling to find what is stopping my string from appearing
package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) throws IOException {


        try {
            System.out.println("""
                    Stories Available: 
                    goldilocks.txt
                    hansel_and_gretel.txt
                    mary_had_a_little_lamb.txt
                    """);
            System.out.print("Choose story file: ");
            String storyFile = keyboard.nextLine();

            FileReader fileReader = new FileReader(storyFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("");
            String storyPiece = bufferedReader.readLine();
            int number = 1;

            while (storyPiece != null) {
                System.out.print(number++ + ". ");
                System.out.println(storyPiece);
                storyPiece = bufferedReader.readLine();

            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Your submission could not be read.");
        }
    }
}


//++number (1 is added before number is read | EX. jumps from 0 to 2 and starts at 2) vs number++ (1 is added after number is read | EX starts from 1 instead of jumping to 2)
