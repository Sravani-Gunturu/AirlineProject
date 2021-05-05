
public class SavingsAccount {
	private double bankBalance;
	SavingsAccount(double bankBalance)
	{
	super();
	this.bankBalance = bankBalance;
}
void withdraw(double amountToWithdraw)
{
	System.out.println("Withdraw  : "+bankBalance);
	bankBalance = bankBalance - amountToWithdraw;
	//bankBalance = bankBalance - 20;
}
public double getBankBalance()
{
	return bankBalance;
}
@Override
public String toString()
{
	return "SavingsAccount [bankBalance=" + bankBalance + "]";
}
}