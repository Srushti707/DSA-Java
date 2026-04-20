package DSA.Hash_Table;
import java.util.*;

public class IteneraryFromTickets {
    public static void main(String[] args) {
        
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start= findStart(tickets);
        String next=tickets.get(start);
         while(next!=null)
         {
            System.out.print("->"+next);
            next=tickets.get(next);
         }
        
    }
    static String findStart(HashMap<String,String> tickets)
    {
        for(String key: tickets.keySet())
        {
            if(!tickets.containsValue(key)) 
                {
                    System.out.print(key);
                    return key;
                }
        }
        return null;
    }

}
