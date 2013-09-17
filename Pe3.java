/*
Name: Jason Williams
SSOID#: jaw7w6
Class: CS2261
Section: E01
Programming Exercise #3
*/

import java.util.Scanner;
import java.io.*;

public class Pe3{
  public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Enter values for r: 0 1 2 3"); //Gets input values for r
	 double r0 = input.nextInt();
	 double r1 = input.nextInt();
	 double r2 = input.nextInt();
	 double r3 = input.nextInt();

     L0 l0 = new L0(r0);  

	 for (int i = 0; i < 2; i++) {    //Loop to get input values of theta, does this twice
     System.out.println("Enter values for theta: 0 1 2 3");
     double theta0 = input.nextInt();
	 double theta1 = input.nextInt();
	 double theta2 = input.nextInt();
	 double theta3 = input.nextInt();

     l0.move(theta0);   //Movement of links
	 System.out.println(l0);

     L1 l1 = new L1(r1, l0);
	 l1.move(theta1);
	 System.out.println(l1);

	 L2 l2 = new L2(r2, l1);
	 l2.move(theta2);
	 System.out.println(l2);

     L3 l3 = new L3(r3, l2);
     l3.move(theta3);
	 System.out.println(l3);
	 l3.tooltip();
	 }

	 System.out.println("PROGRAM ENDS");

	 }

public static class L0 {

   double r;
   double x = 0;
   double y = 0;
   double theta = 0;
   double thetaR = 0;

   public L0() {
   }

   public L0(double r0) {
      r = r0;
   }

   public double getX() {
	  return x;
   }

   public double getY() {
	  return y;
   }

   public String toString() {
      return "r0= " + r + " theta= " +
	     theta + " x0= " + x + " y0= " + y;
   }

   public void move(double d) {
	  theta += d;
	  thetaR += Math.toRadians(d);
      x = r * Math.cos(thetaR);
	  y = r * Math.sin(thetaR);
   }
}

public static class L1 extends L0 {

   public L0 l0;

   public L1() {
   }

   public L1(double r1, L0 l0) {
	  this.l0 = l0;
	  r = r1;
	  x = l0.getX();
	  y = l0.getY();
   }

   public double getX() {
      return x;
   }

   public double getY() {
      return y;
   }

   public String toString() {
      return "r1= " + r + " theta= " +
	     theta + " x1= " + x + " y1= " + y;
   }

   public void move(double d) {
	  theta += d;
	  thetaR += Math.toRadians(d);
	  x += r * Math.cos(thetaR);
	  y += r * Math.sin(thetaR);
   }
}

public static class L2 extends L1 {

   public L1 l1;

   public L2() {
   }

   public L2(double r2, L1 l1) {
      this.l1 = l1;
	  r = r2;
	  x = l1.getX();
	  y = l1.getY();
   }

   public double getX() {
      return x;
   }

   public double getY() {
      return y;
   }

   public String toString() {
	  return "r2= " + r + " theta= " +
	     theta + " x2= " + x + " y2= " + y;
   }

   public void move(double d) {
	  theta += d;
	  thetaR += Math.toRadians(d);
	  x += r * Math.cos(thetaR);
	  y += r * Math.sin(thetaR);
   }
}

public static class L3 extends L2 {

   public L2 l2;

   public L3() {
   }

   public L3(double r3, L2 l2) {
      this.l2 = l2;
	  r = r3;
	  x = l2.getX();
	  y = l2.getY();
   }

   public double getX() {
      return x;
   }

   public double getY() {
	  return y;
   }

   public String toString() {
	  return "r3= " + r + " theta= " +
         theta + " x3= " + x + " y3= " + y;
   }

   public void move(double d) {
      theta += d;
	  thetaR += Math.toRadians(d);
	  x += r * Math.cos(thetaR);
	  y += r * Math.sin(thetaR);
   }

   void tooltip() {
	  System.out.println("toolTip: " + Math.round(x) + " " + Math.round(y));
   }
}
}
