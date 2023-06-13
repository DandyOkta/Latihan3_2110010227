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
public class GeometriBeraksi {
    public static void main(String[] args) {
        Lingkaran dandy = new Lingkaran(10);
        PersegiPanjang ikuk = new PersegiPanjang(10,10);
        
        
        
        System.out.println("Luas Lingkaran : "+dandy.luas());
        System.out.println("Keliling Lingkaran : "+dandy.keliling());
        System.out.println("");
        System.out.println("Luas Persegi panjang : "+ikuk.luas());
        System.out.println("Keliling Persegi panjang : "+ikuk.keliling());
    }
}
