
import java.util.Scanner;
import java.util.Random;

public class ArrayStuff{
    public static void main(String[] args){
        Scanner pipe = new Scanner(System.in);

        int[] dataPoints = new int[100];

        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("The values in dataPoints are:");

        for (int i = 0; i < dataPoints.length; i++){
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++){
            sum = sum + dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);
        int userNum = SafeInput.getRangedInt(
                pipe, "Enter a number between 1 and 100", 1, 100);
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userNum){
                count++;
            }
        }
        System.out.println("The value " + userNum +
                " was found " + count + " times in the array.");
        int searchNum = SafeInput.getRangedInt(
                pipe, "Enter another number between 1 and 100", 1, 100);
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == searchNum) {
                System.out.println("The value " + searchNum +
                        " was found at array index " + i);
                found = true;
                break;
            }
        }
        if (found == false){
            System.out.println("The value " + searchNum +
                    " was not found in the array.");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++){
            if (dataPoints[i] < min){
                min = dataPoints[i];
            }
            if (dataPoints[i] > max){
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        double[] doublePoints = new double[dataPoints.length];
        for (int i = 0; i < dataPoints.length; i++){
            doublePoints[i] = dataPoints[i];
        }
        System.out.println("Average of dataPoints is: " +
                getAverage(doublePoints));
    }

    public static double getAverage(double values[]){
        double sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        return sum / values.length;
    }
}
