package project;
/*Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.*/
public class Question4 {
    public static void main(String[] args) {
        int [][] numbers={{7,6,10,3},
                          {5,12,2,9},
                          };
        int sumEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {

                if (numbers[i][j] % 2 == 0){
                    sumEven = sumEven + numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is " + sumEven);

        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {

                if (numbers[i][j] % 2 != 0){
                    sumOdd = sumOdd + numbers[i][j];
                }
            }
        }
        System.out.println("The sum of odd numbers is " + sumOdd);
    }
}
