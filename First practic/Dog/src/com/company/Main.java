package com.company;


class Dog {
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Dog(String name)
    {
        this.name = name;
        age = 0;

    }
    public Dog()
    {
        name = "No Name";
        age = 0;
    }
    public void SetAge(int age)
    {
        this.age = age;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public String GetName(String name)
    {
        return name;
    }

    public int GetAge()
    {
        return age;
    }

    public String toString()
    {
        return "Name: " + this.name + "; Age: " + this.age;
    }

}


public class Main
{

    public static void main(String[] args)
    {
        Dog obj1 = new Dog("Mike", 2);
        Dog obj2 = new Dog("Helen", 7);
        Dog obj3 = new Dog();
        obj3.SetAge(4);
        obj3.SetName("Alice");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
