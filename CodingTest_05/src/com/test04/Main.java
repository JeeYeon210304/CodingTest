package com.test04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for(int i = 0; i < 10; i++) {
			a [i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < 10; i++) {
			a [i] = a[i] % 42;
		}
		
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = i+1; j < 10; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 0) {
				result++;
			}
		}
		System.out.println(result);
	}
}
