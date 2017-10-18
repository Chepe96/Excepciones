/**
 * Created by Alumnos on 12/10/2017.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class EjemploExcepciones
{
    public static void main(String[] args) /*throws FileNotFoundException*/
    {
        try
        {
            File archivo = new File("entrada.txt");
            Scanner teclado = new Scanner(archivo);
            System.out.println("Dame el primer numero: ");
            int num1 = teclado.nextInt();
            System.out.println("Dame el segundo numero: ");
            int num2 = teclado.nextInt();
            System.out.print("La division es: " + num1/num2);
        }
        catch(ArithmeticException excepcionAritmetica)
        {
            System.out.println("Division por cero");
        }
        catch (InputMismatchException excepcionEntrada)
        {
            System.out.println("Entrada incorrecta");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("No existe el archivo");
        }
    }
}
