public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pages;

    public PdfDocument(String fileName, String author, int pages) {
        this.fileName = fileName;
        this.author = author;
        this.pages = pages;
    }

    // Implemented Methods
    @Override
    public Document clone() {
        return new PdfDocument(fileName, author, pages);
    } 

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pages + " pages)");
    }

    @Override
    public String getType() {
        return "PDF";
    }

    // Print Details
    public void printDetails() {
        System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pages);
    }

    // Getters and Setters
    public String getFileName() {
        return fileName;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}