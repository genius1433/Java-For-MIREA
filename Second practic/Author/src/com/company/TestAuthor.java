package com.company;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author obj1 = new Author("Yaroslav Marinov", "Mail@somewhere.com", 'm');
        obj1.SetEmail("Genius@somewhere.com");
        System.out.println(obj1.toString());
    }
}
