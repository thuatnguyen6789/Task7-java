package session6;

import java.util.Scanner;

public class Ticket {
    private int date;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private int type;
    private int number;
    private double price;

    public boolean validDate() {
        int []dateMax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year<0)
            return false;
        if(month>13)
            return false;
        if(year % 4 == 0) {
            dateMax[2] = 29;
        }
        if(date > dateMax[month]){
            return false;
        }
        return true;
    }
    public boolean validTime() {
        int []hourMax = {23};
        int []minuteMax = {59};
        if(hour>23) {
            return false;
        }
        if(minute>59) {
            return false;
        }
        return true;
    }
    public void inputDate() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input Date: ");
            date = sc.nextInt();
            System.out.println("Input Month: ");
            month = sc.nextInt();
            System.out.println("Input Year: ");
            year = sc.nextInt();
        }
        while (!validDate());

    }
    public void inputTime() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input Hour: ");
            hour = scanner.nextInt();
            System.out.println("Input Minute: ");
            minute = scanner.nextInt();
        } while (!validTime());
    }
    public void inputType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Type of cabin");
        type = sc.nextInt();
        if (type == 1) {
            System.out.println("Type of cabin: Business Class");
            System.out.println("Total cost of the ticket: 9000$");
        }
        if (type == 2) {
            System.out.println("Type of cabin: First Class");
            System.out.println("Total cost of the ticket: 3000$");
        }
        if (type == 3) {
            System.out.println("Type of cabin: Economy Class");
            System.out.println("Total cost of the ticket: 1000$");
        }
    }
    public void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Nember of the ticket: ");
        number = sc.nextInt();
        System.out.println("Number of tickets: " +number);
    }
    public void display() {
        System.out.println("Departure Date: " + date+"/"+month+"/"+year);
        System.out.println("Departure time: " + hour+":"+minute);
    }
}
