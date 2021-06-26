// Creating a Search interface
import java.rmi.*;
import java.util.ArrayList;
public interface Search extends Remote
{
    // Declaring the method prototype
    public String sendMessage(Message message) throws RemoteException;
    public ArrayList<Message> receiveMessage(String division) throws RemoteException; 
}
