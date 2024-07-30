public class Main {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        DocumentFactory imageFactory = new ImageDocumentFactory();

        Document wordDoc = wordFactory.createDocument();
        Document pdfDoc = pdfFactory.createDocument();
        Document excelDoc = excelFactory.createDocument();
        Document imageDoc = imageFactory.createDocument();

        wordDoc.open();
        wordDoc.close();

        pdfDoc.open();
        pdfDoc.close();

        excelDoc.open();
        excelDoc.close();

        imageDoc.open();
        imageDoc.close();
    }
}
