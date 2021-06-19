/*
 Name:-    Niharika Poddar
 Date:-    19th June, 2021
 Project:- Queue Implementation from scratch
 LinearQueue class containing all operations pertaining to a Linear Queue.
 */
public class LinearQueue extends Queue
{
	void init()
	{
		System.out.println("-----------------LINEAR INTEGER QUEUE IMPLEMENTATION-----------------");
		System.out.println("Enter size of Queue:");
		size = sc.nextInt();
		Q = new int[size];
		rear = -1;
		front = 0;
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
	void enqueue()
	{
		if(!overflow())
		{
			int val;
			System.out.println("Enter number to enqueue:");
			val = sc.nextInt();
			Q[++rear]=val;
			System.out.println("Enqueued "+val+" successfully !");
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
			System.out.println("Dequeued "+Q[front++]+" successfully !");
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
			System.out.println("Current Queue Status:");
			for(int i = front;i<=rear;i++)
			{
				System.out.print(Q[i]+"\t");
			}
			System.out.println();
		}
		else
		{
			System.out.println("Queue is Empty!!");
		}
	}
}
