package com.test05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] a = new double[sc.nextInt()];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
		sc.close();
		
		double res = 0;
		Arrays.sort(a);
		
		for(int i = 0; i < a.length; i++) {
			res += ((a[i]/a[a.length-1])*100);
		}
		System.out.println(res/a.length);
	}
}







