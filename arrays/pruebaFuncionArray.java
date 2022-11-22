package arrays;
import java.util.*;
public class pruebaFuncionArray {

    public static void main(String[] args) {
        
        int x = 2;
        int y = 30;
        int n = 50;

        System.out.println(Arrays.toString(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("El máximo del array es: " + funcionArray.maximoArrayInt(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("El mínimo del array es: " + funcionArray.minimoArrayInt(funcionArray.generaArrayInt(n, x, y)));
        System.out.println("La media del array es: " + funcionArray.mediaArrayInt(funcionArray.generaArrayInt(n, x, y)));


    }
}
