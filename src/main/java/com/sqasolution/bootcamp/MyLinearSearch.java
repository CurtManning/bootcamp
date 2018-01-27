package com.sqasolution.bootcamp;

/*
* write a method called leniarSearch taking 2 arguments that are integer Array and 
* searchKey and returns the index of the searchKey if the searchKey exists in array, otherwise return -1;
* sample Input
* int[] arr1= {23,45,21,55,234,1,34,90};
*        int searchKey = 34;
* sampleOutput
* Key 34 found at index: 6
*/

public class MyLinearSearch {

	public int linearSearch(int[] arr, int key) {

		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public void main(String[] args) {

		int[] arr1 = { 23, 45, 21, 55, 34, 1, 34, 90 };
		int k = 34;
		System.out.println("Key " + k + " found at index: " + linearSearch(arr1, k));

	}
}