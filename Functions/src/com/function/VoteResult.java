package com.function;
import java.util.*;

public class VoteResult 
{
	public static int votecount(int uv,int dv)
	{
	int sum=uv-dv;
	return sum;
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Upvotes");
	int uv=sc.nextInt();
	System.out.println("Enter the Downvotes");
	int dv=sc.nextInt();

	int sum = votecount(uv, dv);
	System.out.println("getVoteCount(( upvotes: "+uv+",downvotes: "+dv+"))" +sum);
	}
	} 
	
