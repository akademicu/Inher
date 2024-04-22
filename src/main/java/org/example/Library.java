package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Ebook> ebooks;
    private ArrayList<GraphicNovel> graphicNovels;
    private ArrayList<SheetMusic> sheetMusic;

    /**
     *
     * @param books
     * @param ebooks
     * @param graphicNovels
     * @param sheetMusics
     */
    /**
     *
     */

    public Library() {
        this.books = new ArrayList<Book>();
        this.ebooks = new ArrayList<Ebook>();
        this.graphicNovels = new ArrayList<GraphicNovel>();
        this.sheetMusic = new ArrayList<SheetMusic>();

    }
    public void addBook(String titel, String author, int pageNr){
        books.add(new Book(titel,author,pageNr));
    }

    public void addEbook(String titel, String author, int pageNr, String fileType){
        ebooks.add(new Ebook(titel,author,pageNr,fileType));
    }
    public void addGraphicNovel(String titel, String author, int pageNr, String ilustrator){
        graphicNovels.add(new GraphicNovel(titel,author,pageNr,ilustrator));
    }
    public void addSheetMusic(String titel, String author, int pageNr, String composer){
        sheetMusic.add(new SheetMusic(titel,author,pageNr,composer));
    }

    public void rentBook(Book book){
        book.setRented(true);
    }


    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Ebook> getEbooks() {
        return ebooks;
    }

    public ArrayList<GraphicNovel> getGraphicNovels() {
        return graphicNovels;
    }

    public ArrayList<SheetMusic> getSheetMusics() {
        return sheetMusic;
    }

    public void bookToEbook(Object object){
        if(object instanceof Book){
            // A new ebook object requires these for initialization: (title, author, numberOfPages, fileTYpe)
            ebooks.add(new Ebook(((Book) object).getTitle(),((Book) object).getAuthor(),((Book) object).getNrOfPages(),"PDF"));
        } else {
            System.out.println("Please enter a valid book.");
        }
    }

    public void addBook(Book book) {
    }

    public void printEBook(){
        for (Ebook ebook : ebooks) {
            System.out.println(ebook.getTitle());
            System.out.println(ebook.getAuthor());
            System.out.println(ebook.getNrOfPages());
            System.out.println(ebook.getFileType());

        }
    }
}
