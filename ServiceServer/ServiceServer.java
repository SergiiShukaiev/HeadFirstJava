package HeadFirstJava.ServiceServer;

/**
 * Created by Алина on 12.09.2016.
 */
import java.rmi.*;
public interface ServiceServer extends Remote
{
    Object[] getServiceList() throws RemoteException;
    Service getService(Object serviseKey) throws RemoteException;
}
