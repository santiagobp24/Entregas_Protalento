package com.protalento.Practica_semanal_semana_3;


import java.util.*;

public class App {

    public static class Pupilo implements Comparable <Pupilo>{


        private String nombre;
        private int nroExamen;
        private float calificacion;

        public Pupilo(String nom, int nroE,float cal) {
            nombre = nom;
            nroExamen = nroE;
            calificacion = cal;
        }


        public String getNombre() {
            return nombre;
        }


        @Override
        public int compareTo(Pupilo o) {

            return nombre.compareTo(o.nombre);
        }
    }

    public static class CompararP implements Comparator<Pupilo>{

        @Override
        public int compare(Pupilo a, Pupilo b) {
            if(a.calificacion > b.calificacion){
                return -1;
            }else if(a.calificacion == b.calificacion){
                return 0;
            }else{
                return 1;
            }
        }
    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese el número de estudiantes");
        int numEst = Integer.parseInt(scan.next());
        int cont = 1;
        int conts = 0;
        int zel = 0;
        ArrayList<Pupilo> Resultados = new ArrayList<>();
        ArrayList<Pupilo> Resultados2 = new ArrayList<>();
        ArrayList<Pupilo> Resultados4 = new ArrayList<>();
        ArrayList <Pupilo> sierra = new ArrayList<>();

        while (cont <= numEst) {

            System.out.println("Por favor, ingrese el nombre del estudiante");
            String n = scan.next();
            System.out.println("Por favor, ingrese el apellido del estudiante");
            String a = scan.next();
            System.out.println("Por favor, ingrese el número de examen del estudiante");
            int ex = Integer.parseInt(scan.next());
            System.out.println("Por favor, ingrese la calificación del estudiante");
            int cali = Integer.parseInt(scan.next());

            if (cali < 0 || cali > 10) {
                System.out.println("La nota ingresada es equivocada, vuelva a llenar la información del estudiante");
                break;
            } else {


                String nuevoN = n + " " + a;


                Pupilo estu = new Pupilo(nuevoN, ex, cali);
                Resultados.add(estu);

                float punto = cali;
                float acumulador = 0;


                for (int ter = 0; ter < Resultados.size(); ter++) {
                    if (Resultados.get(zel).nombre.equals(Resultados.get(ter).nombre)) {
                        conts = conts + 1;
                        acumulador = acumulador + Resultados.get(ter).calificacion;
                        punto = acumulador / conts;

                    } else {
                        punto = cali;

                    }

                }


                conts = 0;

                Pupilo nestu = new Pupilo(nuevoN, ex, punto);

                Resultados2.add(nestu);

                cont = cont + 1;
                zel = zel + 1;
            }


        }

        Collections.sort(Resultados2);


        int conts2 = 0;
        int conts3 = 0;

        Pupilo bait = new Pupilo("xxx",0,1);
        Resultados2.add(bait);


        for (int ter = 0; ter < Resultados2.size(); ter++) {

            if (conts2 > 0){
                if(Resultados2.get(ter).nombre.equals(Resultados2.get(ter-1).nombre)){
                    conts3++;
                }else{
                    Resultados4.add(Resultados2.get(ter-1));
                    sierra.add(Resultados2.get(ter-1));
                }
            }
            conts2++;

        }

        Collections.sort(sierra, new CompararP());

        System.out.println("Calificación más alta: "+ sierra.get(0).calificacion+"\n");
        System.out.println("Calificación más baja: "+ sierra.get(sierra.size()-1).calificacion+"\n");

        System.out.println("Aprobados \n");

        for (int f = 0; f < sierra.size(); f++){
            if(sierra.get(f).calificacion >= 7){
                System.out.println(sierra.get(f).calificacion);
            }

        }

        System.out.println("Desaprobados \n");

        for (int f = 0; f < sierra.size(); f++){
            if(sierra.get(f).calificacion < 7){
                System.out.println(sierra.get(f).calificacion);
            }

        }

    }
}