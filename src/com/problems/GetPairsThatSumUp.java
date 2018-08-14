package com.problems;

//find pairs that sum up to a number given an array of integers
import java.util.ArrayList;

public class GetPairsThatSumUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // int[] arr = {1,2,3,4,5,6,7,8};
		int[] arr = {1,2,3,4,5};
		ArrayList<int[]> arrayList = getPairsThatSumUp(arr);
		for(int[] ar: arrayList) {
			for(int k=0; k<ar.length; k++) {
				System.out.print(ar[k]);
				if(k<ar.length-1) 
					System.out.print(",");
			}
			System.out.println();
		}
	}

	 public static ArrayList<int[]> getPairsThatSumUp(int[] arr) {
		 ArrayList<Integer> intList =  new ArrayList<Integer>();
		 for(int a : arr) {
			 intList.add(a);
		 }
		 
		 ArrayList<int[]> arrayList = new ArrayList<int[]>();
		 for(int i=0; i<arr.length-1;i++) {			 
			 for(int j=i+1; j<arr.length; j++) {
				 if( intList.contains(arr[i] + arr[j]) ) {
					  int[] pair = {arr[i], arr[j]};
					  arrayList.add(pair);
				 }
			 }
		 }
		 
		 return arrayList;
	 }
}