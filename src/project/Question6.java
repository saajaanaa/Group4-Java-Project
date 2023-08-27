package project;

/**Write a java program to check whether a given
number is prime or not.
 */
public class Question6 {

    public static void main(String[] args) {
        int num = 51;
        boolean condition = false;
        for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    condition = true;
                break;
            }
        }

        if (!condition)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }
}
