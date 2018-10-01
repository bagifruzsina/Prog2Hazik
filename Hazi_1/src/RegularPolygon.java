/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n=3;
        this.side=1;
        this.x=0;
        this.y=0; 
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x=0;
        this.y=0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    public int getN() {
        return this.n;
    }
    
    public double getSide() {
        return this.side;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public void setN(int n1) {
        this.n=n1;
    }
    
    public void setSide(double s1) {
        this.side=s1;
    }
    
    public void setX(double x1) {
        this.x=x1;
    }
    
    public void setY(double y1) {
        this.y=y1;
    }
   
    public double getPerimeter() {
        return this.n*this.side;
    }
    
    public double getArea() {
        return (0.25*(this.n*(this.side*this.side))*(1/Math.tan(Math.PI/this.n)));
    }

    @Override
    public String toString() {
        return "RegularPolygon{" + "sokszög oldalainak száma=" + n + ", oldal hossza=" + side + 
                ", középpont x-koordinájája=" + x + ", középpont y-koordinátája=" + y + '}';
    }
    
}
