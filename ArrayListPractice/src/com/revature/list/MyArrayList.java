package com.revature.list;

public class MyArrayList {
	
	private int[] myArr = new int[10];
	private int count = 0;
	
	private void expand() {
		int [] newArr = new int [myArr.length * 2];
		for(int i = 0; i < myArr.length; i++) {
			newArr[i] = myArr[i];
		}
		
		myArr = newArr;
	}
	
//==========================
	
	public void add(int val) {
		if(count == myArr.length -1) {
			expand();
		}
		
		myArr [count] = val;
		count++;
		
	}

	public void set(int index, int val) {
		myArr[index] = val;
		
	}

	public void remove(int index) {
		
		int [] someArr = new int[count - 1];
		
		for(int j = 0; j < index; j++) {
			someArr[j] = myArr[j];
		}
		
		for(int j = index; j < count - 1; j++) {
			someArr[j] = myArr[j+1];
		}
		
		count--;
		myArr = someArr;
		
	}
	

	public int get(int index) {
		
		return myArr[index];
	}

	@Override
	public String toString() {
	
		StringBuilder myString = new StringBuilder("[");
		for(int i = 0; i < myArr.length; i++) {
			if(i == myArr.length - 1) {
				myString.append(myArr[i]);
				
			}else {
			myString.append(myArr[i] + ", ");
			}
		}
		myString.append("]");
		String newString = new String(myString);
		
		
		return newString;
	}
}
