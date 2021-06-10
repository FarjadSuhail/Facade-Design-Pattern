import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 interface MobileShop {
    public void ModelNo();
    public void price();
}

 class Iphone implements MobileShop {
    @Override
    public void ModelNo() {
    
        System.out.println("Iphone 6");
    }
    @Override
    public void price() {
        System.out.println("65656565");
    }
}

 class Samsung implements MobileShop {
    @Override
    public void ModelNo() {
    
        System.out.println("Galaxy 6");
    }
    @Override
    public void price() {
        System.out.println("212112");
    }
}

 class ShopKeeper {

    private MobileShop iphone;
    private MobileShop samsung;
    
    public ShopKeeper(){
        iphone = new Iphone();
        samsung = new Samsung();
    }
    
    public void iphoneSale(){
        iphone.ModelNo();
        iphone.price();
    }
    
    public void samsungSale(){
        samsung.ModelNo();
        samsung.price();
    }
}

  class FacadePatternClient{
    // private static int choice;
    // public static void main(String[] args) throws NumberFormatException, IOException {
     
    //    System.out.println("1 iphone \n");
    //    System.out.println("2 samsun \n");
    //    System.out.println("Enter your choice");
       
    //    Scanner in = new Scanner(System.in);  
    //       System.out.print("Enter your name: ");  
    //       String name = in.nextLine();  
    //       System.out.println("Name is: " + name);             
    //       in.close();       
    // InputStreamReader r=new InputStreamReader(System.in);    
    // BufferedReader br=new BufferedReader(r);            
    // System.out.println("Please Enter Your Choice : ");    
      
      
    //   choice = Integer.parseInt(br.readLine());
       
    //   System.out.println(choice);
      
      
      
      
      
      
      
      
      
      
      
    //    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    //System.out.println(br);
    //    //choice = Integer.parseInt(br.readLine());
       
    //   // ShopKeeper obj = new ShopKeeper();
       
    //     //if (choice == 1){
    //       //  obj.iphoneSale();
            
    //     //}
        
    //     //obj.price();
    // //    obj.samsungSale();
    //     //System.out.println("Hello World");
     
    //  }
 }