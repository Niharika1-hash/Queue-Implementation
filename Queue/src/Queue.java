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
	boolean underflow()
	{
		if(front>rear)
		{
			return true;
		}
		return false;
		
	}
	boolean overflow()
	{
		if(rear == size-1)
		{
			return true;
		}
		return false;
	}
}







