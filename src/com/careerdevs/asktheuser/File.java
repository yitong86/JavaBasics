package com.careerdevs.asktheuser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {

//http://textfiles.com/100/captmidn.txt
    public static void main(String[] args) throws IOException {
        //http://textfiles.com/100/captmidn.txt
        File file = new File("/Users/sophi/Desktop/captmidn.txt");
        Scanner scanner = new Scanner(file);

        String fileContent = "";
        while(scanner.hasNextLine()){
            fileContent = fileContent.concat(scanner.nextLine() +"\n");

        }
        FileWriter writer = new FileWriter("/Users/sophi/Desktop/newfile.txt");
        writer.write(fileContent);
        writer.close();
    }
}
