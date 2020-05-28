/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
import Interface.*;
/**
 *
 * @author Cristian Martinez
 */
public class Circulo implements Figuras_geometricas {
    
    private String nombre;
    private int radio;
    
    public Circulo(){
        
    }

    @Override
    public void setNombre(String n) {
        nombre = n;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void tamaño(int x, int y) {
        radio = x;
    }

    @Override
    public void getposicion() {
        System.out.println("El radio del Circulo es: "+ radio);
    }

    @Override
    public Figuras_geometricas clonar() {
        Figuras_geometricas geometrica = new Circulo();
        geometrica.setNombre(nombre);
        geometrica.tamaño(radio, radio);
        return geometrica;
    }
    
}
