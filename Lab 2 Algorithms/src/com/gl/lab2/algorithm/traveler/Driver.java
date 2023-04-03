package com.gl.lab2.algorithm.traveler;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Denomination obj = new Denomination();
		SortingAlgo sortObj = new MergeSort();

		System.out.println("Enter the size of currency denominations:");
		int size = scan.nextInt();

		int[] currencyDenominations = new int[size];
		System.out.println("Enter the currency denominations value:");
		for (int i = 0; i < size; i++) {
			currencyDenominations[i] = scan.nextInt();
		}

		sortObj.sort(currencyDenominations);

		System.out.println("Enter the amount you want to pay:");
		int amount = scan.nextInt();
		obj.denominationSet(currencyDenominations, amount);

		scan.close();
	}

}
