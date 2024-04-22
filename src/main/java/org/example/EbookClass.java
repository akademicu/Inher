package org.example;

import java.util.ArrayList;

public class EbookClass {

    // An existing library object = library


    private ArrayList<Ebook> ebooks;
    public EbookClass(){
        this.ebooks = new ArrayList<Ebook>();
    }

    public EbookClass convertLibrary(Library library){
        for (Book book : library.getBooks()) {
            bookToEbook(book);
        }
        for (Ebook ebook : library.getEbooks()) {
            bookToEbook(ebook);
        }
        for (Ebook ebook : library.getEbooks()) {
            bookToEbook(ebook);
        }
        for (Ebook ebook : library.getEbooks()) {
            bookToEbook(ebook);
        }

    }
    //Library library = new Library();


    public void bookToEbook(Object object){
        if (object instanceof Book){
            // A new ebook object requires these for initialization: (title, author, numberOfPages, fileTYpe)
            library.getEbooks().add(new Ebook(((Book) object).getTitle(),((Book) object).getAuthor(),((Book) object).getNrOfPages(),"PDF"));
        } else {
            System.out.println("Please enter a valid book.");
        }
    }
}
