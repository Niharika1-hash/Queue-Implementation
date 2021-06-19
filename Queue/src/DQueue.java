/*
 Name:-    Niharika Poddar
 Date:-    19th June, 2021
 Project:- Queue Implementation from scratch
 DeQueue class containing all operations pertaining to a Double-Ended Queue. Implemented as a variant of Linear Queue.
 */
public class DQueue extends LinearQueue
{
	void init()
	{
		System.out.println("-----------------DOUBLE-ENDED INTEGER QUEUE IMPLEMENTATION-----------------");
		System.out.println("Enter size of Queue:");
		size = sc.nextInt();
		Q = new int[size];
		rear = -1;
		front = 0;
		
		int ch;
		while(true)
		{
			System.out.println("Which operation do you want to execute?\n1.Enqueue Front\n2.Enqueue Rear\n3.Dequeue Front\n4.Dequeue Rear\n5.Display\n6.Exit");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:enqueue_front();
					   break;
				case 2:enqueue();
					   break;
				case 3:dequeue();
					   break;
				case 4:dequeue_rear();
				   	   break;
				case 5:display();
						break;
				default:System.out.println("Exiting..");
						System.exit(0);
				
			}
		}
	}
	void enqueue_front()
	{
		if(!overflow())
		{
			if(front>rear)
			{
				enqueue();
			}
			else if(front<=rear && front!=0)
			{
				int val;
				System.out.println("Enter number to enqueue:");
				val = sc.nextInt();
				Q[--front]=val;
				System.out.println("Enqueued "+val+" successfully !");
			}
			else
			{
				System.out.println("Insertion not possible\n");
			}
		}
		else
		{
			System.out.println("Queue Overflow!! Enqueue failed !!");
		}
		
	}

	
	void dequeue_rear()
	{
		if(!underflow())
		{
			System.out.println("Dequeued "+Q[rear--]+" successfully !");
		}
		else
		{
			System.out.println("Queue Underflow!! Enqueue failed !!");
		}
			
		
	}

}
