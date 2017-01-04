package HeadFirstJava.ServiceServer;

/**
 * Created by Алина on 12.09.2016.
 */
import java.io.*;
import javax.swing.*;
public interface Service extends Serializable
{
    public JPanel getGuiPanel();
}
