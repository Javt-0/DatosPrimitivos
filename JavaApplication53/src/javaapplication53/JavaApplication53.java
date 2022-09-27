
package javaapplication53;

/**
 *
 * @author jonat
 */
public class JavaApplication53 {

    /*
    Enteros:
        - byte: 8 bits (-128 a 127) Byte.MIN_VALUE
        - short: 16 bits (-32768 a 32767) Short.MIN_VALUE - short.MAX_VALUE
        - int: 32 bits Integer.MIN_VALUE | Integer.MAX_VALUE
        - long: 64 bits Long.MIN_VALUE | Long.MAX_VALUE
    
    Decimales: 
        - float: 32 bits Float.MIN_VALUE | Float.MAX_VALUE
        - double: 64 bits Double.MIN_VALUE | Double.MAX_VALUE
    
    Caracteres: 
        - char: 
    */
    public static void main(String[] args) {
        System.out.println("\t****** NUMEROS ENTEROS ******");
        Byte enteroByte = 5;
        System.out.println("\nNumero entero byte: " + enteroByte);
        System.out.println("Valor min del tipo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor max del tipo byte: " + Byte.MAX_VALUE);
        
        Short enteroShort = 100;
        System.out.println("\nNumero entero short: " + enteroShort);
        System.out.println("Valor min del tipo short: " + Short.MIN_VALUE);
        System.out.println("Valor max del tipo short: " + Short.MAX_VALUE);
        
        int enteroInt = 10000;
        System.out.println("\nNumero entero int: " + enteroInt);
        System.out.println("Valor min del tipo int: " + Integer.MIN_VALUE);
        System.out.println("Valor max del tipo int: " + Integer.MAX_VALUE);
        
        long enteroLong = 1000000;
        System.out.println("\nNumero entero long: " + enteroLong);
        System.out.println("Valor min del tipo long: " + Long.MIN_VALUE);
        System.out.println("Valor max del tipo long: " + Long.MAX_VALUE);
        
        System.out.println("\n\t****** NUMEROS DECIMALES ******");
        float decimalFloat = 100;
        System.out.println("\nNumero decimal float: " + decimalFloat/3);
        System.out.println("Valor min del tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor max del tipo float: " + Float.MAX_VALUE);
        
        double decimalDouble = 10000;
        System.out.println("\nNumero decimal double: " + decimalDouble/7);
        System.out.println("Valor min del tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor max del tipo double: " + Double.MAX_VALUE);
        
        System.out.println("\n\t****** CARACTERES ******");
        char caracter = 'f';
        System.out.println("\nCaracter de tipo char: " + caracter);
        
        System.out.println("\n\t****** CADENA DE TEXTO ******");
        String cadena = "Hola mundo";
        System.out.println("\nCadena de texto de tipo String: " + cadena + "\n");
        

    }
    
}
