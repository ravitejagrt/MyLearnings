package com.sortings;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,3,5,4,2};
		bubbleSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static void bubbleSort(int[] arr) {
		int i ,j, c;
		boolean swap;
		int n = arr.length;
		for(i=0; i<n-1; i++) {
			swap = false;
			for(j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					c = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = c;
					swap = true;
				}
			}
			if(swap = false) {
				break;
			}
		}
	}
}
