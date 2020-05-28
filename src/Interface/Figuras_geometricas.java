
package Interface;

/**
 *
 * @author jorge malaver
 */
public interface Figuras_geometricas {//Creamos una interface donde estaran ubicados todos los metodos de las figuras
    
    public void setNombre(String n);//creamos un metodo set llamado setNombre de tipo void que le entrara una variable "n" de tipo string
    public String getNombre();//creamos un get de tipo String para el nombre
    public void tamaño(int x, int y);//creamos un metodo de tipo void donde le entraran dos variables
    public void getposicion();//creamos un metodo de tipo void
    public Figuras_geometricas clonar();//creamos un metodo clonar con tipo de interface
}
