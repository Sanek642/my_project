package ru.cft.study.shapes;

import java.text.DecimalFormat;

import static java.lang.Math.abs;

public class circle extends shapes{
    private double radius;
    private double diameter;
    circle(String name, double radius) throws Exception {
        super(name);
        if (radius != 0) {
            this.radius = abs(radius);
            this.diameter = 2 * radius;
        } else {
            throw new Exception("Радиус не должен быть равен 0");
        }
        super.setArea(this.calcArea());
        super.setPerimeter(this.calcPerimeter());
    }

    public String getDiameter(){
        return "Диаметр: " + formatter.format(diameter) + " мм." + "\n";
    }
    public String getRadius(){
        return "Радиус: " + formatter.format(radius) + " мм." + "\n";
    }

    @Override
    double calcArea() {
        return radius*radius*Math.PI;
    }

    @Override
    double calcPerimeter() {
        return 2*Math.PI*radius;
    }
}
