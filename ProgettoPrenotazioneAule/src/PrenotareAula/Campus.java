/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrenotareAula;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Federico
 */
public class Campus {

    private String name;
    List<Classroom> classi;

    public Campus(String name) {
        this.name = name;
        classi = new ArrayList();
    }

    /* il metodo ask for reservation accetta come parametri una capacità, 
     un oggetto di tipo calendar con solo la data e un intero di inizio
     e fine prenotazione
     */
    public void askForReservation(int capacity, Calendar ca, int startHour, int endHour) throws FileNotFoundException, IOException {
        FileReader file = new FileReader("classi.txt");
        BufferedReader in = new BufferedReader(file);
        while (in.ready()) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            Classroom cl = new Classroom(st.nextToken(), Integer.parseInt(st.nextToken()));
            classi.add(cl);
        }

        Collections.sort(classi);
        /*
         for (Classroom cl : classi) {
         if (cl.verifyReservation(capacity) == true) {
         if (askUser()==true) {
         cl.getResReg().makeReservation();
         }
         else
         {
         System.out.println("prenotazione non effettuata");
         }

         }
         }
         */
    }

    public boolean askUser() {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("è stata trovata un'aula adatta per la prenotazione confermare? (Y|N)");
        if (tastiera.next().equals("Y")) {
            return true;
        } else {
            return false;
        }
    }

    public List<Classroom> getClassi() {
        return classi;
    }

}
