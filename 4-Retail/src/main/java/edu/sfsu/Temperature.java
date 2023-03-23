package edu.sfsu;

public class Temperature {
    private double fahrenheit;

    Temperature(double fahrenheit) {
       this.fahrenheit = fahrenheit;
    }
    public void setFahrenheit(double fahrenheit) {
       this.fahrenheit = fahrenheit;
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    public double getCelsius() {
       return (fahrenheit * 2);
    }
    public double getKelvin() {
        return (fahrenheit * 3);
    }
}

/*
* Write a temperature class that will hold a temperature in Fahrenheit, and provide methods to get
* the temperature in Fahrenheit, Celsius, and Kelvin. The class should have that following field:
*
* ftemp - A double that holds a Fahrenheit temperature.
*
* Celsius = (5/9) * (fahrenheit - 32)
* Kelvin = ((5/9) * (fahrenheit - 32)) + 273
* */