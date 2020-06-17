/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecadet.coursjenkins;

/**
 *
 * @author Edward Cadet
 */
public class FonctionMath {
    public static int add(String valeur1, String valeur2) {
        int valeurInt1 = Integer.parseInt(valeur1);
        int valeurInt2 = Integer.parseInt(valeur2);
        
        return valeurInt1 + valeurInt2;
    }
    
    public static int minus(String valeur1, String valeur2) {
        int valeurInt1 = Integer.parseInt(valeur1);
        int valeurInt2 = Integer.parseInt(valeur2);
        
        return valeurInt1 - valeurInt2;
    }
    
    public static double divide(String valeur1, String valeur2) {
        double valeurInt1 = Double.parseDouble(valeur1);
        double valeurInt2 = Double.parseDouble(valeur2);
        
        return valeurInt1 / valeurInt2;
    }
}
