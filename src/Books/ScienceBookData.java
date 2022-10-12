package Books;

import Books.Interfaces.IBook;
import Bootstrap.IObject;

import java.util.Objects;

public class ScienceBookData implements IObject, IBook
{
    private enum ScienceTheme {
        RocketScience, NuclearScience, MedicalScience, BiologyScience, EcologyScience, Other,
    }
    
    private ScienceTheme theme;
    private BookComplexity complexity;
    
    private final int pagesCount;
    private final String authorName;
    private final String bookName;
    private final String publishHouseName;

    //region CONSTRUCTORS

    public ScienceBookData() 
    {
        pagesCount = 0;
        authorName = "";
        publishHouseName = "";
        bookName = "bookName";
        theme = ScienceTheme.Other;
        complexity = BookComplexity.Medium;
    }

    public ScienceBookData(ScienceTheme theme, BookComplexity complexity, int pagesCount,
                           String authorName, String publishHouseName, String bookName) 
    {
        this.theme = theme;
        this.bookName = bookName;
        this.complexity = complexity;
        this.pagesCount = pagesCount;
        this.authorName = authorName;
        this.publishHouseName = publishHouseName;
    }

    public ScienceBookData(int pagesCount, String authorName,
                           String publishHouseName, String bookName) 
    {
        this.theme = ScienceTheme.Other;
        this.complexity = BookComplexity.Medium;
        this.bookName = bookName;
        this.pagesCount = pagesCount;
        this.authorName = authorName;
        this.publishHouseName = publishHouseName;
    }
    
    //endregion

    //region GETTERS SETTERS
    
    @Override
    public String getPublishHouseName() {
        return publishHouseName;
    }

    @Override
    public String getBookName() {
        return bookName;
    }

    @Override
    public String getAuthorName() {
        return authorName;
    }

    @Override
    public int getPagesCount() {
        return pagesCount;
    }
    
    public ScienceTheme getTheme() {
        return theme;
    }

    public BookComplexity getComplexity() {
        return complexity;
    }

    public void setTheme(ScienceTheme theme) {
        this.theme = theme;
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
        ScienceBookData that = (ScienceBookData) o;
        return pagesCount == that.pagesCount 
                && theme == that.theme
                && complexity == that.complexity 
                && Objects.equals(authorName, that.authorName) 
                && Objects.equals(bookName, that.bookName)
                && Objects.equals(publishHouseName, that.publishHouseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theme, complexity, pagesCount, authorName, bookName, publishHouseName);
    }
}
