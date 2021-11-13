package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle()
    {
        this.width = 7;
        this.length = 10;
        this.color = "Green";
        this.filled = true;
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
        this.color = "Green";
        this.filled = true;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double GetWidth()
    {
        return width;
    }
    public void SetWidth(double width)
    {
        this.width = width;
    }
    public double GetLength()
    {
        return length;
    }
    public void SetLength(double length)
    {
        this.length = length;
    }

    @Override

    public double GetArea()
    {
        return width * length;
    }

    @Override

    public double GetPerimeter()
    {
        return (width + length) * 2;
    }

    @Override

    public String toString()
    {
        return "Rectangle with sides = " + width + " and " + length + ". It's " + color + " and filled " + filled;
    }
}
