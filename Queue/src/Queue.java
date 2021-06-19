/*
 Name:-    Niharika Poddar
 Date:-    19th June, 2021
 Project:- Queue Implementation from scratch
 Queue class (logically abstract) containing generic queue operation functions
 */

import java.util.*;
public class Queue 
{
	Scanner sc = new Scanner(System.in);
	int front,rear;
	int Q[];
	int size;
	
	void insert_rear()
	{
	}
	void delete_front()
	{
		
	}
	void display()
	{
	}
	
	void init()
	{
	
	}
	
	//applicable to Linear Queue
	boolean underflow()
	{
		if(front>rear)
		{
			return true;
		}
		return false;
		
	}
	
	//Applicable to Linear Queue
	boolean overflow()
	{
		if(rear == size-1)
		{
			return true;
		}
		return false;
	}
}







