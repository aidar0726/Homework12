public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Author author = new Author("Lev", "Tolstoy");
        Book book = new Book(author, "War and Peace", 1956);

        author.getAuthorName();
        author.getAuthorSurname();

        book.getBookName();
        book.getPublishingYear();
        book.setPublishingYear(1960);

        System.out.println(book.getPublishingYear());
    }
}