package CollectionFrameWork;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(101);
		al.add(10);
		al.add("RUTUJA");
		al.add("Sahare");
		al.add("RUTUJA");
		al.add("Sahare");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.contains(10));
		System.out.println(al.size());
		System.out.println(al.remove("Sahare"));
		System.out.println(al);
		System.out.println(al.hashCode());
		System.out.println(al);
		
		ArrayList<String> al2 = new ArrayList<>();

        al2.add("RUTUJA");
        al2.add("Sahare");
        al2.add("Amit");

        System.out.println(al2);

        Collections.sort(al2);

        System.out.println("Sorted: " + al2);
        al2.clear();
        System.out.println("Cleared: " + al2);
//		List l = new ArrayList();
//		List l2 = new LinkedList();

	}

}
