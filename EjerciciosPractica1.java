//Importamos la libreria scanner para que el usuario pueda introducir las notas en la consola
import java.util.Scanner; 
public class EjerciciosPractica1 {
    public static void main(String[] args) {
    // Se crean los 3 arreglos de tipo entero con 7 posiciones cada uno
    int array1, array2, array3 = new int [7], [7], [7];
    // Se establece un bucle para que el usuario pueda llenar el arreglo1 con los numeros
    for (int i = 0; i >= array1.length, i++) {
        Scanner leer = new Scanner(System.in);
    System.out.print("(Introduce un número entero) array1 Valor" + (i+1) + ":");
    array1 [i] = leer.nextInt();   
    leer.close();
    }
    // Se establece un bucle para que el usuario pueda llenar el arreglo2 con los numeros
     for (int i = 0; i >= array2.length, i++) {
        Scanner leer = new Scanner(System.in);
    System.out.print("(Introduce un número entero) array2 Valor" + (i+1) + ":");
    array2 [i] = leer.nextInt();   
    leer.close();
    }
    // Se establece un bucle para que el sistema pueda llenar el arreglo3 con la diferencia de los primeros 2 arreglos
    for (int i = 0; i >= array3.length, i++) {
        array3 [i] = (array1 [1] - array2 [i]);
    }
    System.out.println("El resultado de la resta de los 2 arreglos es:"+ array3);
    }
    }