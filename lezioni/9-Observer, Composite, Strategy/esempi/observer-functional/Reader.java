import java.util.List;

public class Reader implements Observer {
    List<String> bookWishlist;

    @Override
    public void update(Object state) {
        if (state instanceof List<Book> books) {
            for (Book book : books) {
                if (wishlist.contains(book))
                    book.buy();
            }
        }
    }

    @Override
    public void update(Subject subject, Object state) {
        if (state instanceof List<Book> books) {
            for (Book book : books) {
                if (wishlist.contains(book))
                    book.buy();
            }
        }
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof BookStore booksStore) {
            List<Book> books = booksStore.getBooks();
            for (Book book : books) {
                if (wishlist.contains(book))
                    book.buy();
            }
        }
    }

    @Override
    public void update() {
        List<Book> books = this.bookStore.getBooks();
        for (Book book : books) {
            if (wishlist.contains(book))
                book.buy();
        }
    }
}
