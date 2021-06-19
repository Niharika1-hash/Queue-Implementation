/*
 Name:-    Niharika Poddar
 Date:-    19th June, 2021
 Project:- Queue Implementation from scratch

 Main class containing Main function.
 */

import java.util.*;
public class Main 
{
	
	
	public static void main(String args[])
	{
		System.out.println("-----------------INTEGER QUEUE IMPLEMENTATION-----------------");
		System.out.println("Which Queue do you want to implement?");
		System.out.println("1.Linear Queue\n2.Circular Queue\n3.Double-Ended Queue\nEnter Choice:");
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice)
		{
			case 1 : implement_linearqueue();
					 break;
			case 2 : implement_circularqueue();
					 break;
			case 3 : implement_dqueue();
					 break;
		/*	case 4 :implement_priority_queue();
					 break; */
			default : System.out.println("Invalid Entry");
					  System.exit(0);
			
		}
		
	}
	public static void implement_linearqueue()
	{
		LinearQueue lq = new LinearQueue();
		lq.init();
	}
/*	public static void implement_priority_queue() 
	{
		PriorityQueue pq = new PriorityQueue();
		pq.init();
		
	} */

	public static void implement_dqueue() 
	{

		DQueue dq = new DQueue();
		dq.init();
		
	}

	public static void implement_circularqueue() 
	{

		CircularQueue cq = new CircularQueue();
		cq.init();
		
	}
	
	

}
