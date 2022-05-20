package com.protalento.Practica_semanal_semana_2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calendar fechaIn = new Calendar() {
            @Override
            protected void computeTime() {

            }

            @Override
            protected void computeFields() {

            }

            @Override
            public void add(int field, int amount) {

            }

            @Override
            public void roll(int field, boolean up) {

            }

            @Override
            public int getMinimum(int field) {
                return 0;
            }

            @Override
            public int getMaximum(int field) {
                return 0;
            }

            @Override
            public int getGreatestMinimum(int field) {
                return 0;
            }

            @Override
            public int getLeastMaximum(int field) {
                return 0;
            }
        };

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la fecha en el formato dd/mm/AAAA");
        String fechaif = scan.next();
        String a = fechaif.substring(0, 2);
        String b = fechaif.substring(3, 5);
        String c = fechaif.substring(6, 10);
        int numMONTH = Integer.parseInt(b);
        int numYEAR = Integer.parseInt(c);
        int numDAY = Integer.parseInt(a);


        int numD = 31;
        if(numMONTH == 4 || numMONTH == 6 || numMONTH == 9 || numMONTH == 11){
            numD = 30;
        }
        if (numMONTH == 2){
            if ((numYEAR % 4) == 0 && (numYEAR % 100) == 0){
                numD = 29;
            } else {
                numD = 28;
            }
        }
        if (numYEAR == 2022){
            if(numMONTH == fechaIn.MONTH){
                if(numDAY >= 1 && numDAY <= fechaIn.DAY_OF_MONTH ){
                    System.out.println("la fecha es v�lida");
                } else {
                    System.out.println("la fecha es inv�lida");
                }
            }else if (numMONTH < fechaIn.MONTH){
                if (numDAY >= 1 && numDAY <= numD){
                    System.out.println("la fecha es v�lida");
                }
            }else{
                System.out.println("la fecha es inv�lida");
            }
        }
        if (numYEAR != 2022 && numYEAR >=1900 && numYEAR <= 2099){
            if (numMONTH >= 1 && numMONTH <= 12){
                if (numDAY >= 1 && numDAY <= numD){
                    System.out.println("la fecha es v�lida");
                } else {
                    System.out.println("la fecha es inv�lida");

                }
            } else {
                System.out.println("la fecha es inv�lida");

            }

        }else{

        }
    }
}