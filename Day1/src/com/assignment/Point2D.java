package com.assignment;

class Point2D{
//Structure
	double x_coordinate;
	double y_coordinate;
//Constructor
	Point2D(double x, double y){
		x_coordinate = x;
		y_coordinate = y;
	}
	String getDetails() {
		return ("("+this.x_coordinate+", "+this.y_coordinate+")");
	}
	boolean isEqual(Point2D p2) {
		if((this.x_coordinate==p2.x_coordinate)&&(this.y_coordinate==p2.y_coordinate)){
			return true;
		}
		else {
			return false;
		}
	}
	Point2D pointOffset(double xOffset, double yOffset) {
		Point2D new_point = new Point2D(x_coordinate,y_coordinate);
		new_point.x_coordinate+=xOffset;
		new_point.y_coordinate+=yOffset;
		return new_point;
	}
	double calcDistance(Point2D anotherPoint) {
		double y_diff = this.y_coordinate-anotherPoint.y_coordinate;
		double x_diff = this.x_coordinate-anotherPoint.x_coordinate;
		double distance = Math.pow(y_diff,2)+Math.pow(x_diff,2);
		return distance;
	}
	
}