package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    static Scanner asking = new Scanner(System.in);
    private String fullName;
    private String date;
    private int ticketNum;
    private String lastName;
    private String firstName;
    static DateTimeFormatter formatter;
    public TheaterReservations(String fullName, String date, int ticketNum, String lastName, String firstName) {
        this.fullName = fullName;
        this.date = date;
        this.ticketNum = ticketNum;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public void Information() {
        System.out.println("Please enter your name: ");
        fullName = asking.nextLine().trim();
        System.out.println("What date (MM/DD/YYYY): ");
        this.date = asking.nextLine().trim();
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(this.date, formatter);
        System.out.println("How many tickets: ");
        this.ticketNum = asking.nextInt();
        asking.nextLine();
    }
    public void Confirmation() {
        String[] splitName = fullName.split("\\s+");
        firstName = splitName[0];
        lastName = splitName[1];
        if (this.ticketNum <= 1) {
            System.out.println(this.ticketNum + " ticket reserved for " + this.date + " under " + this.lastName + ", " + this.firstName);
        } else {
            System.out.println(this.ticketNum + " tickets reserved for " + this.date + " under " + this.lastName + ", " + this.firstName);
        }
    }
}
