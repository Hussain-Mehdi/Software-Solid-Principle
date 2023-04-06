import InterfaceSegrationPrinciple.DocumentPrint;
import OpenClosePrinciple.AreaCalculator;
import OpenClosePrinciple.Circle;
import OpenClosePrinciple.Rectangle;
import OpenClosePrinciple.Shape;
import SingleResponsibilityPrinciple.Library;
import SingleResponsibilityPrinciple.ManageBooks;
import SingleResponsibilityPrinciple.OfferBook;
import org.w3c.dom.css.Rect;

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


        System.out.println("------------------------------");

        Shape rectangle=new Rectangle(10,5);
        Shape circle = new Circle(2.5);

        AreaCalculator calculator = new AreaCalculator();

        double rectangleArea = calculator.calculatorArea(rectangle);
        double circleArea = calculator.calculatorArea(circle);

        System.out.println("Area of Rectangle: "+rectangleArea);
        System.out.println("Area of Circle: "+circleArea);

        System.out.println("----------------------------------------");
        DocumentPrint file = new DocumentPrint();
        file.printDocumentWithPrinter();
        file.FaxDocument();



    }
}