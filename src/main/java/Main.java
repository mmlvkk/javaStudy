import java.io.IOException;

public class Main 
{	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Thread[] threadVec = new Thread[10];
		
		//crate five threads and start them
		for (int i= 0;i < 5;i++)
		{
			threadVec[i] = new Thread(new MultiThreads(i));
			threadVec[i].start();
		}
		
		//we call join function
		for (int i = 0;i < 5;i++)
		{
//			threadVec[i].join();
		}
		
		System.out.println("this is main thread!");
		
	}
}
