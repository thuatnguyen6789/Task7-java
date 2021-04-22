package session6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public int x3;
    public int y3;

    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
    public int getX3() {
        return x3;
    }
    public void setX3(int x3) {
        this.x3 = x3;
    }
    public int getY3() {
        return y3;
    }
    public void setY3(int y3) {
        this.y3 = y3;
    }
    public Triangle() {
    super();
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x3;
    this.y3 = y3;
    }
    public void InputPoint() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1:");
        x1 = scan.nextInt();
        System.out.println("Enter y1:");
        y1 = scan.nextInt();
        System.out.println("Enter x2:");
        x2 = scan.nextInt();
        System.out.println("Enter y2:");
        y2 = scan.nextInt();
        System.out.println("Enter x3:");
        x3 = scan.nextInt();
        System.out.println("Enter y3:");
        y3 = scan.nextInt();
    }
    public void Display() {
        System.out.println("The first point is: x1 ="+x1+" y1 ="+y1+"");
        System.out.println("The second point is: x2 ="+x2+" y2 ="+y2+"");
        System.out.println("The third point is: x3 ="+x3+" y3 ="+y3+"");
    }
    public void Distance() {
        double d1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The first Distance is: "+d1);
        double d2 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
        System.out.println("The second Distance is: "+d2);
        double d3 = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
        System.out.println("The third Distance is: "+d3);
        double pm = d1 + d2 + d3;
        if(d1+d2>d3 && d1+d3>d2 && d2+d3>d1) {
            System.out.println("Perimeter is: " +pm);
        }
        else {
            System.out.println("Khong hop le");
        }
    }
}
