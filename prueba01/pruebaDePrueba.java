package prueba01;
import java.util.Arrays;
import java.util.Random; 
public class pruebaDePrueba {
    public static void main(String[] args) {

        int filas = 0;
        int columnas = 0;
        int max = 0;
        int min = 0;

    
        do{
            System.out.println("Por favor, introduzca el nº de filas: ");
            filas = Integer.parseInt(System.console().readLine());
        } while (filas<1);
        do{
            System.out.println("Ahora, el nº de columnas: ");
            columnas = Integer.parseInt(System.console().readLine());
        } while (columnas<1);
    
        int tamaño = filas*columnas;
        while ((max-min)<tamaño){
                System.out.println("Introduzca el extremo inferior del intervalo aleatorio: ");
                min = Integer.parseInt(System.console().readLine());
                System.out.println("Introduzca el extremo superior del intervalo aleatorio: ");
                max = Integer.parseInt(System.console().readLine());
        } 
        int recarga=0;
        Random aleatorio = new Random();
        int[][] matriz = new int [filas][columnas];

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                recarga = aleatorio.nextInt((max + 1 -min)+min);
                if(pruebaDePrueba.valorRepetido(matriz, recarga)==true) {
                    do{
                    recarga = aleatorio.nextInt((max + 1 -min)+min);
                    }while(pruebaDePrueba.valorRepetido(matriz, recarga)==true);
                    matriz[i][j] = recarga;
                }else{
                    matriz[i][j]=recarga;
                }
            }
        }
        System.out.println(Arrays.deepToString(matriz));
    }
    
    public static boolean valorRepetido(int[][] matriz, int valor) {
        boolean repetido = false;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length && !repetido; j++) {
                    if (matriz[i][j] == valor) {
                        repetido = true;
                    }
                }
            }
            return repetido;
    } 
}

