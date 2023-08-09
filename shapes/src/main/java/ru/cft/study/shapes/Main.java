package ru.cft.study.shapes;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<shapes> shapesArrayList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0])))
        {
            int count = 0;
            String line;
            String name = null;
            shapes shapesRead;
            String[] parametrs;
            while ((line = reader.readLine()) != null) {
                if (count % 2 == 0) {
                    name = line;
                } else {
                    parametrs = line.split(" ");
                    shapesRead = shapesFactory.createShape(name, parametrs);
                    if (shapesRead != null) {
                        shapesArrayList.add(shapesRead);
                    }
                }
                count++;
            }
            //После того как прочитали, все что можно прочитать, запишем в файл.
            try (FileOutputStream fileOutputStream = new FileOutputStream(args[1])) {
                System.out.println("Начинаем запись, колличество считанных фигур " + shapesArrayList.size());
                for (shapes shapeWrite : shapesArrayList) {
                    if (shapeWrite instanceof circle) {
                        circle c = (circle) shapeWrite;
                        fileOutputStream.write(PrintInfoShapesOne.PrintCircle(c).getBytes());
                    }
                    if (shapeWrite instanceof rectangle) {
                        rectangle r = (rectangle) shapeWrite;
                        fileOutputStream.write(PrintInfoShapesOne.PrintRectangle(r).getBytes());
                    }
                    if (shapeWrite instanceof triangle) {
                        triangle tr = (triangle) shapeWrite;
                        fileOutputStream.write(PrintInfoShapesOne.PrintTriangle(tr).getBytes());
                    }
                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
