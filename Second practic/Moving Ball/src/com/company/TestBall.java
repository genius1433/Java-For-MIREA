package com.company;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball obj1 = new Ball(20, 20);
        System.out.println(obj1);
        obj1.Move(30, -15);
        System.out.println(obj1);
    }
}