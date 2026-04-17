package DSA.Hash_Table;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        
        set.add(20);
        set.add(22);
        set.add(22);
        set.add(30);
        set.add(33);
        System.out.println(set);
        set.remove(33);
        System.out.println(set.contains(33));
        System.out.println(set.size());

        //Iterate
        Iterator it= set.iterator();
        


    }
}
