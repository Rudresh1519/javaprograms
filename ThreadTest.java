package assignment_2a;

public class ThreadTest {

	private static int count = 0;
	
	static String[] string1 = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen","fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"};
	 static String[] string2 = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
	
	 public static void check(int number1,String string3)
		{
		  if(number1>19)
		  {
			  System.out.print(string2[number1/10] +""+ string1[number1%10]);
		  }
		  else
			  System.out.print(string1[number1]);
		  
		  if(number1>0)
			  System.out.print(" "+string3+" ");
		  
		}
	 
	public static void main(String[] args) throws InterruptedException {
		
		 Thread t1 = new Thread(new Runnable() {

		        @Override
		        public void run() {

		            for (int i = 1; i <100; i++) {
		                synchronized (sampleClass.tObject) {
		                    incrementCount();		                    
		                    sampleClass.tObject.notify();
		                    try {
		                        sampleClass.tObject.wait();
		                    } catch (InterruptedException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }
		            }
		            
		        }
		    });
		    Thread t2 = new Thread(new Runnable() {

		        @Override
		        public void run() {

		            for (int i = 2; i <100; i++) {
		                synchronized (sampleClass.tObject) {
		                    incrementCount();
		                    sampleClass.tObject.notify();
		                    try {
		                        sampleClass.tObject.wait();
		                    } catch (InterruptedException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                    }
		                }  
		            }
		            System.out.println("hundred");
		        }
		    });
		    t1.start();
		    Thread.sleep(400);
		    t2.start();
		    t1.join();
		    t2.join();
		}

		private static void incrementCount() {
                int c = count++;
                if(c<100)
                {			
                	check(c," ");
		        }
		    }
		}

		  class sampleClass {

		 static final Object tObject = new Object();
		   

	}


