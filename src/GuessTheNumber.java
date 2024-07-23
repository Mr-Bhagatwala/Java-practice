

import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Guess the number between 1 to 100 : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("hohoo ... you guess the right");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is too large...");
            }else{
                System.out.println("Your number is too small");
            }
        }while(userNumber > 0);

        System.out.print("My number is : ");
        System.out.println(myNumber);

    }
}
