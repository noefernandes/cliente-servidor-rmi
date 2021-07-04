// Java program to implement the Search interface
import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.HashMap;
public class SearchQuery extends UnicastRemoteObject
                         implements Search
{
    public ArrayList<Message> messages;
    public HashMap<String, String> map;

    // Default constructor to throw RemoteException
    // from its parent constructor
    SearchQuery() throws RemoteException
    {
        super();
        messages = new ArrayList<>();
        map = new HashMap<>();
        map.put("assassinato", "URGENTE");
        map.put("roubo", "ALTA");
        map.put("incendio", "URGENTE");
        map.put("resgatar animal", "MEDIA");
    }
  
    // Implementation of the query interface
    public String sendMessage(Message message) throws RemoteException
    {
        String result;
        if (message.getType() != null && !message.getType().equals("") && map.containsKey(message.getType())){
            message.priority = map.get(message.getType()); 
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
