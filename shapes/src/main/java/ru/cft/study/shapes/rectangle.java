package ru.cft.study.shapes;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class rectangle extends shapes{

    private double a;
    private double b;
    private double diagonal;
    private double lenght;
    private double width;
    public rectangle(String name, double a, double b) throws Exception {
        super(name);
        if (a!=0 && b!=0){
            this.a = abs(a);
            this.b = abs(b);
            this.lenght = a > b ? a : b;
            this.width = b < a ? b : a;
            this.diagonal = sqrt(a*a + b*b);
        } else{
            throw new Exception("Длина и ширина должны отличаться от 0");
        }
        super.setArea(this.calcArea());
        super.setPerimeter(this.calcPerimeter());
    }

    public String getDiagonalLength(){
        return "Длина диагонали: " + formatter.format(diagonal) + " мм." + "\n";
    }

    public String getLenght(){
        return "Длина: " + formatter.format(lenght) + " мм." + "\n";
    }
    public String getWidth(){
        return "Ширина: " + formatter.format(width) + " мм." + "\n";
    }

    @Override
    double calcArea() {
        return a*b;
    }

    @Override
    double calcPerimeter() {
        return 2*(a+b);
    }
}
