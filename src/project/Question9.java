package project;

/**Write a java program to find the second-largest
number in the array.
 */
public class Question9 {

    public static void main(String[] args) {
        int[] numbers = {21, 17, 35, 67, 29, 51, 89, 45, 22};
        int largest = 0;
        int secondLargest = 0;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;

            }
        }

        System.out.println("The second largest number is " + secondLargest);
    }
}
