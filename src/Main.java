import SingleResponsibilityPrinciple.Library;
import SingleResponsibilityPrinciple.ManageBooks;
import SingleResponsibilityPrinciple.OfferBook;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        Library book1=new Library("Wisdom of the unseen",12932,"Muhammad Ejaz Ahmad","a2.3", date);
        ManageBooks manageBooks = new ManageBooks();
        OfferBook offerbooks= new OfferBook();

        manageBooks.addBook(book1);
        manageBooks.deleteBook(book1);

        offerbooks.issueBook(book1);
        offerbooks.returnBook();

    }
}