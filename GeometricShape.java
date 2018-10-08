
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
public class GeometricShape {
    
    public String color;
    public boolean filled;
    public Date dateCreated;

    public GeometricShape() {
     this.color="white";
     this.filled=false;
     this.dateCreated=new Date();
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public GeometricShape(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated=dateCreated;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "color=" + color + ", filled=" + filled;
    }
   
    
}
