import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductMain {

	public static void main(String[] args) {
		
		ArrayList<Product> productList=new ArrayList<>();
		
		productList.add(new Product(1001,"Novel","Books",200));
		productList.add(new Product(1002,"Comics","Books",100));
		productList.add(new Product(1003,"Story","Books",150));
		productList.add(new Product(1004,"bottles","Baby",250));
		productList.add(new Product(1005,"Novel","Toys",200));
		
		//Obtain a list of products belongs to category “Books” with price > 100
		List<Product> list=productList.stream().filter(s->s.getCategory().equalsIgnoreCase("books"))
												.filter(s->s.getPrice()>100).collect(Collectors.toList());
		
		// Obtain a list of order with products belong to category “Books”
		List<Product> list1=productList.stream().filter(s->s.getCategory().equalsIgnoreCase("books"))
				.collect(Collectors.toList());
		
		//limit
		productList.stream().limit(3).forEach(s->System.out.println(s.getProductId() +" "+s.getProductName()));
		
		//find min price
		Optional<Double> min=productList.stream().map(s->s.getPrice()).min((p1, p2) ->p1.compareTo(p2));
		System.out.println(min);
		
		//find sum of price
		Double sum=productList.stream().mapToDouble(s-> s.getPrice()).sum(); // maptoDouble converts streams into double
		System.out.println("Total Price: "+sum);
		
		//reverse sort
		productList.stream().sorted(Comparator.comparing(Product::getPrice).reversed())
							.forEach(s->System.out.println(s.getPrice()+","+s.getProductName()));
							
		for(Product p:list) {
			System.out.println("Product Name: "+p.getProductName()+", Product Category: "+p.getCategory()+", Product id: "+p.getProductId()+", product Price: "+p.getPrice());
		}
	}
}
