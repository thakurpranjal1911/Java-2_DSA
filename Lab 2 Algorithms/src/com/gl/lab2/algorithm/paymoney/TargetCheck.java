package com.gl.lab2.algorithm.paymoney;

public class TargetCheck {

	public int isTargetPossible(int[] targetArray, int target) {

		int sum = 0;
		boolean flag = false;
		int count = 0;

		for (int i = 0; i < targetArray.length; i++) {

			if (targetArray[0] >= target) {
				flag = true;
				count++;
				break;
			} else {
				sum = sum + targetArray[i];
				if (sum >= target) {
					flag = true;
					count++;
				}

			}
		}

		if (flag == true) {
			return count;
		} else {
			return -1;
		}

	}

}
