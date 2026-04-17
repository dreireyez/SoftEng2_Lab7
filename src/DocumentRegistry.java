public class DocumentRegistry {
    private final PdfDocument pdfFile;
    private final TextDocument textFile;
    private final SpreadsheetDocument spreadsheetFile;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfFile = new PdfDocument("","",0);

        System.out.println("Creating a Text Document prototype.");
        textFile = new TextDocument("","",0);
        
        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetFile = new SpreadsheetDocument("",0,0);
    }

    public Document createPdf(String fileName, String author, int pages) {
        PdfDocument clone = (PdfDocument) pdfFile.clone();
        clone.setFileName(fileName);
        clone.setAuthor(author);
        clone.setPages(pages);
        return clone;
    }

    public Document createText(String filePath, String encoding, int wordCount) {
        TextDocument clone = (TextDocument) textFile.clone();
        clone.setFilePath(filePath);
        clone.setEncoding(encoding);
        clone.setWordCount(wordCount);
        return clone;
    }

    public Document createSpreadsheet(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument clone = (SpreadsheetDocument) spreadsheetFile.clone();
        clone.setSpreadsheetName(spreadsheetName);
        clone.setRowCount(rowCount);
        clone.setColumnCount(columnCount);
        return clone;
    }

}