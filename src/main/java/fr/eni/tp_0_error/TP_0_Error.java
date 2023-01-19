/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.tp_0_error;

import java.util.Scanner;



/**
 *
 * @author erwan
 */
public class TP_0_Error {

    public static void main(String[] args) {
        int a = 18; // j'ai juste remplacé la majuscule par une minuscule
        int b = 10; // j'ai remplacé le double par un int pour pourvoir faire l'addition plus bas
        //j'ai retiré cette ligne car "a" a déja été déclarer
        Scanner scanInput = new Scanner(System.in);// j'ai importer la bibliothèque de scanner, à la place de "s" j'ai remplacer par scanInput et j'ai rajouter apres new scanner (System.in)
        System.out.println(b); // j'ai juste ajouter ";" car sans ca ne fonctionne pas
        double addition = addition(a,b); // la variable était mal déclarer
        String[] c = ["2","1","2","1"];   //j'ai déplacer cette ligne au dessus car en dessous on a besoin c et si c est en dessous de 
        double multiplication= multiplication(a,b,c); // la variable était mal déclarer
        
    }
    public static int addition(int a, int b)
    {
        return a + b;
    }
    
    public static int multiplication(int b, int a, int c) // j'ai déclarer c ici
    {
        c = b * a; 
        return c;
    }
}
