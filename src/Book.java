/**
 * A book that can be added to (written) and read.
 * @author Mr. Turner
 * @version 1.0.0
 */
public class Book {

    private String title;
    private String author;
    private String publisher;
    private String content;
    /**
     * The number of pages in the book.
     */
    private int pageCount;
    private int isbn;
    /**
     * The page number for the page currently open to or being read.
     * Page 0 is the cover.
     */
    private int currentPage = 0;

    /**
     * Creates a new book that hasn't been written or published yet.
     * @param title the full title
     * @param author the author(s)
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        publisher = "";
        content = "";
        pageCount = 0;
        isbn = 0;
    }

    /**
     * Creates a published book.
     * @param title the full title
     * @param author the author(s)
     * @param publisher the publisher
     * @param content the text
     * @param pageCount the length
     * @param isbn the isbn
     */
    public Book(String title, String author, String publisher, String content, int pageCount, int isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.content = content;
        this.pageCount = pageCount;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Add new pages to an existing book.
     * @param contents the text being added
     * @param newPages the number of pages the new text spans
     */
    public void addPages(String contents, int newPages){
        this.content += contents;
        this.pageCount += newPages;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Advances the current page by one.
     */
    public void read(){
        currentPage++;
    }

    /**
     * Advances the current page a given amount.
     * @param pages the number of pages read
     */
    public void read(int pages){
        currentPage += pages;
    }

    /**
     * Returns the string representation of the book.
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", content='" + content + '\'' +
                ", pageCount=" + pageCount +
                ", isbn=" + isbn +
                ", currentPage=" + currentPage +
                '}';
    }
}