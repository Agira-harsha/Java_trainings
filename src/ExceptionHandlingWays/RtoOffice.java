package ExceptionHandlingWays;

import java.util.Scanner;

public class RtoOffice {
    void intiate(){
        Applicant applicant=new Applicant();
        for (;;){
            String yellow="\u001B[33m";
            System.out.println(yellow+"Do You Want Apply for Licence !! YES or no(enter any letter)");
            Scanner scanner=new Scanner(System.in);
            String input=scanner.next();
            if(input.equalsIgnoreCase("YES")){
                applicant.acceptAge();
                try {
                    applicant.validation(); //checked exception so
                } catch (Exception e) {
//                    e.getMessage();
                }
            }
            else{
                System.out.println("Thank you for Visiting !!");
                System.exit(0);
            }
        }

    }
}
