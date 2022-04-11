import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class synchBankTest {
        public static final int NACCOUNTS = 100;
        public static final double INITIAL_BALANCE = 1000;
        public static final double MAX_AMOUNT = 1000;
        public static final int DELAY = 10;

        public static void main(String[] args)
        {
            Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
            for (int i = 0; i < NACCOUNTS; i++)
            {
                int fromAccount = i;
                Runnable r = () -> {
                    try
                    {
                        while (true)
                        {
                            int toAccount = (int) (bank.size() * Math.random());
                            double amount = MAX_AMOUNT * Math.random();
                            bank.transfer(fromAccount, toAccount, amount);
                            Thread.sleep((int) (DELAY * Math.random()));
                        }
                    }
                    catch (InterruptedException e)
                    {
                    }
                };
                Thread t = new Thread(r);
                t.start();
            }
        }
}
class BankLock {
    private final double[] accounts;
    private ReentrantLock bankLock = new ReentrantLock(); // 加锁

    /**
     * Constructs the bank.
     * @param n the number of accounts
     * @param initialBalance the initial balance for each account
     */
    public BankLock(int n, double initialBalance)
    {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    /**
     * Transfers money from one account to another.
     * @param from the account to transfer from
     * @param to the account to transfer to
     * @param amount the amount to transfer
     */
    public void transfer(int from, int to, double amount)
    {
        bankLock.lock();
        try{
            if (accounts[from] < amount) return;
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
        }finally {
            bankLock.unlock();
        }

    }

    /**
     * Gets the sum of all account balances.
     * @return the total balance
     */
    public double getTotalBalance()
    {
        double sum = 0;

        for (double a : accounts)
            sum += a;

        return sum;
    }

    /**
     * Gets the number of accounts in the bank.
     * @return the number of accounts
     */
    public int size()
    {
        return accounts.length;
    }
}