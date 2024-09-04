public class Main {

    public static void main(String[] args) {
        Clients client1 = new Clients("John");
        Library library = new Library();
        library.addBook(new Books("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Books("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Books("1984", "George Orwell"));
        library.addBook(new Books("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));
        client1.borrowBook("The Great Gatsby", library);
        client1.returnBook("The Great Gatsby", library);

    }
}