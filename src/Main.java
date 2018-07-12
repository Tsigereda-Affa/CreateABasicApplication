import java.util.Scanner;
public class Main {
    //Your 6 year old client needs an application that will receive an integer from the user banging on the keyboard,
    // add 5 to it, double it, subtract 7 from it, and display the result to the screen.
    //create an object to every variable
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
       System.out.println("Please put a number");
        int x= sca.nextInt();
        int addedNumber = x+5;
        int doubleNumber= addedNumber*2;
        int subtractedNumber = doubleNumber-7;
        System.out.println("This is the result");
        System.out.println(subtractedNumber);

    }
}
