public class Book {
    private String tittle;
    private String author;
    private String ISBN;
   

    public Book(String tittle, String author, String ISBN){
        this.tittle = tittle;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTittle(){
        return tittle;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }
}
