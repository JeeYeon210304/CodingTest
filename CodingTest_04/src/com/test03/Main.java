package com.test03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		int cnt = 0;
		int end = n;
		
		while (true) {
			
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			cnt++;
			
			if (end == n) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
