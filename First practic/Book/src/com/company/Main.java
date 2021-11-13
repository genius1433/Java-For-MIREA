package com.company;

class Book {
    private String name;
    private int pages;

    public Book(String name, int pages)
    {
        this.name = name;
        this.pages = pages;
    }

    public Book(String name)
    {
        this.name = name;
        this.pages = -1;
    }

    public Book(int pages) {
        this.name = "No Info";
        this.pages = pages;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public void SetPages(int pages)
    {
        this.pages = pages;
    }

    public String GetName() {
        return this.name;
    }

    public int GetPages()
    {
        return this.pages;
    }

    public String toString()
    {
        return "Name: " + this.name + "; Pages: " + this.pages;
    }
}


public class Main {

    public static void main(String[] args)
    {

        Book obj1 = new Book("Never", 2000);
        Book obj2 = new Book("Ever");
        Book obj3 = new Book(10);
        obj2.SetPages(20);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
