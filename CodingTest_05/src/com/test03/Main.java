package com.test03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		sc.close();
		
		String input  = String.valueOf(value);
		char[] ch = input.toCharArray();
		
		int[] count = new int[10];
		
		for(int i=0; i < ch.length; i++) {
			count[ch[i] - '0']++;
		}
		for(int res: count) {
			System.out.println(res);
		}
	}
}
