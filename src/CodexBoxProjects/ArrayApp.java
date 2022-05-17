package CodexBoxProjects;

import java.util.Scanner;

public class ArrayApp {

    public static void main(String[] args) {

        int[] arr = {33, 21, 11, 10, 16, 15, 167, 17};

        Scanner sc = new Scanner(System.in);
        int min = arr[0];

        int max = arr[0];


//        for (int i = 1; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//
//
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//
//
//        }
//        System.out.println("min number is :" + min);
//        System.out.println("max number is :" + max);
//
//
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        int mini = 0, temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr.length; j++) {
//
//                if (arr[i] < arr[j]) {
//
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//
//        }
//
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//
//        int arr1[] = new int[5];
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print("enter  arr1 value: ");
//            arr1[i] = sc.nextInt();
//        }

        System.out.println();

//        for (int i : arr1) {
//
//
//            System.out.print(i+ " ");
//        }
//        System.out.println();

        int arr2[][] = new int[3][3];
//        for (:
//             ) {
//
//        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print("enter arr2 values : ");
                arr2[i][j] = sc.nextInt();
            }
        }



        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j]+ " ");
               // arr2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println();

        for (int[] num :arr2) {
            int i=0;
            int j = 1;
            int k=2;


            System.out.print(num[i] +" "+ num[j]+" "+num[k]);


            System.out.println();

        }




//        for (int num[]: arr2) {
//           int i=0;
//            for (int[] arr6:arr2) {
//                int j = 0;
//                System.out.print(num[j]+ " ");
//
//
//            }
//            System.out.println();
//
//        }



    }
}

