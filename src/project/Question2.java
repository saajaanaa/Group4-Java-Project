package project;
/*Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array*/

public class Question2 {
    public static void main(String[] args) {
        int [] values={4,6,5,3};
        int sum=0;
        for (int i = 0; i < values.length ; i++) {
            sum=sum+values[i];

        }
        System.out.println(sum);
    }
}
