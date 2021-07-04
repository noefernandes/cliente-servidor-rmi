//program for client application
import java.util.ArrayList;
import java.rmi.*;
public class FireDepartment
{
    public static void main(String args[])
    {
        while(true){
            ArrayList<Message> response;
            String division = "bombeiros";

            try
            {
                // lookup method to find reference of remote object
                Search access =
                    (Search)Naming.lookup("rmi://localhost:1900"+
                                          "/geeksforgeeks");
                response = access.receiveMessage(division);
                
                if(response.size() > 0){
                    for(Message message: response){
                        System.out.println(message.type);
                        System.out.println(message.priority);
                        System.out.println(message.division);
                    }
                }
            }
            catch(Exception ae)
            {
                System.out.println(ae);
            }
        }
    }
}
