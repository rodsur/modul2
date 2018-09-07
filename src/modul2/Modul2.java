/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author rodsur
 */
public class Modul2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Opgave A.1: Skriv et program, der udregner og udskriver arealet (π*r^2) af 5 forskellige cirkler med radius 1, 2, 3, 4 og 5.
        
        System.out.println("Opgave A.1:");
        
        double pi = 3.14;
        
        System.out.println("Arealet af en cirkel med radius 1 er: " + (pi*1*1));
        System.out.println("Arealet af en cirkel med radius 2 er: " + (pi*2*2));
        System.out.println("Arealet af en cirkel med radius 3 er: " + (pi*3*3));
        System.out.println("Arealet af en cirkel med radius 4 er: " + (pi*4*4));
        System.out.println("Arealet af en cirkel med radius 5 er: " + (pi*5*5));
        
        //Opgave A.2:  Skriv et program, der udregner omkredsen (2*π*r) af 2 cirkler med radius 3 hhv. 7, og udskriver summen af disse.
        
        System.out.println("Opgave A.2:");
        
        double o1 = 2 * pi * 3;
        double o2 = 2 * pi * 7;
        
        System.out.println("Den samlede omkreds er: " + (o1+o2));
        
        /*Opgave A.3:  Skriv et program, der givet 7 dagstemperaturer
        (21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9) udregner og udskriver 
        temperaturdifferencen mellem alle to på hinanden følgende dage 
        (dvs. Tirsdag-Mandag, Onsdag-Tirsdag ... Søndag - Lørdag).*/
        
        System.out.println("Opgave A.3");
        
        double mandag = 21.5;
        double tirsdag = 23.7;
        double onsdag = 19.6;
        double torsdag = 22.5;
        double fredag = 25.3;
        double lordag = 21.7;
        double sondag = 18.9;
        
        System.out.println("tirsdag - mandag: " + (tirsdag - mandag));
        System.out.println("onsdag - tirsdag: " + (onsdag - tirsdag));
        System.out.println("torsdag - onsdag: " + (torsdag - onsdag));
        System.out.println("fredag - torsdag: " + (fredag - torsdag));
        System.out.println("lørdag - fredag: " + (lordag - fredag));
        System.out.println("søndag - lørdag: " + (sondag - lordag));
        
    }
    
}