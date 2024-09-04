public class Books {

   private String title;
   private String author;
   private int id;
   private boolean isBorrowed = false;
   private static int lastId = 0;

   public Books(String title, String author) {
    this.title = title;
    this.author = author;
    this.id = ++lastId;
    this.isBorrowed = false;
    
   }

   public String getTitle(){
         return title;
   }
   public String getAuthor(){
         return author;
   }
   public int getId(){
         return id;
   }

    public boolean getIsBorrowed(){
            return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }

}