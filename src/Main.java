import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Ex1
        System.out.println("Задача 1");

        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = i + 1;
        }
        double[] arr2 = {1.57, 7.654, 9.986};

        boolean[] arr3 = {true, true, false, true};

        System.out.println();

        //Ex2
        System.out.println("Задача 2");

        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
        System.out.println();

        //Ex3
        System.out.println("Задача 3");

        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
        System.out.println();

        //Ex4
        System.out.println("Задача 4");

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
    }
}