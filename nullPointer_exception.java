package com.acadgild.assignment.nullPointer.exception;

public class nullPointer_exception {
	
	public static void main(String args[])
	{
		try{
			String str=null;
			System.out.println (str.length());
		}
		catch(NullPointerException e){
			System.out.println("NullPointer Exception has occurred "+e);
		}
	}
}
