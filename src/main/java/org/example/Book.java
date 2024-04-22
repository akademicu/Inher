package org.example;

import java.util.Random;

public class Book {
    private String title;
    private String author;
    private int nrOfPages;
    private int curentPage;
    private Random rn;
    private boolean isRented;









    public Book(String title, String author, int nrOfPages) {
        this.title = title;
        this.author = author;
        this.nrOfPages = nrOfPages;
        this.curentPage = 1;
        rn = new Random();
        this.isRented =false;
    }


    public boolean getIsRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public void setRandomCurPage(){
        this.curentPage = rn.nextInt(this.nrOfPages)+1;
    }

    public void pageUp(int nrOp){
        if(this.curentPage<nrOfPages){
            this.curentPage++;
        }else {
            System.out.println("End of the book!");
        }
    }
    public void pageDown(){
        if (this.curentPage<1){
            this.curentPage--;
        }else {
            System.out.println("You are at the star of the boo already.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    public int getCurentPage() {

        return curentPage;
    }

    public void setCurentPage(int curentPage) {
        this.curentPage = curentPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", curentPage=" + curentPage +
                '}';
    }


    public void printTheCurPageAndTitle(){
        System.out.println("Book title: "+this.title);
        System.out.println("I am ta page: "+ this.curentPage);
    }
}
