package BaiTap;

import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");

    int a = scanner.nextInt();

    int[] b = new int[a];

    for (int i = 0; i < a; i++){
        System.out.print("Enter element in array: ");
         b [i] = scanner.nextInt();
    }

    int max = b[0];               
    for (int i = 1; i < a; i++) {
    if (b[i] > max) {
        max = b[i];            
    }
}
System.out.println("Max = " + max);

    }
}
