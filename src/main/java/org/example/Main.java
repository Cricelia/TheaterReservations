package org.example;

import javax.security.auth.callback.ConfirmationCallback;

public class Main {
    public static void main(String[] args) {

        TheaterReservations reservation = new TheaterReservations(" ", " ", 0, " ", " ");
        reservation.Information();
        reservation.Confirmation();
    }
}