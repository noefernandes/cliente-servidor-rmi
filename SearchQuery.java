// Java program to implement the Search interface
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
public class SearchQuery extends UnicastRemoteObject
                         implements Search
{
    //Message current = null;
    public ArrayList<Message> messages;

    // Default constructor to throw RemoteException
    // from its parent constructor
    SearchQuery() throws RemoteException
    {
        super();
        messages = new ArrayList<>();
    }
  
    // Implementation of the query interface
    public String sendMessage(Message message) throws RemoteException
    {
        String result;
        if (message != null && !message.equals("")){
            messages.add(message);
            result = "Ok. Reclamação recebida!";
        }else{
            result = "Reclamação não recebida. Tente novamente.";
        }
        
        return result;
    }

    public ArrayList<Message> receiveMessage(String division) throws RemoteException
    {   
        ArrayList<Message> group = new ArrayList<>();

        if(messages.size() > 0){
            for(int i = 0; i < messages.size(); i++){
                Message current = messages.get(i);
                if(current.getDivision().equals(division)){
                   group.add(current);
                   messages.remove(i); 
                }
            }
        }

        return group;
    }
}
