/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import PrenotareAula.Reservation;
import PrenotareAula.ReservationRegister;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Aciredef
 */
public class TestReservationRegister {
    public static void main(String[] args) {
        Calendar ca = new GregorianCalendar();
        ca.set(3, 5, 2016);
        
        
        
        ReservationRegister r = new ReservationRegister("EF4");
        r.isReserved(ca, 9,11);
        System.out.println(r.isReserved(ca,9,11));
        System.out.println(r.makeReservation(ca,9,11));
        System.out.println(r.makeReservation(ca,9,11));
        r.isReserved(ca ,9,11);
        System.out.println(r.isReserved(ca ,9,11));
        System.out.println(r.makeReservation(ca,11,12));
        System.out.println(r.isReserved(ca ,9,11));
        System.out.println(r.isReserved(ca ,7,10));
        System.out.println(r.makeReservation(ca,7,11));
        System.out.println(r.makeReservation(ca,12,14));
        System.out.println(r.makeReservation(ca,13,17));
        System.out.println(r.makeReservation(ca,9,17));
    }
}
