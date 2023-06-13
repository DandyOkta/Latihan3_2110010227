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
public class PersegiPanjang {
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    
    
    double luas (){
        return panjang * lebar;
    }
    
    double keliling(){
        return  2*(panjang * lebar);
    }
}
