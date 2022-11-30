import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    String[] lista = {"x", "x", "x", "x", "x"};
    String palabra = lista[(int)(Math.random() * 5)];
    boolean[] usados = new boolean[palabra.length()];
    Arrays.fill(usados, false);

    String desorden = "", intento;

    do {
      int n = (int)(Math.random() * palabra.length());
        if(!usados[n]){
        desorden += palabra.charAt(n);
        usados[n] = true;
    }
    } while(desorden.length() < palabra.length());
    
    for(int i = 5; i > 0; i--){
        System.out.printf("Tiene %d intentos. Diga palabra con las letras '%s': ", i, desorden);
        intento = s.nextLine();
        if(intento.equals(palabra)){
        System.out.println("Felicidades. Ha acertado la palabra.");
        i = 0;
    }
        if(i == 1){
        System.out.printf("La palabra que tenía que acertar es: '%s'", palabra);
        }
    }

    s.close();
    }
}