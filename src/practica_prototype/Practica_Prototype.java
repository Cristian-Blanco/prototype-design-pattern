
package practica_prototype;

/**
 *
 * @author jorge malaver
 */
import Figuras.*;//importamos todo de figuras
import java.util.Scanner;//importamos el escaner para obtener los datos del usuario
import Interface.Figuras_geometricas;//importamos la interface

public class Practica_Prototype {//creamos la clase main


    public static void main(String[] args) {//creamos el main

        
        int op, posx, posy;//creamos tres variables de tipo int
        Scanner sc= new Scanner(System.in);//instanciamos el escaner para utilizarlo
        
        Rectangulo rectangulo= new Rectangulo();//instanciamos el rectangulo
        Circulo circulo = new Circulo();//instanciamos el circulo
        
        Figuras_geometricas geometrica = null;//le asignamos a figuras geometricas como valor igual a nulo
        
        
        System.out.println("  Escoja la figura que desea clonar  ");//imprimimos texto
        System.out.println("______________________________________");//imprimimos texto
        System.out.println(" 1. Rectangulo");//imprimimos texto
        System.out.println(" 2. Circulo");//imprimimos texto
        System.out.println("______________________________________");//imprimimos texto
        System.out.print("Por favor seleccione: ");//imprimimos texto
        op=sc.nextInt();//obtenemos un dato por el usuario, en este caso para la variable op
        System.out.println("\n");//imprimimos texto
        
        switch(op){//generamos un switch case
            case 1://si es caso 1
                rectangulo.setNombre("Rectangulo");//seteamos el setnombre del rectangulo con valor = rectangulo
                rectangulo.tamaño(18, 25);//le asignamos a rectangulo valores
                geometrica = rectangulo.clonar();//clonamos a rectangulo con geometrica
                //Clonando el rectangulo
                geometrica.setNombre(geometrica.getNombre() + " Figura Clonada");//imprimimos texto
                System.out.println("      Clonando Figura");//imprimimos texto
                System.out.println("_____________________________");//imprimimos texto
                System.out.print("Digite el nuevo alto: ");//imprimimos texto
                posx=sc.nextInt();//solicitamos un dato
                System.out.print("Digite el nuevo ancho: ");//imprimimos texto
                posy=sc.nextInt();//solicitamos un dato
                System.out.println("______________________________\n\n");//imprimimos texto
                geometrica.tamaño(posy, posx);//mandamos los datos recolectados a geometrica, NO A RECTANGULO
                
                clonado(geometrica);//llamamos la funcion
                
                // figura original
                System.out.println("               ORIGINAL          ");//IMPRIMOS TEXTO
                System.out.println("_____________________________________");//imprimimos texto
                System.out.println("Figura Geometrica : " + rectangulo.getNombre());//imprimimos texto
                System.out.println("_____________________________________");//imprimimos texto
                System.out.println("            TAMAÑO ORIGINAL");//imprimimos texto
                rectangulo.getposicion();//imprimimos el verdadero tamaño del rectangulo porque ya no estamos llamando a geometrica
                System.out.println("_____________________________________");//imprimimos texto
                break;//ROMPEMOS
                
            case 2://si es dos
                circulo.setNombre("Circulo");//al circulo le asignamos nombre de circulo
                circulo.tamaño(5, 5);//le asignamos su radio
                geometrica = circulo.clonar();//clonamos el circulo
                
                //Clonando el circulo
                geometrica.setNombre(geometrica.getNombre() + " Figura Clonada");//imprimimos texto
                System.out.println("      Clonando Figura");//imprimimos texto
                System.out.println("_____________________________");//imprimimos texto
                System.out.print("Digite el nuevo Radio: ");//imprimimos texto
                posx=sc.nextInt();//le asignamos el radio al circulo
                System.out.println("______________________________\n\n");//imprimimos texto
                geometrica.tamaño(posx, posx);//mandamos a geometrica el nuevo radio del circulo
                
                clonado(geometrica);//llamamos la funcion de clonado
                
                // figura original
                System.out.println("              ORIGINAL");//imprimimos texto
                System.out.println("_____________________________________");//imprimimos texto
                System.out.println("Figura Geometrica: " + circulo.getNombre());//imprimimos texto
                System.out.println("_____________________________________");//imprimimos texto
                System.out.println("          TAMAÑO ORIGINAL");//imprimimos texto
                circulo.getposicion();//imprimimos el verdadero radio del circulo
                System.out.println("_____________________________________");//imprimimos texto
                break;
               
            default:
                System.out.println("Has seleccionado un numero no valido");//imprimimos texto
                break;
                
        }
       
    }
    
    
    
    public static void clonado(Figuras_geometricas geometrica){//creamos una funcion que de entrada tiene como parametro una variable geometrica de tipo figuras_geometricas
        System.out.println("   ESTA ES LA FIGURA CLONADA   ");//imprimimos texto
        System.out.println("Figura geometrica: "+geometrica.getNombre());//imprimimos texto
        System.out.println("\n      Esta es la posicion");//imprimimos texto
        geometrica.getposicion();//imprimimos la nueva posicion asignada a geometrica, que es distinta al RECTANGULO
        System.out.println("____________________________________________\n\n");//imprimimos texto
    }
    
}
