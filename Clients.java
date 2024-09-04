import java.util.*;

public class Clients {
    
    private String name;
    ArrayList<Books> Borrowedbooks = new ArrayList<>();
    public Clients(String name){
        this.name = name;
    }

    public void borrowBook(String  title, Library library){
        Books book = library.books.get(title);
        
            if(book!= null && !book.getIsBorrowed()){
                Borrowedbooks.add(book);
                book.setIsBorrowed(true);
                System.out.println("Book borrowed successfully");
                return ;
            }else{
                System.out.println("Book is not available");
                return;
            }
    }

    public void returnBook(String title , Library library){
        Books book = library.books.get(title);
        if(book!= null && book.getIsBorrowed()){
            book.setIsBorrowed(false);
            Borrowedbooks.remove(book);
            System.out.println("Book returned successfully");
            return;
        }else{
            System.out.println("Book is not borrowed");
            return;
        }
    }
    
}

