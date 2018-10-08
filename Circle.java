
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class Circle extends GeometricShape {
    private double radius;
    
     public Circle() {
        this.radius=1.0;
    }

    public Circle(double radius) {
        this.radius =radius;
    }
     

    public Circle(double radius,String color,boolean filled ,Date dateCreated) {
        super(color, filled, dateCreated);
        this.radius = radius;
    }
   
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return this.radius*this.radius*3.141592;
    }
    
    public double getPerimeter() {
        return 2*this.radius*3.141592;
    }
    
    public double getDiameter(){
        return 2*this.radius;
    }
    
    
    
    
    
}
