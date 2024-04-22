package org.example;

public class GraphicNovel extends Book {

    private String illustrator;
    public GraphicNovel(String title, String author, int nrOfPages, String illustrator) {
        super(title, author, nrOfPages);
        this.illustrator = illustrator;
    }
}
