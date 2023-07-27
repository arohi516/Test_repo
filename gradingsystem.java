import java.util.*;
public class gradingsystem {

    public static Scanner scn= new Scanner(System.in);

    public static void GradingSystem(int marks){
        
       
        if(marks>90){
            System.out.println("Excellent!");
        }

        else if(marks >80){
            System.out.println("Good!");
        }
        else if(marks>70){
            System.out.println("Fair!");
        }
        else if(marks>60){
            System.out.println("Meets Expectation!");

        }
        else{
            System.out.println("below par!!");
        }

    }
    public static void main(String[] args) {
        System.out.println("enter your marks : ");
        int marks = scn.nextInt();

        GradingSystem(marks);
        
        


        
    }
    
}
