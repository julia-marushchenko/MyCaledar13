/**
 *  Java program to use abstract Calendar class.
 */

package com.mycallendar;

import java.util.Calendar;

/**
 *  Main class.
 */
public class Main {

    // JVM entrz point.
    public static void main(String[] args) {

        // Creating instance of Callendar class.
        Calendar myCalendar = Calendar.getInstance();

        // Printing today's date to console.
        System.out.println(myCalendar.getTime()); // Output: Sun Mar 22 21:39:41 CET 2026

        // Printing day of week to console.
        System.out.println(myCalendar.get(Calendar.DAY_OF_WEEK)); // Output: 1

        // Printing month of week to console.
        System.out.println(1 + myCalendar.get(Calendar.MONTH)); // Output: 3

        // Printing year of week to console.
        System.out.println(1 + myCalendar.get(Calendar.YEAR)); // Output: 2027

    }
}