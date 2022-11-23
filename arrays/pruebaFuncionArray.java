package arrays;
import java.util.*;
public class pruebaFuncionArray {

    public static void main(String[] args) {
        
        int x = 2;
        int y = 10;
        int n = 10;
        int z = 9;
        int array[] = {1,2,9,5,3,4,0,2,8,5};

        System.out.println(Arrays.toString(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("El máximo del array es: " + funcionArray.maximoArrayInt(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("El mínimo del array es: " + funcionArray.minimoArrayInt(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("La media del array es: " + funcionArray.mediaArrayInt(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("Coprobación de si el numero " + z + " está en el array: " + funcionArray.estaEnArrayInt(array, z));
        System.out.println("El numero " + z + " está en la posicion " + funcionArray.posicionEnArray(array,z) + " del array");
        System.out.println("El array dado la vuelta es: " + (Arrays.toString(funcionArray.volteaArrayInt(array))));     
    }
}
