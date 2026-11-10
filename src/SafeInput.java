import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do{
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

        } while(retString.length() == 0);

        return retString;
    }
    public static int getInt(Scanner pipe, String prompt){
        int retVal = 0;
        boolean done = false;

        do{
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextInt()){
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else{
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine();
            }

        } while(!done);

        return retVal;
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;

        do{
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else {
                System.out.println("Invalid input. Please enter a number.");
                pipe.nextLine();
            }

        }while(!done);

        return retVal;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        int retVal = 0;
        boolean done = false;

        do{
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if(pipe.hasNextInt()){
                retVal = pipe.nextInt();
                pipe.nextLine();

                if(retVal >= low && retVal <= high){
                    done = true;
                }
                else{
                    System.out.println("Invalid input. Please enter a number between " + low + " and " + high + ".");
                }
            }
            else{
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine();
            }
        } while(!done);
        return retVal;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        double retVal = 0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if(pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                if(retVal >= low && retVal <= high) {
                    done = true;
                }
                else{
                    System.out.println("Invalid input. Please enter a number between " + low + " and " + high + ".");
                }
            }
            else {
                System.out.println("Invalid input. Please enter a decimal number.");
                pipe.nextLine();
            }
        } while(!done);
        return retVal;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt){
        String response = "";
        boolean done = false;
        boolean retVal = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();

            if(response.equalsIgnoreCase("Y")) {
                retVal = true;
                done = true;
            }
            else if(response.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            }
            else {
                System.out.println("Invalid input. Please enter Y or N.");
            }

        } while(!done);

        return retVal;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx){
        String retString = "";
        boolean done = false;

        do{
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

            if(retString.matches(regEx)){
                done = true;
            }
            else{
                System.out.println("Invalid input. Please try again.");
            }
        }while(!done);
        return retString;
    }
    public static void prettyHeader(String msg){
        for(int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        int spaces = (54 - msg.length()) / 2;
        int extraSpaces = 54 - msg.length() - spaces;

        System.out.print("***");

        for(int i = 0; i < spaces; i++){
            System.out.print(" ");
        }

        System.out.print(msg);
        for(int i = 0; i < extraSpaces; i++){
            System.out.print(" ");
        }

        System.out.println("***");
        for(int i = 0; i < 60; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
