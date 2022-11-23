package arrays;
/**
 * 
 * funcionesArray
 * 
 * Crea una biblioteca de funciones para arrays (de una dimensión) 
 * de números enteros que contenga las siguientes funciones
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación 17/11/2022
 */

public class funcionArray {

    //Genera un array de tamaño n con números aleatorios cuyo intervalo 
    //(mínimo y máximo) se indica como parámetro.
    //
    //@param n, tamaño del array
    //@param x, minimo numero aleatorio
    //@param y, maximo numero aleatorio
    //@return array de tamaño n y numeros aletorios
    public static int[] generaArrayInt(int n, int x, int y) {
        int[] array = new int[n];
        for (int i=0; i < n; i++) {
            array[i]=(x-1) + (int)((Math.random()*((y - x)+1)+1)); //resto uno al punto de partida para que esté incluido el minimo,
            // y luego sumo 2 para que entre el máximo
        }
        return array;
    }

    //Devuelve el mínimo del array que se pasa como parámetro.
    //
    //@param x, array del que se averigua el minimo
    //@return el minimo del array

    public static int minimoArrayInt(int[] x) {
        
        int minimo = Integer.MAX_VALUE;
    
        for (int n : x) {
            if (n < minimo) {
                minimo = n;
            }
        }
        return minimo;
    }

    // Devuelve el máximo del array que se pasa como parámetro.
    //
    //@param x, array
    //@return maximo del array

    public static int maximoArrayInt(int[] x) {
        
        int maximo = Integer.MIN_VALUE;
        
        for (int n : x) {
            if (n > maximo) {
            maximo = n;
            }
        }
    
        return maximo;
    }

    //Devuelve la media del array que se pasa como parámetro
    //
    //@param x, array
    //@return la media del array

    public static int mediaArrayInt(int[] x) {

        int arrayTamaño = 0;
        int suma = 0;

        for (int n : x) {
            arrayTamaño ++;
            suma=suma+n;
        }

        int total = suma /arrayTamaño;
        return total;
    }

    //Dice si un número está o no dentro de un array
    //
    //@param x, array
    //@param y, numero que se quiere confirmar
    //@return verdadero o falso

    public static boolean estaEnArrayInt(int[] x, int y) {

        for (int n : x) {
            if (n == y) {
                return true;
            }
        }
        return false;
    }

    //Busca un número en un array y devuelve la posición (el índice) en la que se encuentra
    //
    //@param x, array
    //@param y, numero a buscar
    //@return posicion del numero "y"

    public static int posicionEnArray(int[] x, int y) {

        int contador=0;
        while(contador<x.length) {
            if(x[contador]==y){
                return contador;
            }
            contador++;
        }
        return -1;
    }

    //Le da la vuelta a un array
    //
    //@param x, array
    //@return el array dado la vuelta
    public static int[] volteaArrayInt(int[] x) {
        int longitud = x.length;
        int contador = 0;
        int[] vuelta = new int[longitud];

        for(int i=longitud-1; i>0; i--) {
            vuelta[contador]=x[i];
            contador++;
        }
        return vuelta;
    }

    //Rota n posiciones a la derecha los números de un array.
    //
    //@param x, array
    //@param n, cantidad de posiciones que rota a la derecha
    //@return el array con las posiciones rotadas a la derecha
    public static int[] rotaDerechaArrayInt(int[] x, int n) {}
}

