/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

/**
 *
 * @author acer
 */
public class Lingkaran {
    double radius;
    
    double luas (){
        return 3.14 * Math.pow(radius, 2);
    }
    
    double keliling(){
        return 2 * 3.14 *radius; 
    }
}
