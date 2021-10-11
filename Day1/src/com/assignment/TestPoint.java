package com.assignment;
import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args) {
		//Taking input via the Scanner class
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter the x coordinate for p1");
		double x1 = s.nextDouble();
		System.out.println("Enter the y coordinate for p1");
		double y1 = s.nextDouble();
		//Building point p1 using parameterized constructor
		Point2D p1 = new Point2D(x1,y1);
		System.out.println("Enter the x coordinate for p2: ");
		double x2 = s.nextDouble();
		System.out.println("Enter the y coordinate for p2: ");
		double y2 = s.nextDouble();
		//Building point p2 using parameterized constructor
		Point2D p2 = new Point2D(x2,y2);
		//Print details of the point p1 & p2
		System.out.println("P1: "+p1.getDetails()); 
		System.out.println("P2: "+p2.getDetails()); 
		//Let's see if the points are equal.
		boolean compare = p1.isEqual(p2);
		if(compare==true) {
			System.out.println("The points are same/equal");
		}else {
			System.out.println("The points are different/unequal");
		}
		
		//Offsetting point p1 and p2 from point p3
		double xOff,yOff;
		System.out.println("Transforming the points - Enter the offset value for x-coordinate: ");
		xOff = s.nextDouble();
		System.out.println("Transforming the points - Enter the offset value for y-coordinate: ");
		yOff = s.nextDouble();
		Point2D p3 = new Point2D(xOff,yOff);
		p3 = p1.pointOffset(xOff, yOff);
		System.out.println("p1 transformed value: "+"("+p3.x_coordinate+", "+p3.y_coordinate+")");
		p3 = p2.pointOffset(xOff, yOff);
		System.out.println("p2 transformed value: "+"("+p3.x_coordinate+", "+p3.y_coordinate+")");
		//Calculating the distance between 2 points
		double dist = p1.calcDistance(p2);
		System.out.println("Distance between 2 points p1 & p2 - "+dist);
		dist = p1.calcDistance(p3);
		System.out.println("Distance between 2 points p1 & p3 - "+dist);
		dist = p2.calcDistance(p3);
		System.out.println("Distance between 2 points p2 & p3 - "+dist);
		
	}
}

