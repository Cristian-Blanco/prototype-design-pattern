
package Figuras;

import Interface.Figuras_geometricas;//importamos de el paquete interface todo


public class Rectangulo implements Figuras_geometricas{//creamos una clase llamada rectangulo y le implementamos la interface creada anteriormente
    private String Nombre;//creamos una variable nombre de tipo string
    private int pos_x, pos_y;//Creamos dos variables de tipo entero
    
    public Rectangulo(){//metodo constructor
    }
    
    @Override//sobreescribimos el metodo
    public void setNombre(String n){//llamamos el metodo de la interface
     this.Nombre=n;   
    }
    
    @Override//sobreescribimos
    public String getNombre(){//creamos un metodo de
        return Nombre;//retrnamos el nombre al metodo
    }
     
    @Override//sobreescribimos el metodo
    public void tamaño(int x, int y){//llamamos el metodo de la interface
           pos_x = x;//asignamos valor a x segun el valor entrante
           pos_y = y;//asignamos valor a y segun el valor entrante
        
    }
    
    @Override//sobreescribimos el metodo
    public void getposicion(){//llamamos el metodo de la interface
       System.out.println("Altura del rectangulo: " + this.pos_y);//imprimimos la altura
       System.out.println("Ancho del rectangulo: " + this.pos_x); //imprimimos el ancho 
    }
    
    @Override//sobreescribimos el metodo
    public Figuras_geometricas clonar(){//llamamos el metodo de la interface
       //comenzamos a clonar
        Figuras_geometricas geometrica= new Rectangulo();//Instanciamos la clase rectangulo para geometrica
        geometrica.setNombre(this.Nombre);//a geometrica le asignamos el nombre del rectangulo y poder clonarlo
        geometrica.tamaño(this.pos_x, this.pos_y);//a geometrica le asignamos el tamaño del rectangulo y poder clonarlo
        return geometrica;//retornamos gometrica
    }
}
