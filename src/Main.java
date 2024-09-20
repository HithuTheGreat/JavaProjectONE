import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); /*Scanner (get user input): https://www.w3schools.com/java/java_user_input.asp*/
        System.out.println("Enter Password: ");
        String Password = myObj.nextLine();
        System.out.println("Username is: " + Password);
        System.out.println(Var.PeopleDatabaseRun);
        System.out.println(Var.DoublesPeopleDatabaseRun);
        System.out.println(Var.AdditionCode);
        System.out.println(Var.total);
    }
}