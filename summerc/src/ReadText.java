
import java.io.File;
import java.util.Scanner;
import java.io.*;
public class ReadText extends HelloWorld {

//public variables 
public String a;


//Scanners
public  Scanner input = new Scanner(System.in);


	public void openFile(){ 
        	  try{
        	     System.out.println("enter name of file");
        	    
        	  File file = new File(input.nextLine());
        	  input = new Scanner (file);// finding a already made file
        	  readFile();
        	  }
        	  catch(Exception e) {
        		  System.out.println("can't find file");
        	  }
        	}
	
	public void readFile(){
			while(input.hasNext()) {
				String a = input.next();
				System.out.printf("%s\n", a);
				}
		
	}        
	
	public void closeFile(){
		input.close();
		}
}
	



