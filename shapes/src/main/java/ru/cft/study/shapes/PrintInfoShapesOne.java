package ru.cft.study.shapes;

import java.text.DecimalFormat;

public class PrintInfoShapesOne {
    private static DecimalFormat formatter = new DecimalFormat("0.00");
    private static String printName(String name){
        return "Тип фигуры: " + name + "\n";
    }
    private static String printArea(double area){
        return "Площадь: " + formatter.format(area) + " кв. мм." + "\n";
    }
    private static String printPer(double perimeter){
        return "Периметр: " + formatter.format(perimeter) + " мм." + "\n";
    }
    private static String printRadius(double radius){
        return "Радиус: " + formatter.format(radius) + " мм." + "\n";
    }
    private static String printDiametr(double radius){
        return "Радиус: " + formatter.format(radius) + " мм." + "\n";
    }
    private static String printLenght(double lenght){
        return "Длина: " + formatter.format(lenght) + " мм." + "\n";
    }
    private static String printWidth(double width){
        return "Ширина: " + formatter.format(width) + " мм." + "\n";
    }
    private static String printDiagonalLength(double diagonal){
        return "Длина диагонали: " + formatter.format(diagonal) + " мм." + "\n";
    }
    private static String printLenghtsAndCors(double a, double b, double c, double acos, double bcos, double ccos){
        return "Длина стороны a " + formatter.format(a) +" мм." + ", противолежащий угол " + formatter.format(acos) + " градусов \n"
                + "Длина стороны b " + formatter.format(b) +" мм." + ", противолежащий угол " + formatter.format(bcos) + " градусов \n"
                + "Длина стороны c " + formatter.format(c) +" мм." + ", противолежащий угол " + formatter.format(ccos) + " градусов";
    }

    public static String PrintCircle(circle c){
        return  printName(c.getName()) + printArea(c.getArea()) + printPer(c.getPerimeter()) + printRadius(c.getRadius()) + printDiametr(c.getDiameter()) + "\n\n";
    }
    public static String PrintRectangle(rectangle r){
        return  printName(r.getName()) + printArea(r.getArea()) + printPer(r.getPerimeter()) + printDiagonalLength(r.getDiagonalLength()) + printLenght(r.getLenght()) + printWidth(r.getWidth())  + "\n\n";
    }
    public static String PrintTriangle(triangle tr){
        return  printName(tr.getName()) + printArea(tr.getArea()) + printPer(tr.getPerimeter()) + printLenghtsAndCors(tr.getA(), tr.getB(), tr.getC(), tr.getAcos(), tr.getBcos(), tr.getCcos()) + "\n\n";
    }

}
