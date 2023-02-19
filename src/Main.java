import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Please enter line number: ");
        number = input.nextInt();



        for (int i = 0;  i < number; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (number - i) - 1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}