package library;

import java.util.List;

import book.IBook;

public class Library implements ILibrary {
    private static Library instance;
    private IBookRegistry bookRegistry;
    private IEbookServer ebookServer;
    private IBookRack[] racks;

    public static Library getInstance() {
        throw new UnsupportedOperationException("Unimplemented method 'getInstance'");
    }

    @Override
    public BookPosition addBook(IBook book) throws IllegalStateException {
        throw new UnsupportedOperationException("Unimplemented method 'addBook'");
    }

    @Override
    public void removeBook(IBook book) {
        throw new UnsupportedOperationException("Unimplemented method 'removeBook'");
    }

    @Override
    public List<BookSearchResult> searchBook(String search, SearchFilter filter) {
        throw new UnsupportedOperationException("Unimplemented method 'searchBook'");
    }

    @Override
    public IBook getBook(BookPosition bookPosition) {
        throw new UnsupportedOperationException("Unimplemented method 'getBook'");
    }

    @Override
    public int getNumberOfRacks() {
        throw new UnsupportedOperationException("Unimplemented method 'getNumberOfRacks'");
    }
}
