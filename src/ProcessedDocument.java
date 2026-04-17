public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println();

        PdfDocument pdf = (PdfDocument) registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        pdf.open();
        pdf.printDetails();

        System.out.println();

        TextDocument text = (TextDocument) registry.createText("meeting_notes.txt", "UTF-8", 250);
        text.open();
        text.printDetails();

        System.out.println();

        SpreadsheetDocument spreadsheet = (SpreadsheetDocument) registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        spreadsheet.open();
        spreadsheet.printDetails();

        System.out.println();

        PdfDocument summaryPdf = (PdfDocument) registry.createPdf("summary_report.pdf", "Acme Corp", 30);
        summaryPdf.open();
    }
}