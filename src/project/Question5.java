package project;
/**Write a program to swap 2 numbers without a
        temporary variable
 */

public class Question5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("The value of a before swapping is " +a);
        System.out.println("The value of b before swapping is " +b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("************************************");
        System.out.println("The value of a after swapping is " +a);
        System.out.println("The value of b after swapping is " +b);
    }
}
