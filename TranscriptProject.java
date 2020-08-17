/**
 * Author: Juan Zaragoza
 * Class Name: TranscriptProject
 * Date Started: April 17, 2019 at 3:48PM
 * Date Finished: April 17, 2019 at 7:24PM
 * Discription: This Program will work as a calculator for student's to see their GPA based on the information they provide.
 * Also, after the GPA is calculated the student will be given the option to indicate whether or not they are transfering. Once they select
 * an option, they will recieve an answer and the Program will retire.
 */
import java.util.*;
public class TranscriptProject
{
    public static void main(String[] args) {
        Complete();
    } // end of main
    public static void Complete() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = kb.nextLine();
        System.out.println("Welcome " + name + " to the >>Academic Transcript<<, are you ready to begin?");
        System.out.println("Type the letter Y or N: ");
        char ch = kb.next().toUpperCase().charAt(0);
        if (ch == 'Y') {
           True();
        } else if (ch == 'N') {
           System.out.println("Oops there was a problem \\__o.o__/");
        }
        System.out.println("Congratulations "+ name +" you have completed your >>Academic Transcript<<!!");
    }
    public static void True() {
        Scanner kb = new Scanner(System.in);
        Guide();
        System.out.print("Perfect!! How many semesters were you/have you taken in school? ");
            int sem = kb.nextInt();
            System.out.println();
            double TotalGPA = 0.0;
            double NewGPA = 0.0;
        if (sem <= 0) {
         System.out.println("You did not go to school!");
        }
        for (int x = 1; x <= sem; x++) {
            System.out.print("How many classes did you take semester "+ x +"? ");
            int grade = kb.nextInt();
            double letter = 0.0;
            for (int y = 1; y <= grade; y++) {
            System.out.print("What was your grade for class "+ y +"? ");
            letter = letter + kb.nextDouble(); 
          }
           double GPA = (letter/grade);
           System.out.printf("Your GPA for this semester is a %.2f\n", GPA);
           TotalGPA = TotalGPA + GPA;
           NewGPA = TotalGPA/sem;
           System.out.println();
        }
        System.out.printf("Your overall GPA is: %.2f.\n", NewGPA);
        System.out.println("Are you transfering?");
        System.out.print("Type the letter Y or N: " );
        char YesNo = kb.next().toUpperCase().charAt(0);
        if (YesNo == 'Y') {
            if (NewGPA >= 3.0) {
                System.out.println("Your GPA is highly acceptable for universities!");
            } else if (NewGPA < 3.0 && NewGPA >= 2.0) {
                System.out.println("Your GPA can be accepted to some universities!");
            } else if (NewGPA < 2.0){
                System.out.println("Sorry, your GPA is not accepted by universities!");
            } 
        } else if (YesNo == 'N'){
            return;
        }
        System.out.println();
    }
    public static void Guide(){
        System.out.println(">>Guideline<<");
        System.out.println("When inputting grades for each class, substitute the \nnumber that corresponds with the letter. For Example: ");
        String[] list = new String[] {"F", "D", "C", "B", "A"};
        for (int i = 0; i < list.length; i++){
            System.out.println("Letter grade " + list[i].toString() + " is a " + i);
        }
        System.out.println();
    }
} // end of class