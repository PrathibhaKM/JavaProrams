package programs;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
ArrayList<Object> list=new ArrayList<Object>();
list.add(10);
list.add("hi");
list.add('C');
list.add(98);
list.add(null);
System.out.println(list);
ArrayList<Integer> list1=new ArrayList<Integer>();
list1.add(20);
list1.add(30);
list1.add(11);
list1.add(40);
System.out.println(list1);
list.addAll(list1);
System.out.println(list);


	}

}
