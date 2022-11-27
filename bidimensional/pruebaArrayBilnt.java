package bidimensional;


public class pruebaArrayBilnt{
    public static void main(String[] args) {

        int n = 3;
        int m = 5;
        int max = 50;
        int min = 5;
        int [][] matriz={{4,3,5,6,3},{1,6,7,4,2},{2,6,7,4,1},{4,7,8,4,1},{5,7,8,9,3}};

        System.out.println("Matriz generada aletoriamente: ");
        int[][] matriz01 = funcionArrayBilnt.generaArrayBilnt(n, m, min, max);
        for (int i = 0; i < matriz01.length; i++) {
            for (int j = 0; j < matriz01[0].length; j++) {
                System.out.printf("%6s",(matriz01[i][j]) + "  ");
            }
            System.out.println();
        }

        System.out.println("Fila numero " + n + " de la matriz: ");
        int[] array = funcionArrayBilnt.filaDeArrayBiInt(matriz, n);
        for(int i=0; i<matriz[0].length; i++) {
            System.out.print((array[i]) + " ");
        }
        System.out.println();

        System.out.println("columna numero " + n + " de la matriz: ");
        System.out.println( funcionArrayBilnt.columnaDeArrayBiInt(matriz, n));
        for(int i=0; i<matriz[0].length; i++) {
            System.out.print((array[i]) + " ");
        }
    }
}