public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        library.displayBooks();

        Member member = new Member("Daniel", "ccm0974542");

        library.registerMember(member);

        Book books = library.getBook(0);
    }
}
