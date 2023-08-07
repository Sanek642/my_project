package ru.cft.study.shapes;

import static java.lang.Math.abs;

public class triangle extends shapes{
    private double a;
    private double b;
    private double c;
    private double acor;
    private double bcor;
    private double ccor;
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
            this.acor = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
            this.bcor = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
            this.ccor = 180 - this.acor - this.bcor;
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

    public String getLenghtsAndCors(){
        return "Длина стороны a " + formatter.format(a) +" мм." + ", противолежащий угол " + formatter.format(acor) + " градусов \n"
                + "Длина стороны b " + formatter.format(b) +" мм." + ", противолежащий угол " + formatter.format(bcor) + " градусов \n"
                + "Длина стороны c " + formatter.format(c) +" мм." + ", противолежащий угол " + formatter.format(ccor) + " градусов";
    }
}
