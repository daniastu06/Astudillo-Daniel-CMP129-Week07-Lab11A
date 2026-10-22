import java.util.Scanner;

public class Library {
    private Book[] books;
    private Member member;

    public Library() {
        Scanner input = new Scanner(System.in);

        System.out.print("How many books do you want to take? ");
        int size = input.nextInt();
        input.nextLine(); // Clear the newline

        books = new Book[size];

        for (int i = 0; i < books.length; i++) {
            System.out.println("\nEnter book information: " + (i + 1));

            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Author: ");
            String author = input.nextLine();

            System.out.print("ISBN: ");
            String ISBN = input.nextLine();

            books[i] = new Book(title, author, ISBN);
        }
    }

    public void registerMember(Member member) {
        this.member = member;

        System.out.println(member.getName() + " registered successfully.");
    }

    public void displayBooks() {
        System.out.println("\n--- Library Books ---");

        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook " + (i + 1));

            System.out.println("Title: " + books[i].getTittle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("ISBN: " + books[i].getISBN());
        }
    }

    public Book getBook(int index){
        return books[index];
    }
}