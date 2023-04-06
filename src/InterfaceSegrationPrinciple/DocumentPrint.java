package InterfaceSegrationPrinciple;

public class DocumentPrint implements PrintDocument,FaxDocument{
    @Override
    public void printDocumentWithPrinter() {
        System.out.println("You are printing the document with printer");
    }

    @Override
    public void FaxDocument() {

            System.out.println("You are faxing the document");

    }
}
