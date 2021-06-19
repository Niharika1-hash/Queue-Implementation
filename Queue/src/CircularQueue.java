/*
 Name:-    Niharika Poddar
 Date:-    19th June, 2021
 Project:- Queue Implementation from scratch
 CircularQueue class containing all operations pertaining to a Circular Queue.
 */
public class CircularQueue extends Queue
{
	int count = 0;
	void init()
	{
		System.out.println("-----------------CIRCULAR INTEGER QUEUE IMPLEMENTATION-----------------");
		System.out.println("Enter size of Queue:");
		size = sc.nextInt();
		Q = new int[size];
		front = 0;
		rear = size-1;
		int ch;
		while(true)
		{
			System.out.println("Which operation do you want to execute?\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:enqueue();
					   break;
				case 2:dequeue();
					   break;
				case 3:display();
					   break;
				default:System.out.println("Exiting..");
						System.exit(0);
				
			}
		}
	}
	
	boolean overflow()
	{
		if(count==size)
		{
			return true;
		}
		return false;
	}
	
	boolean underflow()
	{
		if(count == 0)
		{
			return true;
		}
		return false;
	}
	void enqueue()
	{
		if(!overflow())
		{
			int val;
			System.out.println("Enter number to enqueue:");
			val = sc.nextInt();
			rear = (rear+1)%size;
			Q[rear]=val;
			System.out.println("Enqueued "+val+" successfully !");
			count ++;
		}
		else
		{
			System.out.println("Queue Overflow!! Enqueue failed !!");
		}
	}
	
	void dequeue()
	{
		if(!underflow())
		{
			System.out.println("Dequeued "+Q[front]+" successfully !");
			front = (front+1)%size ;
			count--;
		}
		else
		{
			System.out.println("Queue Underflow!! Enqueue failed !!");
		}
	}
	void display()
	{
		if(!underflow())
		{
			int f = front;
			System.out.println("Current Queue Status:");
			for(int i = 0;i<count;i++)
			{
				System.out.print(Q[f]+"\t");
				f = (f+1)%size;
			}
			System.out.println();
		}
		else
		{
			System.out.println("Queue is Empty!!");
		}
	}
}
