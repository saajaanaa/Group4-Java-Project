package project;


/**
Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
*/
public class Question1 {

    public static void main(String[] args) {
       int[] temperatures = {92, 84, 78, 78, 84, 75, 81};

       int tempHigh = temperatures[0];
       int tempLow = temperatures[0];

       for (int i = 0; i < temperatures.length; i++){
           if (temperatures[i] > tempHigh){
               tempHigh = temperatures[i];
           }
           if (temperatures[i] < tempLow){
               tempLow = temperatures[i];
           }
       }
        System.out.println("Highest temperature of the week is " + tempHigh);
        System.out.println("Lowest temperature of the week is " + tempLow);
    }
}
