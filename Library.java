import java.util.*;

public class Library {

    public HashMap<String,Books> books;

   public Library(){
        books = new HashMap<>();
   }
   public void addBook(Books book){
        books.put(book.getTitle(),book);
   }
}
