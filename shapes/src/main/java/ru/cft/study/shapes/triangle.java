package ru.cft.study.shapes;

import static java.lang.Math.abs;

public class triangle extends shapes{
    private double a;
    private double b;
    private double c;
    private double acos;
    private double bcos;
    private double ccos;
    private boolean checkTrianlge(double a, double b, double c){
        return !(((a + b) > c) && ((a + c) > b) && ((b + c) > a));
    }

    public triangle(String name, double a, double b, double c) throws Exception {
        super(name);
        if(a!=0 && b!=0 && c!=0) {
            this.a = abs(a);
            this.b = abs(b);
            this.c = abs(c);
            if (checkTrianlge(this.a, this.b, this.c)){
                throw new Exception("Сумма любых двух сторон должна быть больше третей!");
            }
            this.acos = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
            this.bcos = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
            this.ccos = 180 - this.acos - this.bcos;
        }
        else{
            throw new Exception("Стороны треугольника должны отличаться от 0");
        }
        super.setPerimeter(this.calcPerimeter());
        super.setArea(this.calcArea());
    }

    @Override
    double calcArea() {
        double pp = calcPerimeter()/2;
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }

    @Override
    double calcPerimeter() {
        return a + b + c;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getAcos(){
        return acos;
    }
    public double getBcos(){
        return bcos;
    }
    public double getCcos(){
        return ccos;
    }
}
