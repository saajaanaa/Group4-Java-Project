package project;

/**
Maximum and minimum number in the array
*/
public class Question8 {

    public static void main(String[] args) {
        int[] numbers = {1, 7, 9, 25, 32, 0, 6, 19};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }

}
