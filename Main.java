import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args){
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("John Smith");

        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("Java Programming");


        // authrs -> books
        author1.addBook(book1);
        author2.addBook(book1);
        author2.addBook(book2);

        // Books -> authors
        book1.addAuthor(author1);
        book1.addAuthor(author2);
        book2.addAuthor(author2);


        System.out.println(author1.getName());
        System.out.println(author2.getName());
        System.out.println();


        // print Authors -> books
        System.out.println("Books by: " + author1.getName() + ":");

        for(Book book : author1.getBook()){
            System.out.println(book.getTitle());

        }


        // print book -> authors
        System.out.println("\nAuthor of: " + book1.getTitle());

        for(Author author : book1.getAuthor()){
            System.out.println(author.getName());
        }




    }
}

class Author{

    private String name;
    private List<Book> books;

    public Author(String name){
        this.name = name;
        this.books = new ArrayList<>();      

    }

    public void addBook(Book book){
        books.add(book);
    }

    public String getName(){
        return name;
    }

    public List<Book> getBook(){
        return books;
    }
}


class Book{
    private String title;
    private List<Author> authors;

    public Book(String title){
        this.title = title;
        this.authors = new ArrayList<>();
        
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public String getTitle(){
        return title;
    }

    public List<Author> getAuthor(){
        return authors;
    }
}