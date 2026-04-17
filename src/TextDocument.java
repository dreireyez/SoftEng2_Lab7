public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    // Implemented Methods
    @Override
    public Document clone() {
        return new TextDocument(filePath, encoding, wordCount);
    } 

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() {
        return "Text";
    }

    // Print Details
    public void printDetails() {
        System.out.println("Type: " + getType() + ", Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount);
    }

    // Getters and Setters
    public String getFilePath() {
        return filePath;
    }

    public String getEncoding() {
        return encoding;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
}