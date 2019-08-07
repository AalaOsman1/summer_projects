
import java.io.File;
import java.util.Scanner;
import java.io.*;

public class ReadText extends HelloWorld {

    // public variables
    public String a;
    public String op;

    // Scanners
    public Scanner input = new Scanner(System.in);
    public Scanner menuo = new Scanner(System.in);

    public void menu() throws FileNotFoundException {
        System.out.println("enter what you want,count,read");
        String op = menuo.nextLine();
        switch (op) {
        case "read":
            System.out.println("this will read the content of the file opened");
            readFile();
            break;
        case "count":
            System.out.println("this will count words");
            count();
            break;
        default:
            System.out.println("Invalid option. Please try again...");
            break;
        }
    }

    public void openFile() {
        try {
            System.out.println("enter name of file");
            File file = new File(input.nextLine());
            input = new Scanner(file);// finding a already made file
            menu();
        } catch (Exception e) {
            System.out.println("can't find file");
        }
    }

    public void readFile() {
        while (input.hasNext()) {
            String a = input.next();
            System.out.printf("%s\n", a);
        }

    }

    public void count() throws FileNotFoundException {
        int count = 0;
        while (input.hasNext()) {
            String x = input.next();
            if (x.indexOf("\\") == -1)
                count++;
        }
        System.out.println(" number of words on this text file is " + count);
    }

    public void closeFile() {
        input.close();
    }

}
