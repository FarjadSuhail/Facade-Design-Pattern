import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FacadePatternClient {
    private static int choice;
    public static void main(String[] args) throws NumberFormatException, IOException {
     
       System.out.println("1 iphone \n");
       System.out.println("2 samsun \n");
       System.out.println("Enter your choice");
       
       Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.nextLine();  
          System.out.println("Name is: " + name);             
          in.close();       
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Please Enter Your Choice : ");    
      
      
      choice = Integer.parseInt(br.readLine());
       
      System.out.println(choice);
      
      
      
      
      
      
      
      
      
      
      
     
     }
}
