package HeadFirstJava;

/**
 * Created by Алина on 29.08.2016.
 */
public class ThreadMyRunnableTestDrive
{
    public static void main(String[] args){
        Runnable threadJob=new MyRunnable();
        Thread myThread=new Thread(threadJob);

        myThread.start();

        System.out.println("Возвращаемся в метод main");
    }
}

class MyRunnable implements Runnable{
    public void run(){
        go();
    }
    public void go(){
        doMore();
    }
    public void doMore(){
        System.out.println("Вершина стека");
       // System.out.println(getStackTrace());
    }
}
