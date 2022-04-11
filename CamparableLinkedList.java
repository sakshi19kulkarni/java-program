package arrayprog;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class Product implements Comparable<Product>{
	int id;
	String name;
	float price;
	String expDate;
	
	public Product(int id,String name,Float price,String expDate) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.expDate=expDate;
	}
	public int compareTo(Product o) {
		return this.id-o.id;
		
	}
	}


public class CamparableLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1,"Paper",50.0f,"07/02/2021");
		Product p2=new Product(2,"Notebook",60.0f,"08/02/2021");
		Product p3=new Product(3,"Pencil",70.0f,"09/02/2021");
		
		LinkedList<Product> ll= new LinkedList<Product>();
		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
		
		Collections.sort(ll);
		Iterator<Product>it= ll.iterator();
		while(it.hasNext()) {
			Product o=it.next();
			
			System.out.println(o.id+" "+o.name+" "+o.price+" "+o.expDate);
		}


	}

}
