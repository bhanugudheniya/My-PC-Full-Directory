class MainThread extends Thread
{
public static void main(String args[])
{
	Thread t = Thread.currentThread();
	System.out.println("The name before changing");
	System.out.println(t.getName());
	System.out.println(t.getPriority());	
	System.out.println("Name change");
	t.setName("New Bhanu");
	t.setPriority(MAX_PRIORITY);
          
        System.out.println("Main thread new priority: "+ t.getPriority());
	System.out.println("The name you've changed =>" + t.getName());
}
}
