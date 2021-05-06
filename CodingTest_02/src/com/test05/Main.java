package com.test05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int writeHour = sc.nextInt();
		int writeMinute = sc.nextInt();
		int h = writeHour;
		int m = writeMinute - 45;
		
		if(m < 0) {
			m += 60;
			h --;
			if (h < 0) {
				h += 24;
			}
		}
		System.out.println(h + " " + m);
		sc.close();
	}
}
