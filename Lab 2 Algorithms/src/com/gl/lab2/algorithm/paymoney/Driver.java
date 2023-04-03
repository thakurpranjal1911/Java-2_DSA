package com.gl.lab2.algorithm.paymoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		TargetCheck obj = new TargetCheck();

		System.out.println("Enter the size of array:");
		int size = scan.nextInt();

		int[] transactionArray = new int[size];

		System.out.println("Enter the values of array:");
		for (int i = 0; i < size; i++) {

			transactionArray[i] = scan.nextInt();

		}

		System.out.println("Enter the total no. of targets that needs to be achieved:");
		int totalTarget = scan.nextInt();

		for (int j = 0; j < totalTarget; j++) {

			System.out.println("Enter the value of target:");
			int target = scan.nextInt();
			int count = obj.isTargetPossible(transactionArray, target);
			if (count > 0) {
				System.out.println("Target achieved after " + count + " transactions");
			} else {
				System.out.println("Target could not be achieved");
			}

		}
		scan.close();
	}

}
