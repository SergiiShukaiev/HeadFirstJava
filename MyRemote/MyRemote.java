package HeadFirstJava.MyRemote;

/**
 * Created by Алина on 11.09.2016.
 */
import java.rmi.*;

public interface MyRemote extends Remote
{
    public String sayHello() throws RemoteException;
}
