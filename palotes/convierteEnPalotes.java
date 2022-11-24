package palotes;
/**
 * ejercicioPalotes
 * 
 * Esta función convierte el número n al sistema de palotes y lo devuelve 
 * en una cadena de caracteres. Por ejemplo, el 470213 en decimal es el 
 * | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes. 
 * Utiliza esta función en un programa
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación 14/11/2022
 * 7623
 */
public class convierteEnPalotes {
    public static void main(String[] args) {

        int n = 7623;
        int longitud = (int)Math.log10(n); //largo del numero
        String cadena = String.valueOf(n); //se convierte el numero en cadena
        int[] array = new int[longitud]; //array numerico
        int contador=0;
        int digitos;
        String cadenaArray[] = {"", "|", "||", "|||", "||||", "|||||", "||||||", "|||||||", "||||||||", "|||||||||"};
        
        for(int j=0; j<longitud; j++){ 
            array[contador] = Integer.parseInt(cadena[j]) - 48; 
            contador++;
        }
        for(int i=0; i<longitud; i++){
            System.out.print(cadenaArray[i]+" - "); //imprime el array palote
        }
    /* ;


        

        for(int i=0; i<longitud; i++) {
            System.out.print(cadenaArray[array[i]] + "");
        }*/
    }
}
