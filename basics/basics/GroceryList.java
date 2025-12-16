import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter item #" + i + ":");
            String item = sc.nextLine();

            if (item.equals("skip")) {     // skip this item
                continue;
            }

            if (item.equals("done")) {     // stop input
                break;
            }

            System.out.println("You added: " + item);
        }

        sc.close();
    }
}
