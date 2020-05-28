
package practica_prototype;

/**
 *
 * @author jorge malaver
 */
import Figuras.*;
import java.util.Scanner;
import Interface.Figuras_geometricas;

public class Practica_Prototype {


    public static void main(String[] args) {

        
        int op, posx, posy;
        Scanner sc= new Scanner(System.in);
        
        Rectangulo rectangulo= new Rectangulo();
        Circulo circulo = new Circulo();
        
        Figuras_geometricas geometrica = null;
        
        
        System.out.println("  Escoja la figura que desea clonar  ");
        System.out.println("______________________________________");
        System.out.println(" 1. Rectangulo");
        System.out.println(" 2. Circulo");
        System.out.println("______________________________________");
        System.out.print("Por favor seleccione: ");
        op=sc.nextInt();
        System.out.println("\n");
        
        switch(op){
            case 1:
                rectangulo.setNombre("Rectangulo");
                rectangulo.tamaño(18, 25);
                geometrica = rectangulo.clonar();
                //Clonando el rectangulo
                geometrica.setNombre(geometrica.getNombre() + " Figura Clonada");
                System.out.println("      Clonando Figura");
                System.out.println("_____________________________");
                System.out.print("Digite el nuevo alto: ");
                posx=sc.nextInt();
                System.out.print("Digite el nuevo ancho: ");
                posy=sc.nextInt();
                System.out.println("______________________________\n\n");
                geometrica.tamaño(posx, posy);
                
                clonado(geometrica);
                
                // figura original
                System.out.println("               ORIGINAL          ");
                System.out.println("_____________________________________");
                System.out.println("Figura Geometrica : " + rectangulo.getNombre());
                System.out.println("_____________________________________");
                System.out.println("            TAMAÑO ORIGINAL");
                rectangulo.getposicion();
                System.out.println("_____________________________________");
                break;
                
            case 2:
                circulo.setNombre("Circulo");
                circulo.tamaño(5, 5);
                geometrica = circulo.clonar();
                
                //Clonando el circulo
                geometrica.setNombre(geometrica.getNombre() + " Figura Clonada");
                System.out.println("      Clonando Figura");
                System.out.println("_____________________________");
                System.out.print("Digite el nuevo Radio: ");
                posx=sc.nextInt();
                System.out.println("______________________________\n\n");
                geometrica.tamaño(posx, posx);
                
                clonado(geometrica);
                
                // figura original
                System.out.println("              ORIGINAL");
                System.out.println("_____________________________________");
                System.out.println("Figura Geometrica: " + circulo.getNombre());
                System.out.println("_____________________________________");
                System.out.println("          TAMAÑO ORIGINAL");
                circulo.getposicion();
                System.out.println("_____________________________________");
                break;
               
            default:
                System.out.println("Has seleccionado un numero no valido");
                break;
                
        }
       
    }
    
    
    
    public static void clonado(Figuras_geometricas geometrica){
        System.out.println("   ESTA ES LA FIGURA CLONADA   ");
        System.out.println("Figura geometrica: "+geometrica.getNombre());
        System.out.println("\n      Esta es la posicion");
        geometrica.getposicion();
        System.out.println("____________________________________________\n\n");
    }
    
}
