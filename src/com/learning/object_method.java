package com.learning;

class Mycar{
    String make;
    String model;
    int year;

}
public class object_method
{
    public static void main(String[] args)
    {
        // created an object
        Mycar car = new Mycar();
        // created object attributes
        car.make = "Tesla";
        car.model = "Tesla model y";
        car.year = 2020;

        // printed the object attribeut
        System.out.println("i drive a "+ car.make);
        System.out.println("the new one "+ car.model);
        System.out.println("this " + car.model+" was made in "+ car.year);

        // updated object attributs
        car.make = "honda";
        car.model = "Honda civic";
        car.year = 2015;

        // printed out to see if updated
        System.out.println("i drive a "+ car.make);
        System.out.println("the new one "+ car.model);
        System.out.println("this " + car.model+" was made in "+ car.year);
    }
}
