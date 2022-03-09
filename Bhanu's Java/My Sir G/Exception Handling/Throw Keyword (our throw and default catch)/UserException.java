class UserException
{
	public static void main(String[] args)
	{
		int balance = 5000;
		int withdrawlAmount = 6000;
		
		if(balance<withdrawlAmount)
			throw new ArithmeticException("Insufficient Balance");
		
		balance=balance-withdrawlAmount;
		System.out.println("Transaction Successfully Completed");
		System.out.println("Program Continue....");
		/*
		finally
		{
			System.out.println("After Throw");
			System.out.println("Thank you");
		}
		*/
	}
}