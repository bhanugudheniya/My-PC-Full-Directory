class fortytwo implements Runnable
{
   Thread mythread ;
   fortytwo()
   { 
      mythread = new Thread(this, "my runnable thread");
      System.out.println("my thread created" + mythread);
      mythread.start();
   }
   public void run()
   {
      
	System.out.println("Printing tables");
        for (int i = 2; i <= 2; i++) {
 System.out.println("Table of " + i);
 for (int j = 1; j <= 10; j++) {
 System.out.println(i + "*" + j + "=" + i * j);
 }
 System.out.println("--------------");
 }
System.out.println("Printing alphabets");
for (char i = 'a'; i <= 'z'; i++) {
 System.out.println(i + " ");
 }

}
     
}
class fortytw
{
    public static void main(String args[])
    {
       fortytwo cnt = new fortytwo();
       try
       {
          while(cnt.mythread.isAlive())
          {
            System.out.println("Main thread will be alive till the child thread is live"); 
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Main thread interrupted");
       }
       System.out.println("Main thread run is over" );
    }
}
