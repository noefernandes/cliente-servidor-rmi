//program for client application
import java.rmi.*;
import java.util.Scanner;

public class ClientRequest
{
    public static void main(String args[])
    {   
        while(true){
            Scanner ler = new Scanner(System.in);

            Message message = new Message();
            System.out.println("Insira a reclamação:");
            message.type = ler.nextLine();
            System.out.println("Insira a prioridade:");
            message.priority = ler.nextLine();
            System.out.println("Insira a unidade responsável:");
            message.division = ler.nextLine();

            String answer;
            try
            {
                // lookup method to find reference of remote object
                Search access =
                    (Search)Naming.lookup("rmi://localhost:1900"+
                                          "/geeksforgeeks");
                answer = access.sendMessage(message);
                System.out.println("\n" + answer + "\n");
            }
            catch(Exception ae)
            {
                System.out.println(ae);
            }
        }
    }
}
