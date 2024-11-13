 class book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    static {
         totalBooks = 0;
    }
     {
         totalBooks++;
     }
    book (String title , String author , String isbn) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }
    book(String isbn){
        this("unknown","unknown","isbn");

    }
    static int getTotalBooks() {
        return totalBooks;
    }
    void borrowBook(){
        if (isBorrowed){
            System.out.println("book is Already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("enjoy the book");
        }
    }
    void returnBook(){
        if (isBorrowed){
            this.isBorrowed=false;
            System.out.println("hope you enjoyed");
        }else {
            System.out.println("this is already in library");
        }
    }

     public static void main(String[] args) {
         book theblack = new book("title","author","1");
         book theblack2 = new book("2");
         System.out.println(book.getTotalBooks());
         theblack.borrowBook();
         theblack.returnBook();

     }
}
