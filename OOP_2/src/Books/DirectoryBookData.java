package Books;

import Books.Interfaces.IBook;
import Bootstrap.IObject;

import java.util.Objects;

public class DirectoryBookData implements IObject, IBook
{
    private BookComplexity complexity;

    private final int pagesCount;
    private final String authorName;
    private final String bookName;
    private final String publishHouseName;

    //region CONSTRUCTORS

    public DirectoryBookData(){

        this.complexity = BookComplexity.Medium;
        this.pagesCount = 0;
        this.bookName = "bookName";
        this.authorName = "authorName";
        this.publishHouseName = "publishHouseName";
    }

    public DirectoryBookData(int pagesCount, String bookName,
                             String authorName, String publishHouseName){

        this.complexity = BookComplexity.Medium;
        this.bookName = bookName;
        this.pagesCount = pagesCount;
        this.authorName = authorName;
        this.publishHouseName = publishHouseName;
    }
    
    public DirectoryBookData(BookComplexity complexity, int pagesCount, String bookName, 
                             String authorName, String publishHouseName){

        this.bookName = bookName;
        this.complexity = complexity;
        this.pagesCount = pagesCount;
        this.authorName = authorName;
        this.publishHouseName = publishHouseName;
    }

    //endregion

    //region GETTERS SETTERS

    @Override
    public String getBookName() {
        return bookName;
    }

    @Override
    public String getPublishHouseName() {
        return publishHouseName;
    }

    @Override
    public String getAuthorName() {
        return authorName;
    }

    @Override
    public int getPagesCount() {
        return pagesCount;
    }
    
    public BookComplexity getComplexity() {
        return complexity;
    }

    public void setComplexity(BookComplexity complexity) {
        this.complexity = complexity;
    }

    //endregion

    @Override
    public void print()
    {
        System.out.println(this);
    }

    @Override
    public String toString() {

        return "Book author:\t" +
                authorName +
                System.lineSeparator() +
                "Public House:\t" +
                publishHouseName +
                System.lineSeparator() +
                "Book name:\t" +
                bookName +
                System.lineSeparator() +
                "Pages count:\t" +
                pagesCount +
                System.lineSeparator() +
                "Book complexity:\t" +
                complexity +
                System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectoryBookData that = (DirectoryBookData) o;
        return pagesCount == that.pagesCount
                && complexity == that.complexity 
                && Objects.equals(authorName, that.authorName)
                && Objects.equals(bookName, that.bookName) 
                && Objects.equals(publishHouseName, that.publishHouseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complexity, pagesCount, authorName, bookName, publishHouseName);
    }
}
