package com.company;

public class Ball
{
    private double x = 0.0;
    private double y = 0.0;
    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Ball()
    {
        this.x = 0.0;
        this.y = 0.0;
    }
    public double GetX()
    {
        return x;
    }
    public double GetY()
    {
        return y;
    }
    public void SetX(double x)
    {
        this.x = x;
    }
    public void SetY(double y)
    {
        this.y = y;
    }
    public void SetXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void Move( double xDisp, double yDisp)
    {
        x += xDisp;
        y += yDisp;
    }

    public String toString()
    {
        return "Ball position:" + this.x + "; " + this.y;
    }
}
