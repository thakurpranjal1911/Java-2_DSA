package com.gl.lab2.algorithm.traveler;

public class BubbleSort implements SortingAlgo{

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
		bubbleSort(array);
		
	}
	
	private void bubbleSort(int[] array) {
		
		int size = array.length;
		int temp=0;
		for(int i=0; i < size; i++) {
			for(int j = 1; j < (size-i); j++) {
				if(array[j]>array[j-1]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}	
	}

}
