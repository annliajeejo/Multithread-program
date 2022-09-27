import java.util.Scanner;
public class OddEven
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("limit:");
		int limit=sc.nextInt();
		OddRunnable t1=new OddRunnable(limit);
		EvenRunnable t2=new EvenRunnable(limit);
		t1.start();
		t2.start();
	}
}
class OddRunnable extends Thread
{
	int limit;
	OddRunnable(int limit)
	
	{
		this.limit=limit;
	}
	public void run()
	{
		for(int even=2;even<=limit;even+=2)
		{
			System.out.println("Even thread:" +even);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){}
		}
	}
}

	class EvenRunnable extends Thread
{
	int limit;
	EvenRunnable(int limit)
	{
		this.limit=limit;
	}
	public void run()
	{
		for(int Odd=1;Odd<=limit;Odd+=2)
		{
			System.out.println("Odd thread:" +Odd);
			try{
				Thread.sleep(100);
			}
			catch(Exception e){}
		}
	}
}
	
		
		
