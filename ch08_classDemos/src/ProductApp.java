
public class ProductApp {

	public static void main(String[] args) {
		Product p1 = new Product("java", "murach's java", 57.50);
		
		System.out.println(p1);
		
		Book b = new Book("java", "murach's java", 57.50, "Joel Murach");
		System.out.println("Book b = "+b);
		
		Software s = new Software("netbeans", "NetBeans", 0.0, "8.2");
		System.out.println("Software s = "+s);
		
		// demonstrate polymorphism
		Product p;
		
		p = b;
		
		System.out.println("Product toString: "+p.toString());
		System.out.println("Author: "+b.getAuthor());
		//since toString is available in both that works, Product has no getAuthor
	//	System.out.println("Author: "+p.getAuthor());

	}

}
