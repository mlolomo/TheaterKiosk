import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //class Theater
        //main()
        //num age
        //output "Enter your age: "
        //input age
        //if age >= 21 then
        //   output "You get a paper wristband"
        //end if
        //return
        //end class

        int age = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a paper wristband");
            }

        }
        else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}