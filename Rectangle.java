
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
public class Rectangle extends GeometricShape{
     private double width;
     private double height;
      
    public Rectangle() {
        this.width=1.0;
        this.height=1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
     public Rectangle (String color, boolean filled, Date dateCreated,double width, double height) {
        super(color, filled, dateCreated);
        this.width=width;
        this.height=height;
        
    }
   
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return this.width*this.height;
    }
    
    public double getPerimeter() {
        return (this.width*this.height)*2;
    }
}
