public class Ejercicio2 {
    public static void main(String[] args) {
        String frase;
        int[] contadorLetras = new int[255];
        int fraseLength;

        frase = System.console().readLine("Introduzca una frase: ");
        frase = frase.toLowerCase();
        fraseLength = frase.length();
        for (int i = 0; i < fraseLength; i++) {
            contadorLetras[frase.charAt(i)]++;
        }

        for (int i = 0; i < contadorLetras.length; i++) {
            if(((i>='a' && i<='z')||(i>='A' && i<='Z')|| i==209 || i==241) && contadorLetras[i]!=0){
                System.out.println("La letra " + (char) (i) + " ha aparecido " + contadorLetras[i] + " veces.");
            }
        }
    }
}