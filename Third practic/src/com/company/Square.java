package com.company;

public class Square extends Rectangle {
    public Square()
    {
        this.width = 7;
        this.length = 7;
        this.color = "Green";
        this.filled = true;
    }
    public Square(double side)
    {
        this.width = side;
        this.length = side;
        this.color = "Green";
        this.filled = true;
    }
    public Square(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double GetSide()
    {
        return width;
    }
    public void SetSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    public void SetWidth(double side)
    {
        this.width = side;
        this.length = side;
    }

    public void SetLength(double side)
    {
        this.width = side;
        this.length = side;
    }

    @Override

    public String toString(){
        return "This is Square with side = " + width + ". It's " + color + " and filled " + filled;
    }
}
