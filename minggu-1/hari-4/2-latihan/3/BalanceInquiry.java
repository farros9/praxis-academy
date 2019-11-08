public class BalanceInquiry extends ATMMachine
{
    static double balance = 0;
    public void setBalance(double b)
    {
        balance = b;
    }
    public static double getBalance()
    {
        return balance;
    }   
}
