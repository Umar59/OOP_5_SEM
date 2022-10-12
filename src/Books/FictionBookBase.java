package Books;

import Bootstrap.IObject;
import Books.Interfaces.IBook;

public abstract class FictionBookBase implements IObject, IBook
{
    protected String Genre;
    
    protected FictionBookBase(){}
    protected FictionBookBase(String genre) {
        this.Genre = genre;
    }
}
