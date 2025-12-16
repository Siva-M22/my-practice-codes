import java.util.Scanner;
public class ShoppingCard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number of Item:");
        int itemCount=sc.nextInt();
        double price=0;
        double total=0;
        for (int i = 1; i <= itemCount; i++) {
            System.out.println("Enter the price of Item"+i+":");
            price=sc.nextDouble();
            
            total+=price;
            
        }
        double discount=0;
        if(total>=250){
             discount=total/10;
        }
        
        if(total>=1000){
            discount=total*0.20;
        }
        total=total-discount;
        System.out.println("Total Amount is $" +total);
    }
    
}
