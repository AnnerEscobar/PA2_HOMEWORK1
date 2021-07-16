    
    import java.util.Scanner;


public class Convertidor {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        
        String Nombre = "";
        double Cantidad = 0;
        int Opcion = 0;
        
        System.out.println("HELLO, ENTER YOUR FULL NAME");
        Nombre = sc.nextLine();
        System.out.println("ENTER AN AMOUNT");
        Cantidad = sc.nextInt();
        System.out.println("");
        
        System.out.println("WATH CURRENCY DO YOU WANT TO CONVERT TO");
        System.out.println("1. Dolares");
        System.out.println("2. Euros");
        System.out.println("3. Yuanes");
        Opcion = sc.nextInt();
        System.out.println("");
        
        switch(Opcion){
            case 1 -> {
                double dolares = Cantidad * 7.65;
                System.out.println("HI "+Nombre+" YOUR AMOUNT IN DOLLARS IS: "+ dolares);
            }
                
            
            case 2 -> { 
                double euros = Cantidad * 9.15;
                System.out.println("HI "+Nombre+" YOUR AMOUNT IN EUROS IS: "+ euros);
            }
                
            case 3 -> { 
                double yuanes = Cantidad * 1.20;
                System.out.println("HI "+Nombre+" YOUR AMOUNT IN YUANES IS: "+ yuanes);
            }
        }
       
            
    }
    
}
