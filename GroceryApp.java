import java.util.*;

public class GroceryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>(20);

        System.out.println("1 --> for adding item");
        System.out.println("7 --> for removing an item");
        System.out.println("0 --> for exiting");
        System.out.println("9 --> for printing options");

        int num = input.nextInt();
        while(true){
            if (num == 9){
                System.out.println("1 --> for adding item");
                System.out.println("7 --> for removing an item");
                System.out.println("0 --> for exiting");
                System.out.println("9 --> for printing options");

                System.out.println("next command");
                num = input.nextInt();
            }

            if(num == 1){
                System.out.println("add");
                list.add(input.next());
                System.out.println(list);
                System.out.println("next command");
                num = input.nextInt();
            }

            if (num == 7){
                System.out.println("print index");
                int index = input.nextInt() - 1;
                list.remove(index);
                System.out.println(list);
                System.out.println("next command");
                num = input.nextInt();
            }

            if (num == 0){
                System.out.println("Thank you");
                break;
            }

        }
    }
}
