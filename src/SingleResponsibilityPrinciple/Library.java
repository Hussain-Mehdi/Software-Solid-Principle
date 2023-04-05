package SingleResponsibilityPrinciple;

import java.time.LocalDate;

public class Library {

    public Library(String name, int id, String author, String version, LocalDate publishDate){
        this.bookName=name;
        this.bookID=id;
        this.bookAuthor=author;
        this.bookVersion=version;
        this.publishAt=publishDate;
    }
    private String bookName;
    private int bookID;
    private String bookAuthor;
    private String bookVersion;
    private LocalDate publishAt;


}
