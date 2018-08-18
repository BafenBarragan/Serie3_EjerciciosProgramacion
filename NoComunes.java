import java.util.*;
import javax.swing.*;
/**
 * Este programa compara dos arreglos de números y envía como resultado un arreglo nuevo con los elementos no comunes de los dos. 
 * 
 * Datos de entada: 
 * -Arreglo 1 y arreglo 2
 * 
 * Datos de salida: 
 * -Arreglo con datos no comunes. 
 * 
 * @author Bafen Ricardo Barragán Sánchez
 * 
 */
public class NoComunes
{
    public static void main (String[] args)
    {
        ArrayList <Double> listaFinal = new ArrayList <Double> (); 
        ArrayList <Double> arreglo1 = new ArrayList<Double> ();
        ArrayList <Double> arreglo2 = new ArrayList <Double> (); 
        
                
        Scanner teclado = new Scanner(System.in);
        
        //Solicitar datos de entrada
        System.out.println("Elementos no comunes en dos arreglos de números.\n"); 
          
        int i = 0; 
        char seguir = 'y'; 
        System.out.print("Agregue el primer número para el conjunto 1: ");
        arreglo1.add (i, teclado.nextDouble());
        
        System.out.print("¿Desea añadir otro número? Y/N ");
         seguir = teclado.next().charAt(0);
        while (seguir == 'y' || seguir == 'Y'){
            i ++;
            System.out.print("Agregue el " + (i + 1) + " número para el conjunto 1: ");
            arreglo1.add (i, teclado.nextDouble());
            System.out.print("¿Desea añadir otro número? Y/N ");
            seguir = teclado.next().charAt(0);
        }
        
        i = 0; 
        System.out.print("\n\nAgregue el primer número para el conjunto 2: ");
        arreglo2.add (i, teclado.nextDouble());
        
        char seguir2 = 'y';
        
        System.out.print("¿Desea añadir otro número? Y/N ");
         seguir2 = teclado.next().charAt(0);
        
        while (seguir2 == 'y' || seguir2 == 'Y'){
            i++;
            System.out.print("Agregue el " + (i+1)  + " número para el conjunto 2: ");
            arreglo2.add (i, teclado.nextDouble()); 
            System.out.print("¿Desea añadir otro número? Y/N ");
            seguir2 = teclado.next().charAt(0);
        }
        
        //Calcular datos 
        
        for (i = 0 ; i < arreglo1.size() ; i++){
            double numero = arreglo1.get(i);
            if (arreglo2.contains(numero) == false){
                    listaFinal.add(numero);
            }
            else{
                    continue;
            }
        }
        
        for (i = 0 ; i < arreglo2.size() ; i++){
            double numero = arreglo2.get(i);
            if (arreglo1.contains(numero) == false){
                    listaFinal.add(numero);
            }
            else{
                    continue;
            }
        }
        
        //Mostrar datos 
                
        JOptionPane.showMessageDialog (null, "Conjunto #1: " + arreglo1 + "\n\nConjunto #2: " + arreglo2+ 
        "\n\nConjunto de no comunes: "+ listaFinal);
        
       
            
        
    }

}
