package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    public Point (double x, double y) {
        this.x=x;
        this.y=y;
    }
    public Point (){
        x= 0.0;
        y= 0.0;
    }
    public void setPoint (double x,double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double distance(Point other) {
        double deltaX = this.x - other.x;
        double deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public void rotate(double angle) {
        double xPrime = x * Math.cos(angle) - y * Math.sin(angle);
        double yPrime = x * Math.sin(angle) + y * Math.cos(angle);
        x = xPrime;
        y = yPrime;
    }
    public void shiftX(double shift) {
        x += shift;
    }

    public void shiftY(double shift) {
        y += shift;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }



}
