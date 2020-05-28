
package Figuras;

import Interface.Figuras_geometricas;//importamos de el paquete interface todo


public class Rectangulo implements Figuras_geometricas{//creamos una clase llamada rectangulo y le implementamos la interface creada anteriormente
    private String Nombre;//creamos una variable nombre de tipo string
    private int pos_x, pos_y;//Creamos dos variables de tipo entero
    
    public Rectangulo(){//metodo constructor
    }
    
    @Override
    public void setNombre(String n){
     this.Nombre=n;   
    }
    public String getNombre(){
        return Nombre;
    }
     
    @Override
    public void tamaño(int x, int y){
           pos_x = x;
           pos_y = y;
        
    }
    
    @Override
    public void getposicion(){
       System.out.println("Altura del rectangulo: " + this.pos_y);
       System.out.println("Ancho del rectangulo: " + this.pos_x);  
    }
    
    @Override
    public Figuras_geometricas clonar(){
       
        Figuras_geometricas geometrica= new Rectangulo();
        geometrica.setNombre(this.Nombre);
        geometrica.tamaño(this.pos_x, this.pos_y);
        return geometrica;
    }
}
