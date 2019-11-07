public class Withdraw extends ATMMachine
{
    static double withdraw = 0;   
    public void setWithdraw(double w)
    {
        withdraw = w;
    }
    public static double getWithdraw()
    {
        return withdraw;
    }
}