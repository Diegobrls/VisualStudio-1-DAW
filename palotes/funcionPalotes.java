/** ejercicioPalotes
 * 
 * Esta función convierte el número n al sistema de palotes y lo devuelve
 * en una cadena de caracteres. Por ejemplo, el 470213 en decimal es el
 * | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes.
 * Utiliza esta función en un programa
 * 
 * @author Diego Sánchez Briales
 *         Fecha de creación 14/11/2022
 *         7623
 */
public class funcionPalotes {
    public static void main(String[] args) {

        int conversion = 12345; //El programa admite solamente numeros naturales
        System.out.println(convierteEnPalotes(conversion));
    }

    public static String convierteEnPalotes(int n) {

        int n2 = 0;
        int contar = 0;
        int longitud = (int) Math.log10(n); // largo del numero
        longitud++;
        int contar2 = longitud;
        int[] array = new int[longitud]; // array numerico

        for (int i = 0; i < longitud; i++) {
            n2 = n;
            n2 = n2 / (int)Math.pow(10, (contar2-1));
            n2 = voltea(n2);
            n2 = n2 / (int)Math.pow(10, contar);
            array[i] = n2;
            contar++;
            contar2--;
        }

        String cadenaArray[] = {"", "|", "||", "|||", "||||", "|||||", "||||||","|||||||", "||||||||", "|||||||||"};
        String resultado="";
        for(int i=0; i<longitud ; i++) {
            resultado+=cadenaArray[array[i]];

            if(i!=(longitud-1)){
                resultado+="-";
            }
        }
        return resultado;
    
    }

    public static int voltea(int x) {
        /**
         * Le da la vuelta a un número
         * 
         */
        int num, volteado = 0, resto;

        num = x;

        while (num > 0) {
            resto = num % 10;
            volteado = volteado * 10 + resto;
            num /= 10;
        }
        return volteado;
    }
}
