package arrays;
import java.util.*;
public class pruebaFuncionArray {

    public static void main(String[] args) {
        
        int x = 2;
        int y = 30;
        int n = 50;
        int z = 25;

        System.out.println(Arrays.toString(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("El máximo del array es: " + funcionArray.maximoArrayInt(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("El mínimo del array es: " + funcionArray.minimoArrayInt(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("La media del array es: " + funcionArray.mediaArrayInt(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("Coprobación de si el numero " + z + " está en el array: " + funcionArray.estaEnArrayInt((funcionArray.generaArrayInt(n, x, y)),(z)));
        System.out.println("El numero " + z + " está en la posicion " + funcionArray.posicionEnArray((funcionArray.generaArrayInt(n, x, y)),(z)) + " del array");



    }
}
