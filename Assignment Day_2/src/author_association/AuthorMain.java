package author_association;

public class AuthorMain {

	public static void main(String[] args) {
		
		Author author1=new Author("John","John@gmail.com",'M');

		Book book=new Book("Java", author1, 45, 15);
		System.out.println("Author Details :");
		book.displayAuthorDetails();
	}

}
