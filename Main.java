import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                for (int j = 2; j >= 0; j--) {
                    x++;
                    array[i][j] = x;
                }
                System.out.println(Arrays.toString(array[i]));
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    x++;
                    array[i][j] = x;
                }
                System.out.println(Arrays.toString(array[i]));
            }
        }


        int sumOfStr = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumOfStr = sumOfStr + array[i][j];
            }
            System.out.println("Сумма " + (i + 1) + " столбца = " + sumOfStr);
            sumOfStr = 0;
        }

        int max1 = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max1) {
                    max1 = array[i][j];
                }
            }
            System.out.println("Максимум " + (i + 1) + "й стр = " + max1);
            max1 = array[i][0];
        }

        array[0][1] = -12;
        array[1][2] = -12;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("\n");

       //

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }




        

        // 1 2 3
        // 8 9 4
        // 7 6 5

        System.out.println("\n");


        int number = 123123123;
        String nm = Integer.toString(number);
        int Digit = 0;
        for (int i = 1; i < nm.length(); i++) {
            Digit = Digit + Integer.parseInt(Integer.toString(number).substring(i - 1, i));
        }
        System.out.println(Digit);

        int current = 0;

        boolean interuption = true;

        while (interuption) {
            Scanner scun = new Scanner(System.in);
            System.out.println("Введи num1 = ");
            int number1 = scun.nextInt();
            System.out.println("Введи op = ");
            char op = scun.next().charAt(0);
            int op2 = op;

            if (op2 == 42) {
                current = current * number1;
                System.out.println("cur * num2 = " + current);
            } else if (op2 == 47) {
                current = current / number1;
                System.out.println("cur / num2 = " + current);
            } else if (op2 == 43) {
                current = current + number1;
                System.out.println("cur + num2 = " + current);
            } else if (op2 == 45) {
                current = current - number1;
                System.out.println("cur - num2 = " + current);
            } else if (op2 == 101) {
                System.out.println("exit");
                interuption = false;
            } else {
                System.out.println("wrong command");
            }
        }


    }
}
