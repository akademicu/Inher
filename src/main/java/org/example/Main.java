package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*PrintMessage pm = new PrintMessage("Hi met");
        System.out.println(pm.getMesss());

        Book book = new Book("Title1", "Author1", 2);

        book.setRandomCurPage();

        book.printTheCurPageAndTitle();*/

        //ArrayList<Book> books0=new ArrayList<>();
        Library library = new Library();
        String title = "title", author = "author";
        int nrOfP = 5;
        for (int i=0;i<10;i++){
            library.addBook(title+i,author+i,nrOfP+i);
        }

        System.out.println(library.getBooks());
        library.bookToEbook(new GraphicNovel("Ion in Java", "Ion", 30, "Israel"));
        library.printEBook();

        EbookClass eBook = new EbookClass(library);






    }
}