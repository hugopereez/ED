package com.lis.Modelo;

public class BubbleSort {
	public void sortArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j+1);
				}
			}
			System.out.println("Change of partition index");
		}
	}

	public void swap(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}

}