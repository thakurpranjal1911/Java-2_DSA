package com.gl.lab2.algorithm.traveler;

public class Denomination {

	public void denominationSet(int[] sortedDenomination, int amount) {

		int[] notesCount = new int[sortedDenomination.length];

		try {

			for (int i = 0; i < sortedDenomination.length; i++) {
				if (sortedDenomination[i] <= amount) {
					notesCount[i] = amount / sortedDenomination[i];
					amount = amount % sortedDenomination[i]; // amount - (sortedDenomination[i]*notesCount[i])
					if (amount == 0) {
						break;
					}
				}
			}
			if (amount == 0) {
				System.out.println("The possible currency highest denominations with count");
				for (int i = 0; i < sortedDenomination.length; i++) {
					if (notesCount[i] > 0) {
						System.out.println(sortedDenomination[i] + " : " + notesCount[i]);
					}
				}
			} else {
				System.out.println("The given amount cannot be achieved using highest denominations");
			}

		} catch (ArithmeticException e) {
			System.out.println("Zero is not a valid denomination");
		}

	}

}
