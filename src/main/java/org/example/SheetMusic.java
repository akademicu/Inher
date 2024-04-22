package org.example;

public class SheetMusic extends Book {

    private  String composer;

    public SheetMusic(String title, String author, int nrOfPages, String composer) {
        super(title, author, nrOfPages);

        this.composer = composer;
    }
}
