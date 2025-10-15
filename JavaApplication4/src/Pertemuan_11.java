
import java.util.LinkedList;

public class Pertemuan_11 {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.addFirst("Z");
        list.add(3, "F");
        
        
        System.out.println(list);
    }
}
