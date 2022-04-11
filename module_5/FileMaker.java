//  Scott Shannon            Assignment 5 Program 2                10 April 2022
// touch data.file, write to file new file or append with random numbers, close it and then display it

//imports
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class FileMaker {
    public static void main(String[] args) {

        //new file
        File file = new File("data.file");

        try {

            //if file does not exist then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            //make filewriter
            FileWriter f = new FileWriter(file, true);

            //iterate 10 times
            for (int i = 0; i < 10; i++) {

                // write random number to file
                int number = (int) (10 * Math.random() - 1);
                f.write(number + " ");
            }
            // close the file
            f.close();

            //make scanner
            Scanner myReader = new Scanner(file);

            //while to read output
            while (myReader.hasNextLine()) {
                String output = myReader.nextLine();
                System.out.println(output);
            }
            //close reader
            myReader.close();

            //catch errors
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}