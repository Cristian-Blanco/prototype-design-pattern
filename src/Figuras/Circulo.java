/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
import Interface.*;//importamos de el paquete interface todo
/**
 *
 * @author Cristian Martinez
 */
public class Circulo implements Figuras_geometricas {//creamos una clase llamada circulo implementando
    
    private String nombre;//creamos una variable de tipo string
    private int radio;//creamos una variable de tipo entero llamada radio
    

    @Override//nos ayuda a sobreescribir el metodo
    public void setNombre(String n) {//sobreescribimos el metodo
        nombre = n;
    }

    @Override//nos ayuda a sobreescribir el metodo
    public String getNombre() {//sobreescribimos el metodo
        return nombre;
    }

    @Override//nos ayuda a sobreescribir el metodo
    public void tamaño(int x, int y) {//sobreescribimos el metodo
        radio = x;
    }

    @Override//nos ayuda a sobreescribir el metodo
    public void getposicion() {//sobreescribimos el metodo
        System.out.println("El radio del Circulo es: "+ radio);
    }

    @Override//nos ayuda a sobreescribir el metodo
    public Figuras_geometricas clonar() {//sobreescribimos el metodo
        //comenzamos a clonar la figura
        Figuras_geometricas geometrica = new Circulo();//Instanciamos la clase circulo para geometrica
        geometrica.setNombre(nombre);//le asignamos a geometrica el nombre del ciculo
        geometrica.tamaño(radio, radio);//le asignamos el radio a geometrica para que lo guarde en tamaño
        return geometrica;//retornamos geometrica
    }
    
}
