import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        int[] array= new int[20];
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements:");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Array elements:");
            array[i]=sc.nextInt();            
        }
        int SmallestElement=array[0];

        for (int i = 0; i < n; i++) {
            if(array[i]<SmallestElement){
                SmallestElement=array[i];
            }

            
        }
        System.out.println("Largest element of the array is:"+SmallestElement);
    }
    
}
