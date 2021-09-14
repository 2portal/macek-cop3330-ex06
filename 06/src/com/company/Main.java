package com.company;
import java.util.Scanner;
import java.util.Calendar;
class Main {
    public static void main(String[] args) {

        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age?: ");
        Scanner ageinput = new Scanner (System.in);
        String Userage = ageinput.next();

        int age = Integer.parseInt(Userage);

        System.out.print("When would you like to retire?: ");
        Scanner retireinput = new Scanner (System.in);
        String RetirementAge = retireinput.next();

        int retirement = Integer.parseInt(RetirementAge);
        int userint = Integer.parseInt(Userage);

        int yearsleft=(retirement - userint);
        System.out.print("You have "+yearsleft+ " years until you can retire\n");

        System.out.print("it's "+year+ " so you can retire in " +(year+yearsleft));
    }
}