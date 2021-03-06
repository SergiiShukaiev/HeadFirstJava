package HeadFirstJava;

/**
 * Created by Алина on 30.08.2016.
 */
public class RayanandMonicaJob implements Runnable
{
 private BankAccount account=new BankAccount();
    public static void main(String[] args){
        RayanandMonicaJob theJob=new RayanandMonicaJob();
        Thread one=new Thread(theJob);
        Thread two=new Thread(theJob);
        one.setName("Райан");
        two.setName("Моника");
        one.start();
        two.start();
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            makeWithDrawel(10);
            if (account.getBalance() < 0) System.out.println("Превышение лимита!");
        }
    }

        private synchronized void makeWithDrawel(int amount){
    if(account.getBalance()>=amount){
        System.out.println(Thread.currentThread().getName()+" собирается снять деньги");
        try{
            System.out.println(Thread.currentThread().getName()+" идет подремать");
            Thread.sleep(500);
        } catch (InterruptedException ex) {ex.printStackTrace();}
        System.out.println(Thread.currentThread().getName()+" просыпается");
        account.withdraw(amount);
        System.out.println(Thread.currentThread().getName()+ " заканчивает транзакцию");
    }
            else System.out.println("Извините, для клиента "+Thread.currentThread().getName()+" недостаточно денег");
        }
}

 class BankAccount {
  private int balance=100;

     public int getBalance(){
         return balance;
     }

     public void withdraw(int amount){
         balance=balance-amount;
     }
}
