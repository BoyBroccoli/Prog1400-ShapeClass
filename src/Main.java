import inc.*;

import javax.sound.sampled.SourceDataLine;
import javax.swing.*;
import java.util.Random.*;
import java.util.ArrayList;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Random ran = new Random();
        String report = "Shapes in memory: ";
        String randColor, randName;
        String[] colors = new String[] {"red", "green", "blue", "yellow", "purple"};
        String[] names = new String[] {"Tony", "Johnson", "Hank", "Tank", "Stank", "Frank", "Dank"}; 
        ArrayList<Circle> circles = new ArrayList<Circle>(); // arrayList of circles
        ArrayList<Square> squares = new ArrayList<Square>(); // arrayList of squares
        ArrayList<Triangle> triangles = new ArrayList<Triangle>(); // arrayList of Triangles

        // Prompting user to see how many shapes they want to create
        String numOfShapes = JOptionPane.showInputDialog(null, "How many shapes do you want to use?");
        int numShapes = Integer.parseInt(numOfShapes); 

      
       
        // For loop to create Objects
        for(int i=0; i<numShapes; i++){
            // Creating Circle Objects
            double radi = ran.nextInt(95);
            randColor = getRandomString(colors);
            randName = getRandomString(names);
            circles.add(new Circle(radi, randName, randColor)); 

            // Creating Square objects
            randColor = getRandomString(colors);
            randName = getRandomString(names);
            squares.add(new Square(i+20, i+3, randName, randColor));

            // Creating Triangle objects
            randColor = getRandomString(colors);
            randName = getRandomString(names);
            triangles.add(new Triangle(i+34, i+5, randName, randColor)); 
        }

      
        
        report+= "\n\nCircles:";
        for(Circle current: circles){
            report += "\n\t" + current.getStringDisplay();
        }

        report += "\n\nRectangles:";    //Heading for rectangles section
        for(Square current: squares){
            report += "\n\t" + current.getStringDisplay();
        }
        
        report += "\n\nTriangles";
        for(Triangle current: triangles){
            report += "\n\t" + current.getStringDisplay();
        }

        // collecting and displaying number of shapes created
        report += "\n\nTotal Shapes: " + Shape.shapeCount;

        JOptionPane.showMessageDialog(null, report);
        
    }



    private static String getRandomString(String[] array) {
        Random ran = new Random();
        return array[ran.nextInt(array.length)];
    }
}