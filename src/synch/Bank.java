package synch;

/**
 * Created by Administrator on 2016/11/2.
 */



import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private final double[] accounts;
    private Lock banklock;
    private Condition sufficientFunds;


    //初始化构造函数
    public Bank(int n,double initialBalance){
        accounts=new double[n];
        for(int i=0;i<accounts.length;i++)
            accounts[i]=initialBalance;      //为每个线程初始化值
        banklock=new ReentrantLock();
        sufficientFunds=banklock.newCondition();   //新建条件对象
    }

    //模拟存钱取钱过程
    public void transfer(int from,int to,double amount) throws InterruptedException
    {
        banklock.lock();//对执行语句加锁
        try{

            //判断账户里的钱够不够传
            while(accounts[from]<amount)
                sufficientFunds.await();

            //若够，则进行下面的操作
            System.out.println(Thread.currentThread());
            accounts[from]-=amount;
            System.out.printf("%10.2f from %d to %d ",amount,from,to);


            accounts[to]+=amount;
            System.out.printf("Total Balance:%10.2f%n",getTotalBalance());


        }
        finally{
            //解锁操作
            banklock.unlock();
        }


    }


    public double getTotalBalance(){
        banklock.lock();
        try{
            double sum=0;

            for(double a:accounts)
                sum+=a;
            return sum;
        }
        finally {
            banklock.unlock();

        }
        }

    public int size()
    {
        return accounts.length;
    }




}
