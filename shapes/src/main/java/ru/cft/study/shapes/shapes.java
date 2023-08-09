package ru.cft.study.shapes;

import java.text.DecimalFormat;
abstract class shapes {
    private String name;
    private double area;
    private double perimeter;
    abstract double  calcArea();
    abstract double calcPerimeter();
    public String getName(){ return name;}
    public double getArea(){return area;}
    public double getPerimeter(){return perimeter;}
    public void setArea(double area){this.area = area;}
    public void setPerimeter(double perimeter){this.perimeter = perimeter;}


    shapes (String name) {
        this.name = name;
    }

}
