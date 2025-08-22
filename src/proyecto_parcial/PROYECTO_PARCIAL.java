package proyecto_parcial;

/**
 *
 * @author Arnold Patu
 */
import java.util.Scanner;
public class PROYECTO_PARCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        String empleado;
        double ht,th,sb,d,sn;
        //creando las lecturas
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Nombre del empleado: ");
        empleado=lectura.next();
        System.out.print("Ingrese Horas trabajadas: ");
        ht=lectura.nextDouble();
        System.out.print("Tarifa por hora: ");
        th=lectura.nextDouble();
        //procesos
        sb=ht*th;
        d=sb*0.13;
        sn= sb-d;
        //salida
        System.out.println("El sueldo bruto de "+empleado+" es de: "+sb);
        System.out.println("El descuento aplicado es: "+d);
        System.out.println("El sueldo neto de "+empleado+" es de :"+sn);
        
    }
    
}
