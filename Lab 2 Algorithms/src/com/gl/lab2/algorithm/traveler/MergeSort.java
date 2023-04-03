package com.gl.lab2.algorithm.traveler;

public class MergeSort implements SortingAlgo {

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
		mergeSort(array, 0, array.length - 1);
	}

	private void mergeSort(int[] arr, int left, int right) {

		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);

		mergeArray(arr, left, mid, right);

	}

	private void mergeArray(int[] array, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = array[left + i];
		}

		for (int j = 0; j < n2; j++) {
			rightArray[j] = array[mid + j + 1];
		}

		int i = 0, j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

}

