public class MultiThreads extends Thread
{
	private int index;
	public MultiThreads(int i)
	{
		this.index = i;
	}
	
	public void run()
	{
		System.out.println("in thread " + index);
		try
		{
			sleep(2000);
			System.out.println("thread " + index + " done");
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}