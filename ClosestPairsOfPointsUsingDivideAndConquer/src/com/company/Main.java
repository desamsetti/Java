package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public class Point{
        public int x;
        public int y;
        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static class Pair{
        public Point point1 = null;
        public Point point2 = null;
        public double distance = 0.0;

        public Pair(){

        }

        public Pair(Point p1, Point p2){
            this.point1 = p1;
            this.point2 = p2;
            calcDistance();
        }


        public void update(Point point1, Point point2, double distance){
            this.point1 = point1;
            this.point2 = point2;
            this.distance = distance;
        }


        public void calcDistance(){
            this.distance = distance(point1,point2);
        }


        public String toString(){
            return point1+"-"+point2+" : "+distance;
        }
    }

    public static double distance(Point p1,Point p2){
        double xdist = p2.x - p1.x;
        double ydist = p2.y - p1.y;
        return Math.hypot(xdist,ydist);
    }


    public static Pair bruteForce(List<Point> points) {
        int numPoints = points.size();
        if (numPoints < 2) return null;
        Pair pair = new Pair(points.get(0), points.get(1));
        if (numPoints > 2) {
            for (int i = 0; i < numPoints - 1; i++) {
                {
                    Point point1 = points.get(i);
                    for (int j = i + 1; j < numPoints; j++) {
                        Point point2 = points.get(j);
                        double distance = distance(point1, point2);
                        if (distance < pair.distance) {
                            pair.update(point1, point2, distance);
                        }
                    }
                }
            }
        }
        return pair;
    }
    public static void sortByX(List<Point> points){
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point point1, Point point2) {
                if(point1.x<point2.x){
                    return -1;
                }
                if(point1.x>point2.x){
                    return 1;
                }
                return 0;
            }
        });
    }


    public static void sortByY(List<Point> points){
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point point1, Point point2) {
                if(point1.y < point2.y)
                    return -1;
                if(point1.y>point2.y)
                    return 1;
                return 0;
            }
        });
    }




    public static Pair divideAndConquer(List<Point> points){
        List<Point> pointsSortedByX = new ArrayList<Point>(points);
        sortByX(pointsSortedByX);
        List<Point> pointsSortedByY = new ArrayList<Point>(points);
        sortByY(pointsSortedByY);
        return divideAndConquer(pointsSortedByX, pointsSortedByY);
    }

    public static Pair divideAndConquer(List<Point> pointsSortedByX, List<Point> pointsSortedByY){
        int numPoints = pointsSortedByX.size();
        if(numPoints<=3){
            return bruteForce(pointsSortedByX);
        }

        int dividingIndex = numPoints>>>1;

        List<Point> leftOfCenter = pointsSortedByX.subList(0,dividingIndex);
        List<Point> rightOfCenter = pointsSortedByX.subList(dividingIndex,numPoints);

        List<Point> tempList = new ArrayList<Point>(leftOfCenter);
        sortByY(tempList);

        Pair closestPair = divideAndConquer(leftOfCenter,tempList);


        tempList.clear();

        tempList.addAll(rightOfCenter);
        sortByY(tempList);
        Pair closestPairRight = divideAndConquer(rightOfCenter,tempList);

        if(closestPairRight.distance < closestPair.distance){
            closestPair = closestPairRight;
        }


        tempList.clear();
        double shortestDistance = closestPair.distance;
        double centerX = rightOfCenter.get(0).x;
        for(Point point:pointsSortedByY){
            if(Math.abs(centerX-point.x)<shortestDistance)
                tempList.add(point);
        }

        for(int i=0;i<tempList.size()-1;i++){
            Point point1 = tempList.get(i);
            for(int j=i+1;j<tempList.size();j++){
                Point point2 = tempList.get(j);
                if((point2.y - point1.y) >= shortestDistance){
                    break;
                }
                double distance = distance(point1,point2);
                if(distance<closestPair.distance){
                    closestPair.update(point1,point2,distance);
                    shortestDistance = distance;
                }
            }
        }
        return closestPair;
    }


    }