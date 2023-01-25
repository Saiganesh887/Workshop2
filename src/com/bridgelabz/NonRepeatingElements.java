package com.bridgelabz;

import java.util.Scanner;

public class NonRepeatingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++){
            if (visited[i] == true);
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                if (count == 1)
                    System.out.println(arr[i]);
        }
    }
}