package OvningarLecture3Classes;

public class Book {
    public String title;
    public String author;
    public int year;

    
        public Book() {
            title = "La carte et le territoire";
            author = "Michel Houellbec";
            year = 2011;
        }
        public void printDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Year:  " + year);
        }
        public static void main(String[] args) {
            
            Book book1 = new Book();

            book1.printDetails();
        
        
    }
}


