import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 interface CarDealer {
    public void ModelNo();
    public void price();
    public void horsepower();
    
}

 class Toyota implements CarDealer {
    @Override
    public void ModelNo() {
    
        System.out.println("Toyota Vitz");
    }
    @Override
    public void price() {
        System.out.println("3 Million");
    }
    @Override
    public void horsepower() {
        System.out.println("1300 CC");
    }
}

 class Honda implements CarDealer {
    @Override
    public void ModelNo() {
    
        System.out.println("Honda Civic");
    }
    @Override
    public void price() {
        System.out.println("4 Million");
    }
        @Override
    public void horsepower() {
        System.out.println("1800 CC");
    }
}

class Kia implements CarDealer {
    @Override
    public void ModelNo() {
    
        System.out.println("Kia Sportage");
    }
    @Override
    public void price() {
        System.out.println("6 Million");
    }
        @Override
    public void horsepower() {
        System.out.println("2000 CC");
    }
}
 class Car_Maker {

    private CarDealer toyota;
    private CarDealer honda;
    private CarDealer kia;
    
    public Car_Maker(){
        toyota = new Toyota();
        honda = new Honda();
        kia = new Kia();
    }
    
    public void toyota(){
        toyota.ModelNo();
        toyota.price();
        toyota.horsepower();
    }
    
    public void honda(){
        honda.ModelNo();
        honda.price();
        honda.horsepower();
    }
    
    public void kiaPurchase(){
        kia.ModelNo();
        kia.price();
        kia.horsepower();
    }
}

public class FacadePatternClient{
    private static int choice;
    public static void main(String[] args) throws NumberFormatException, IOException {
     
       System.out.println("1 Toyota Details \n");
       System.out.println("2 Honda Details \n");
       System.out.println("3 Kia Details \n");
       System.out.println("Enter your choice");
          
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
        System.out.println("Please Enter Your Choice : ");    
      
      
         //choice = Integer.parseInt(br.readLine());
        
        choice =4;
         System.out.println(choice);
      
       Car_Maker obj = new Car_Maker();

        System.out.println("\n");
       
        if (choice == 1){
           obj.toyota();
            
        }
        
        if (choice == 2){
           obj.honda();
            
        }
        
        if (choice == 3){
           obj.kiaPurchase();
            
        }
        
        else {
            System.out.println("Please enter a valid Choice");
        }
        
     }
 }