package ru.cft.study.shapes;

import java.text.DecimalFormat;

abstract class shapes {
    private String name;
    private double area;
    private double perimeter;
    DecimalFormat formatter = new DecimalFormat("0.00");
    abstract double  calcArea();
    abstract double calcPerimeter();
    public String getName(){ return "Тип фигуры: " + name + "\n";}
    public String getArea(){return "Площадь: " + formatter.format(area) + " кв. мм." + "\n";}
    public String getPerimeter(){return "Периметр: " + formatter.format(perimeter) + " мм." + "\n";}
    public void setArea(double area){this.area = area;}
    public void setPerimeter(double perimeter){this.perimeter = perimeter;}


    shapes (String name) {
        this.name = name;
    }

}
