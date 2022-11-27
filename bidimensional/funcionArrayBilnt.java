package bidimensional;

/** funcionArrayBilnt
 *  biblioteca de funciones para arrays bidimensionales de números entero
 *
 * @author Diego Sánchez Briales
 * Fecha de creación 26/11/2022
 */
public class funcionArrayBilnt {

    //Genera un array de tamaño n x m con números aleatorios cuyo intervalo 
    //(mínimo y máximo) se indica como parámetro.
    //
    //@param n, tamaño del array en "filas"
    //@param m, tamaño del array en "columnas"
    //@param max, maximo valor del array
    //@param min, minimo valor del array
    //@return array bidimensional aleatorio
    public static int[][] generaArrayBilnt(int n, int m, int min, int max) {
        int[][] matriz = new int[n][m];

        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                matriz[i][j] = (int)(Math.random()*(max-min)+min+1);
            }
        }
        return matriz;
    }

    //Devuelve la fila i-ésima del array que se pasa como parámetro.
    //
    //@param x, matriz
    //@param n, fila 
    //@return fila i-esima del array "x"
    public static int[] filaDeArrayBiInt(int[][] x, int n) {
        int[] array = new int [x.length];
        for (int i=0; i<x.length; i++) {
            if(i==n){
                for (int j=0; j<x[i].length; j++) {
                    array[j]=x[i][j];
                }
            }
            for (int j=0; j<x[i].length; j++) {
            }
        }
        return array;
    }

    //Devuelve la columna j-ésima del array que se pasa como parámetro.
    //
    //@param x, matriz
    //@param n, columna
    //@return columna j-esima del array "x"
    public static int columnaDeArrayBiInt(int[][] x, int n) {
        int[] array = new int [x.length];
        int contador=0;
        for (int i = 0; i < array.length; i++) {
            contador++;
        }
        return contador;
        for (int i=0; i<x.length; i++) {
            a=x[i];
            if(a==n){
                for (int j=0; j<x.length; j++) {
                    array[j]=x[i][j];
                }
            }
            for (int j=0; j<x[i].length; j++) {
            }
        }
    }
}
