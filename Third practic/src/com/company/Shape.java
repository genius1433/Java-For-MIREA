package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape()
    {
        this.color = "Green";
        this.filled = true;
    }
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public String GetColor()
    {
        return color;
    }
    public void SetColor(String color)
    {
        this.color = color;
    }
    public boolean IsFilled()
    {
        return filled;
    }
    public void SetFilled(boolean filled)
    {
        this.filled = filled;
    }
    public abstract double GetArea();
    public abstract double GetPerimeter();
    public abstract String toString();
}
