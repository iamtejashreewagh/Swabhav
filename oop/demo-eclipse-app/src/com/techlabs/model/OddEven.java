package com.techlabs.model;

public class OddEven {
	
	public int[] getOddNumbers(int low, int high) {
		int index=0;
		int[] oddNumbers=new int[((low+high)/2)];
		for(int i=low;i<=high;i++) {
			if(i%2==1) {
			    oddNumbers[index]=i;
				index++;
			}
		}
		return oddNumbers;
	}
	
	public int[] getEvenNumbers(int low, int high) {
		int index=0;
		int[] evenNumbers=new int[((low+high)/2)+1];
		for(int i=low;i<=high;i++) {
			if(i%2==0) {
			    evenNumbers[index]=i;
				index++;
			}
		}
		return evenNumbers;
	}

}
