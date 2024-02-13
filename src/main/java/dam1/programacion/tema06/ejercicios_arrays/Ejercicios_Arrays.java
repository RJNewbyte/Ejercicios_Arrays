package dam1.programacion.tema06.ejercicios_arrays;

import static dam1.programacion.tema06.ejercicios_arrays.Ejercicios_Arrays.utils.kbd;
import java.util.Scanner;

/**
 *
 * @author RJNewbyte
 */
public class Ejercicios_Arrays {

    public static class utils {

        private static final Scanner entradaTeclado = new Scanner(System.in);

        public static Scanner kbd() {
            return entradaTeclado;
        }
    }

    public static void main(String[] args) {
        /**
         * 1. Se generan 20 números aleatorios de tipo entero y se almacenan en
         * un vector. Hay que calcular y mostrar la media y, además, mostrar
         * cuántos números hay:
         * <pre>
         * - Superiores a la media
         * - Inferiores a la media
         * - Iguales a la media</pre>
         */
        System.out.println("----Ejercicio 01----");

        /**
         * 2. Crear dos vectores de dimensión 10 con números enteros aleatorios
         * entre 1 y 10. Posteriormente construir un tercer vector, e
         * imprimirlo, cuyos componentes sean la suma de los dos anteriores.
         */
        System.out.println("\n----Ejercicio 02----");

        /**
         * 3. Leer un vector de 10 componentes y calcular el más grande y el más
         * pequeño de ellos y los lugares donde se encuentran.
         */
        System.out.println("\n----Ejercicio 03----");

        /**
         * 3.1 Generar dos vectores de dimensión 10 (dar valores aleatorios
         * entre 1 y 5)
         *
         * - comprobar para cada uno de los elementos del primer vector cuántas
         * veces está en el segundo
         * <pre>
         * ejemplo para un vector de 3 elementos:
         *                                       primero vector : 3,7,2
         *                                       segundo vector: 3,3,5
         *
         * el resultado debe ser:
         *                       elemento 1: 2 veces
         *                       elemento 2: 0 veces
         *                       elemento 3: 0 veces
         * </pre>
         */
        System.out.println("\n----Ejercicio 03.1----");

        /**
         * 4. Generar una matriz de 4 filas y 5 columnas con números aleatorios
         * entre 1 y 100, e imprimirla.
         */
        System.out.println("\n----Ejercicio 04----");

        /**
         * 5. Generar una matriz de 10x10 y hallar e imprimir la suma de cada
         * una de sus filas y de cada una de sus columnas.
         */
        System.out.println("\n----Ejercicio 05----");

        /**
         * 6. Generar una matriz de 5x5 (numérica entera) e imprimir el valor
         * más grande y el más pequeño y los lugares donde se encuentran (índice
         * i e índice j).
         */
        System.out.println("\n----Ejercicio 06----");

        /**
         * 7. Generar una matriz de 5x5 numérica entera, a continuación pedir
         * dos números de fila, que se deben filtrar entre 1 y 5 e intercambiar
         * ambas filas. Presentar las matrices antes y después del cambio.
         */
        System.out.println("\n----Ejercicio 07----");

        /**
         * 8.
         * <pre>Queremos almacenar las notas (podrán serán número decimales) de 10
         * alumnos/as para cada una de las 5 asignaturas que deben de cursar.
         *
         * Para ello hemos decidido emplear una matriz de 10 filas (una para
         * cada alumno/a) y 5 columnas (una para cada asignatura).
         *
         * Se debe de crear la matriz del tamaño adecuado con valores iniciales de 0.
         * 
         * Posteriormente se irá pidiendo al usuario por teclado que nota quiere
         * actualizar y de qué alumno.
         * 
         * Es decir:
         *
         * Indícame el alumno (1-10): 5;
         * Indícame la asignatura (1-5): 3;
         * Indícame la nota: 5,6
         * 
         * Se deberá guardar en la fila y la columna correspondiente la nota 5,6.
         * Después de cada cambio se imprimirá por pantalla la matriz completa.</pre>
         */
        System.out.println("\n----Ejercicio 08----");

    }
}
