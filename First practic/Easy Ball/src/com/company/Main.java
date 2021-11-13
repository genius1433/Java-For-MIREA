package com.company;


class Ball
{
    private String color;
    private int size;

    public Ball(String color, int size)
    {
        this.color = color;
        this.size = size;
    }

    public Ball(String color)
    {
        this.color = color;
        this.size = -1;
    }

    public Ball(int size)
    {
        this.color = "No Info";
        this.size = size;
    }

    public void SetColor(String color)
    {
        this.color = color;
    }

    public void SetSize(int size)
    {
        this.size = size;
    }

    public String GetColor()
    {
        return color;
    }

    public int GetSize()
    {
        return size;
    }

    public String toString()
    {
        return "Color: " + this.color + "; Size: " + this.size;
    }
}

public class Main
{

    public static void main(String[] args)
    {
        Ball obj1 = new Ball("Green", 20);
        Ball obj2 = new Ball("Red");
        Ball obj3 = new Ball(10);
        obj1.SetSize(15);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
