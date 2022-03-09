// Java method to show that the main() method
// must be passed the String[] args
// while calling it from somewhere else
import java.io.*;
class Explicitly_Invoke_Main {
	
	// The method that calls the main() method
	static void mainCaller()
	{
		System.out.println("mainCaller!");
		// Calling the main() method
		// Note that no parameter is passed
		main();
	}

	// main() method
	public static void main(String[] args)
	{
		System.out.println("main");
		// Calling the mainCalller() method
		// so that main() methiod is called externally
		mainCaller();
	}
}