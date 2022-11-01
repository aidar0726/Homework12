public class Book {
    private Author authorName;/* на authorName нельзя ведь создать геттер в в классе Book ? только в классе Author ?*/

    private String bookName;
    private int publishingYear;

    public Book(Author authorName, String bookName, int publishingYear) {
        this.authorName = authorName; /*не совсем понял эту записть получается в свойстве authorName класса Book будет обект Author ? */
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }


    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }
}
