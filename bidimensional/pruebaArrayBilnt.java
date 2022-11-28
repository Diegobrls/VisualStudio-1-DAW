package bidimensional;

import java.util.Arrays;

public class pruebaArrayBilnt{
    public static void main(String[] args) {

        int n = 3;
        int m = 5;
        int max = 50;
        int min = 5;
        int pos = 2;
        int [][] matriz={{9,8,5,8,4},
                        {1,3,4,5,2},
                        {5,6,7,7,6},
                        {4,7,8,8,1},
                        {5,7,8,9,3}};

        System.out.println("Matriz generada aletoriamente: ");
        System.out.println(Arrays.deepToString(funcionArrayBilnt.generaArrayBilnt(n, m, min, max))); ;

        System.out.println("Fila numero " + n + " de la matriz: ");
        System.out.println(Arrays.toString(funcionArrayBilnt.filaDeArrayBiInt(matriz, n)));

        System.out.println();

        System.out.println("columna numero " + n + " de la matriz: ");
        System.out.println(Arrays.toString(funcionArrayBilnt.columnaDeArrayBiInt(matriz, n)));

        System.out.println("El numero " + n + " se encuentra en la posición: ");
        System.out.println(Arrays.toString(funcionArrayBilnt.coordenadasEnArrayBiInt(matriz, pos)));

        System.out.println("¿Es el numero " + pos + " punto de silla? ");
        System.out.println(funcionArrayBilnt.esPuntoDeSilla(matriz, pos)); 
    }
}