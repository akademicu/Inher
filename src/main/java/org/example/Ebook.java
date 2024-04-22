package org.example;

public class Ebook extends Book {

    private String fileType;


    public Ebook(String title, String author, int nrOfPages, String fileType){
        super(title, author, nrOfPages);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
