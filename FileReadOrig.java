package adiPack;

import java.io.*;
// I added new Comment on 12/3/2023 at 6:46 PM
//I added new Comment on 12/3/2023 at 6:40 PM
//I added new Comment on 12/3/2023 at 6:18 PM
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FileReadOrig {
    public static void main(String[] args) {
       /*
            This code will read from the provided file.  You may not write any code in this section.
       */
        String script="";
        System.out.println("File Read Start");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/book.txt"));
            String line = "";
            int lineNum=0;
            while ((line = bufferedReader.readLine()) != null) {
                script+=line;
                lineNum++;
                if(lineNum%10000==0)System.out.println(lineNum);
            }
            System.out.println("Total Lines read=" + lineNum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File Read End");

        //fullScript contains all of the text from the book
        final String fullScript = script;

        /*
            This is where you will write your code.  Do not remove or change the timers.
       */

        //Start timing here
        long startTime = System.nanoTime();
        System.out.println("Starting Time.");
        
        try {
        for(int i = 0; i <10;i++)
        {
        	FileWriter fw = new FileWriter("output" + i + ".txt");
        	fw.write(fullScript);
        	fw.flush();
        }
        }catch(Exception ex)
        {
        	
        }
       
        /*
            End timing here.
            You must make sure the end timer is correct.
            If you have multiple threads then you may not want to end timing here.
            You must have an accurate time to be considered for extra credit.
         */

        long endTime = System.nanoTime();
        System.out.println("Total run time is "+(endTime-startTime));


    }



    }
