package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("goldilocks.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        String storyPiece = bufferedReader.readLine();
int number = 1;
//++number () vs number++ ()

        while (storyPiece != null) {
//       TODO: add sout for numbering before printing line
            System.out.print(number++ + ". ");
            System.out.println(storyPiece);
            storyPiece = bufferedReader.readLine();


        }


    }
}
