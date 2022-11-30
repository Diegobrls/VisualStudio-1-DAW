package Ejercicio4P;
public class Ejercicio4 {
    // Escribe un programa que genere un “rectángulo de triángulos rectángulos”. Los triángulos tienen 4
    // asteriscos de base y de altura. El ancho y el alto del rectángulo se recogerá interactivamente, y vendrán
    // expresados en “nº de triángulos”. Obsérvese que los triángulos no se tocan.
    public static void main(String[] args) {
        int triangulo = 4;
        System.out.println("nº triangulos base "); 
        int base = Integer.parseInt(System.console().readLine());
        System.out.println("nº de triangulos altura ");
        int altura = Integer.parseInt(System.console().readLine());

        for (int x=0; x<altura; x++) {
            for (int i=0; i<triangulo; i++) {
                for (int y=0; y<base ; y++) {
                    for(int j=0; j<triangulo; j++) {
                        if (j>=triangulo-1-i) {
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }System.out.print(" ");
                }System.out.println();
            }System.out.println();
        }
    }
}


