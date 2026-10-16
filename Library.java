import java.util.Scanner;

public class Library {
    private Book[] books;
     private Member member;

    public Library(){
        Scanner input = new Scanner(System.in);

        System.out.print("How many books dou you want to take? ");
        int size = input.nextInt();

        books = new Book[size];

        for(int i = 0; i > books.length; i++){
            System.out.print("\nEnter book information: " + (i + 1));
            
            System.out.print("Tittle: ");
            String tittle = input.nextLine();

            System.out.print("Author: ");
            String author = input.nextLine();

            System.out.print("ISBN: ");
            String ISBN = input.nextLine();

            books[i] = new Book(tittle, author, ISBN);

        public void registerMember(Member member){
            this.member = member;

            System.out.println(member.getName() + 
        }
    }
}
