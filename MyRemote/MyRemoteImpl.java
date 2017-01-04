package HeadFirstJava.MyRemote;

import java.rmi.*;
import java.rmi.server.*;

/**
 * Created by Алина on 11.09.2016.
 */
public class MyRemoteImpl  extends UnicastRemoteObject implements MyRemote
{
    public String sayHello() throws RemoteException
    {
        return "Сервер говорит: 'Привет'";
    }

    public MyRemoteImpl() throws RemoteException
    {
    }

    public static void main(String[] args)
    {
        try
        {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind ("Удаленный привет", service);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}