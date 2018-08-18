import java.util.*; 
/**
 * Este programa calcula la desviación estándar de un arreglo de números de tamaño escogido por el usurio. 
 * 
 * Datos de entrada: 
 * - Cantidad de datos (tamaño).
 * - Números. 
 * 
 * Datos de salida: 
 * - Desviación estándar. (d_estandar).
 * 
 * @author Bafen Ricardo Barragán Sánchez. 
 */
public class DesviacioEstandar
{
    public static void main(String[] args){
        int tamaño;
        double d_estandar, suma = 0, promedio = 0, suma2 = 0; 
                
        Scanner teclado = new Scanner(System.in); 
        
        //Solicitar la cantidad de números que se van a digitar.
        
       System.out.println("Desviación estándar de un conjunto de números.");
       
       System.out.print("\n¿Cuántos números desea utilizar? "); 
       tamaño = teclado.nextInt();
       
       System.out.print("\n");
       
       double[] numeros = new double[tamaño];
       
       //Solicitar los numeros 
       System.out.println("Para digitar los números, por favor use la coma de su teclado (,).\n");
       
       for ( int i = 0; i < numeros.length; i++)
        {    System.out.print("Ingrese el " + (i+1) + " número: ");
            numeros[i] = teclado.nextDouble(); 
        }
              
        //Hallar el promedio de los números
        for(int i = 0; i < numeros.length; i++)
        suma = suma + numeros[i];
        
        promedio = suma / numeros.length; 
        
        //Calcular la sumatoria de (X(i)-Promedio)^2 -> suma2        
        for (int i = 0; i < numeros.length; i++)
        suma2 = suma2 + ((numeros[i] - promedio) * (numeros[i] - promedio));
        
        //Calcular desviación estándar
        double n = (numeros.length - 1);
        
        d_estandar = Math.sqrt(((1/(n)) * suma2));
        
        //Mostrar datos
        System.out.println("\nLa desviación estándar de su conjunto de números es:\n" + d_estandar);       
    }
}
