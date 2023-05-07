import java.util.List;

import book.BookInfo;
import book.IBook;
import book.Typography;
import library.BookSearchResult;
import library.ILibrary;
import library.Library;
import library.SearchFilter;

class Main {
    public static void main(String[] args) {
        ILibrary library = Library.getInstance();
        Typography typography = Typography.getInstance();

        // Produce 2 libri fisici
        typography.setProduceDigitalBooks(false);
        BookInfo twentyInfor = new BookInfo("20000 leghe sotto i mari", "Jules Verne", "Fantascienza", 1870);
        IBook twentyBook = typography.printBook(twentyInfor, "In fondo al mar, in fondo al mar...");
        BookInfo odysseyInfo = new BookInfo("Iliade", "Omero", "Epica", -800);
        IBook odysseyBook = typography.printBook(odysseyInfo, "Cantami o Diva del pelide Achille l'ira funesta che...");

        // Produce 1 libro digitale
        typography.setProduceDigitalBooks(true);
        BookInfo divineComedyInfo = new BookInfo("Divina Commedia", "Dante Alighieri", "Epica", 1300);
        IBook divineComedyBook = typography.printBook(divineComedyInfo, "Nel mezzo del cammin di nostra vita...");

        library.addBook(twentyBook);
        library.addBook(odysseyBook);
        library.addBook(divineComedyBook);

        List<BookSearchResult> searchResult = library.searchBook("Epica", SearchFilter.GENRE);
        for (BookSearchResult result : searchResult) {
            System.out.println(result.bookInfo());
        }

        IBook book = library.getBook(searchResult.get(0).bookPosition());
        System.out.println(book.getBookInfo());
        System.out.println(book.read());
        book.useBookToKillMosquito();

        library.removeBook(book);

        searchResult = library.searchBook("Epica", SearchFilter.GENRE);
        for (BookSearchResult result : searchResult) {
            System.out.println(result.bookInfo());
        }

        book = library.getBook(searchResult.get(0).bookPosition());
        System.out.println(book.getBookInfo());
        System.out.println(book.read());

        book.useBookToKillMosquito();

        IBook cloneBook = book.clone();
        System.out.println(cloneBook.getBookInfo());
        System.out.println("original: " + book + "clone: " + cloneBook);

    }
}