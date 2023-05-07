package library;

import book.BookInfo;

public record BookSearchResult(BookInfo bookInfo, BookPosition bookPosition) {
    @Override
    public String toString() {
        return "BookSearchResult[ " + bookInfo.toString() + " " + bookPosition.toString() + " ]";
    }
}
