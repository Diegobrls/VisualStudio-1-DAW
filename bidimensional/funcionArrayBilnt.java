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
    public static int[] columnaDeArrayBiInt(int[][] x, int n) {

        int longitud = 0;
        for (int i=0; i<x.length-1; i++) {
            for (int j=0; j<x[i].length-1; j++) {
                longitud=j; //halla la longitud de las columnas
            } 
        }
                int [] array = new int [longitud+2];

        for (int i=0; i<x[0].length; i++ ) {
            for (int j=0; j <x.length; j++) {
                array[j]=x[j][n];
            }
        }
        return array; 
    }

    // Devuelve la fila y la columna (en un array
    // con dos elementos) de la primera ocurrencia de un número dentro de un
    // array bidimensional. Si el número no se encuentra en el array, la función
    // devuelve el array {-1, -1}.
    //
    // @param x, matriz
    // @param n, numero entero
    // @return array con la fila y la columna correspondiente a la posicion del numero "n"
    // en la matriz "x"
    public static int [] coordenadasEnArrayBiInt(int [][] x, int n) {
        int array[]= new int [2]; //aqui se almacenarán la fila y la columna

        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                if (x[i][j]==n){
                    array[0]=i;
                    array[1]=j;
                }
            }
        }
        return array;
    }

    // Dice si un número es o no punto de silla, es decir, mínimo en su fila y 
    // máximo en su columna.
    //
    // @param x, matriz
    // @param n, numero entero
    // @return confirma si el numero es punto de silla
    public static boolean esPuntoDeSilla(int[][] x, int n) {
        int[] fila = filaDeArrayBiInt(x, n); //NO PILLA LAS FILAS
        int[] columna = columnaDeArrayBiInt(x, n); //NO PILLA LAS COLUMNAS
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int y : fila) {
            if (y < min) {
                min = y;
            }
        }
        return min;
        for (int z : columna) {
            if (z > max) {
                max = z;
            }
        }
        
        if ((n==max)&&(n==min)){
            return true;
        } else {
            return false;
        }
    }
}
