package assignment_2a;

public class ThreadWordsSequence {

           private static int number = 1;

	       public static int increment()
	       {
		      return number++;
	       }

	public static void main(String[] args) throws InterruptedException 
	{			
		Runnable r1 = () ->
		{
			/* increment(); */
			
				for (int i = 1; i <= 100; i++)
				{
             //     synchronized (CommonUtil.mLock)
			   //   {
					int number1 = increment();

					if((number1 % 2)!= 0) 
					{
						if (number1 < 100)
						{
							NumToWord.check(number1, " ");
						}					
					}
		            /*CommonUtil.mLock.notify();
					try {
                        CommonUtil.mLock.wait();
                    } catch (InterruptedException e) {                      
                        e.printStackTrace();
                    }
                    }*/			
				}				
		};
		
		Runnable r2 = () ->
		{
			/* increment(); */
			
				for(int i = 1; i <= 100; i++)
				{
			//	synchronized (CommonUtil.mLock)
			//	{
					int number2 = increment();

					if (number2 % 2 == 0) 
					{
						if (number2 < 100)
						{
							NumToWord.check(number2, " ");
						}
						if (number2 == 100) 
						{
							System.out.println("hundred");
						}
					}
					
			/*	CommonUtil.mLock.notify();
			     try {
                         CommonUtil.mLock.wait();
                    } catch (InterruptedException e) {                      
                        e.printStackTrace();
                    }
				}*/
				}
		};

		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);

		thread1.start(); //instead of thread1 if we use thread2 it is giving even numbers
		
			Thread.sleep(400);
		
		thread2.start(); 
		
		Thread.sleep(400);
		
		thread1.join();
		thread2.join();
	}
}
	


