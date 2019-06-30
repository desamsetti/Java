package com.company;

public class Point {
    int x;
    int y;

    public Point(){
    }

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        System.out.println("This is the output "+Math.sqrt((this.x-0)*(this.x-0) + (this.y-0)*(this.y-0)));
        return Math.sqrt((0-this.x)*(0-this.x) + (0-this.y)*(0-this.y));
    }

    public double distance(int x, int y){
        Point p1 = new Point(x,y);
        return Math.sqrt((p1.x-this.x)*(p1.x-this.x) + (p1.y-this.y)*(p1.y-this.y));
    }

    public double distance(Point anotherPoint){
        Point p = new Point();
        return Math.sqrt((anotherPoint.x-p.x)*(anotherPoint.x-p.x) + (anotherPoint.y-p.y)*(anotherPoint.y-p.y));
    }
}
