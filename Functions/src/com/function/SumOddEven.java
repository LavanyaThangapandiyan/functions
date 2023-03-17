package com.function;

import java.util.Scanner;
public class SumOddEven 
{

	public static int oddoreven(int [] array,int n)
	{
	int odd=0,even=0,war;
	for(int i=0; i<n; i++)
	{
	if(array[i]%2==0)
	{
	even=even+array[i];
	}
	else
	{
	odd=odd+array[i];
	}
	}
	System.out.println("sum of even numbers are:" +even);
	System.out.println("sum of odd numbers are:" +odd);
	if(odd>even)
	{
	war=odd-even;
	}
	else
	{
	war=even-odd;
	}
	System.out.println("War of Numbers([");
	for (int i=0; i<n; i++)
	{
	if(i<n-1)
	{
	System.out.print(array[i]+" , ");
	}
	else
	{
	System.out.print(array[i]+" , ");
	}
	}
	System.out.print("]) = "+war);
	//return odd,even,war;
	System.out.println("\n");
	return 0;
	}
	public static void main(String[] args)
	{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elements of the array:");
	n=sc.nextInt();
	int[] array = new int[5];
	System.out.println("Enter the elements of the array:");
	for (int i=0; i<n; i++)
	{
	array[i]=sc.nextInt();
	}
	System.out.println(oddoreven(array,n));
	}
	}
