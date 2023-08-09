package ru.cft.study.shapes;

public class shapesFactory {
        public static shapes createShape(String name, String[] parametrs) {
            shapes shape = null;
            ShapeType type;
            try {
                type = ShapeType.valueOf(name);
                switch (type) {
                    case CIRCLE:
                        shape = new circle("Круг", Float.parseFloat(parametrs[0]));
                        break;
                    case RECTANGLE:
                        shape = new rectangle("Прямоугольник", Float.parseFloat(parametrs[0]), Float.parseFloat(parametrs[1]));
                        break;
                    case TRIANGLE:
                        shape = new triangle("Треугольник", Float.parseFloat(parametrs[0]), Float.parseFloat(parametrs[1]), Float.parseFloat(parametrs[2]));
                        break;
                }
            }
             catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Для фигуры " + name + " неправильное колличество параметров");
            } catch (NumberFormatException ex) {
                System.out.println("Параметры должны быть заданы как числовые. Пустые параметры не допускаются.");
            } catch (IllegalArgumentException ex){
                System.out.println("Не предусмотрена обработка фигуры " + name);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            return shape;
        }
    }

