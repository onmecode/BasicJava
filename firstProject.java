import java.util.Scanner;

public class MyJavaApp {
    public static void main(String[] args) {
        // create a new object scanner to read the line of the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, please enter your name");
        // assign the user input to a variable
        String userName = scan.nextLine();
        System.out.println("Good morning " + userName + " Welcome to the math quiz");
        System.out.println("Add 5 + 10");
        String userAnswer = scan.nextLine();
        int systemAnswer = 5 + 10;
        System.out.println(userName + "your answer is " +  userAnswer + " Correct answer to 5+10 is: " + systemAnswer);
    
        System.out.println("Well done " + userName + ".Let's try again!");
        System.out.println("First number:");
        int firstNumber = scan.nextInt();
        System.out.println("Second number:");
        int secondNumber = scan.nextInt();
        int resultAdd = firstNumber + secondNumber;
        int resultSot = firstNumber - secondNumber;
        int resultMult = firstNumber * secondNumber;
        double resultDiv = firstNumber / secondNumber;
        System.out.println( firstNumber + " + " + secondNumber  + " is equal to " + resultAdd);
        System.out.println( firstNumber + " - " + secondNumber  + " is equal to " + resultSot);
        System.out.println( firstNumber + " * " + secondNumber  + " is equal to " + resultMult);
        System.out.println( firstNumber + " / " + secondNumber  + " is equal to " + resultDiv);
           
    }


}
