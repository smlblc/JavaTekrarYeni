package gun45.tasks.task2;

public enum FileFormat {
    XLSX("xlsx"), DOCX("docx"), PPTX("pptx");

    private String format;
    FileFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
