package dam1.programacion.tema06.ejercicios_arrays;

import static dam1.programacion.tema06.ejercicios_arrays.Ejercicios_Arrays.utils.kbd;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

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
    private static final Random rnd = new Random();

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
        int[] primerArray = new int[20];
        double media;
        int suma = 0;
        int superiores = 0;
        int inferiores = 0;
        int iguales = 0;

        for (int i = 0; i < primerArray.length; i++) {
            int aleatorio = rnd.nextInt(1000);
            primerArray[i] = aleatorio;
            suma += primerArray[i];
        }
        media = (double) suma / primerArray.length;

        for (int i : primerArray) {
            if (i > media) {
                superiores++;
            } else if (i < media) {
                inferiores++;
            } else {
                iguales++;
            }

        }

        for (int num : primerArray) {
            System.out.println(num);
        }

        System.out.println("\nLa suma de los numeros es: " + suma);
        System.out.println("La media de estos numeros es: " + media);
        System.out.println("Hay " + superiores + " números superiores a la media.");
        System.out.println("Hay " + inferiores + " números inferiores a la media.");
        System.out.println("Hay " + iguales + " números iguales a la media.");

        /**
         * 2. Crear dos vectores de dimensión 10 con números enteros aleatorios
         * entre 1 y 10. Posteriormente construir un tercer vector, e
         * imprimirlo, cuyos componentes sean la suma de los dos anteriores.
         */
        System.out.println("\n----Ejercicio 02----");
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        int[] vector3 = new int[10];

        for (int i = 0; i < 10; i++) {
            vector1[i] = rnd.nextInt(1, 11);//usando clase Random
//            vector2[i] = (int)(Math.random()*10);//usando metodo estático del paquete por defecto lang
        }
        /**
         * <pre>Utiliza el método ints() de la clase Random, que devuelve un IntStream.
         * Normalmente, necesitaríamos importar java.util.stream.IntStream para trabajar con IntStreams,
         * pero en este caso, como el método ints() ya devuelve un IntStream, no necesitamos importarlo.
         * Un IntStream es un "stream de numeros enteros" o "flujo de numeros enteros".</pre>
         */
        vector2 = new Random().ints(10, 1, 10).toArray();//ints(long streamSize, int randomNumberOrigin, int randomNumberBound)

        for (int i = 0; i < 10; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
        System.out.println("V1   V2   V3");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%02d + %02d = %02d\n", vector1[i], vector2[i], vector3[i]);
        }

        /**
         * 3. Leer un vector de 10 componentes y calcular el más grande y el más
         * pequeño de ellos y los lugares donde se encuentran.
         */
        System.out.println("\n----Ejercicio 03----");
        Random maxMin = new Random();
        int[] maxMinArray = maxMin.ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(maxMinArray));
        int maxNum = maxMinArray[0];
        int minNum = maxMinArray[0];
        int maxPos = 0;
        int minPos = 0;

        for (int i = 0; i < maxMinArray.length; i++) {
            if (maxMinArray[i] > maxNum) {
                maxNum = maxMinArray[i];
                maxPos = i;
            }
            if (maxMinArray[i] < minNum) {
                minNum = maxMinArray[i];
                minPos = i;
            }
        }
        System.out.println("El valor máximo encontrado es el: " + maxNum + " y se encuentra en la posición: " + maxPos + ".");
        System.out.println("El valor mínimo encontrado es el: " + minNum + " y se encuentra en la posición: " + minPos + ".");
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
        int[] vector1cinco = rnd.ints(10, 1, 6).toArray();
        int[] vector2cinco = rnd.ints(10, 1, 6).toArray();

        System.out.println("Este es el primer vector: " + Arrays.toString(vector1cinco));
        System.out.println("Este es el segundo vector: " + Arrays.toString(vector2cinco));
        System.out.println("A continuación listamos el número de ocurrencias en el segundo"
                + "\nvector para cada elemento del primero:\n");
        int contador = 0;
        for (int i = 0; i < vector1cinco.length; i++) {

            for (int j : vector2cinco) {

                if (vector1cinco[i] == j) {
                    contador++;
                }
            }
            System.out.println("elemento " + i + " : " + contador + " veces");
            contador = 0;//limpiamos el contador

        }

        /**
         * 4. Generar una matriz de 4 filas y 5 columnas con números aleatorios
         * entre 1 y 100, e imprimirla.
         */
        System.out.println("\n----Ejercicio 04----");

        //GENERACION USANDO un bucle normal y sin Random
//        int[][] matriz5Cuatro = new int[5][4];
//
//        for (int i = 0; i < matriz5Cuatro.length; i++) {
//            for (int j = 0; j < matriz5Cuatro[i].length; j++) { //matriz5Cuatro[i].length el numero de elementos de una fila con las columnas :)
//                matriz5Cuatro[i][j] = (int) (Math.random() * 100) + 1;
//            }
//        }
        //GENERACION USANDO expresión lambda y Random
        int[][] matriz5cuatro = new int[5][];
        Arrays.setAll(matriz5cuatro, i -> rnd.ints(4, 1, 101).toArray());//la dimension en nuemro de filas ya esta definido en 5, aqui trabajamos con cada vector.

        //PRESENTACION USANDO deepToString podemos sacar una cadena con todos los elementos de la Matriz (muy feo)
        //System.out.println(Arrays.deepToString(matriz5cuatro));
        //PRESENTACION USANDO un bucle anidado con printf para mejorar el formato y la justificación
        for (int[] fila : matriz5cuatro) {
            for (int num : fila) {
                System.out.printf("%3d", num);//introduce espacios en blanco a la izquierda hatsa una longitud de 3 digitos.
            }
            System.out.println();
        }
//        //PRESENTACION USANDO Arrays.toString en un bucle for-each conseguimos lo mismo, con buen formato y menos lineas, pero sin las columnas justificadas.
//        for (int[] is : matriz5cuatro) {
//            System.out.println(Arrays.toString(is));
//        }

        /**
         * 5. Generar una matriz de 10x10 y hallar e imprimir la suma de cada
         * una de sus filas y de cada una de sus columnas.
         */
        System.out.println("\n----Ejercicio 05----");

        int[][] matriz10diez = new int[10][];
        Arrays.setAll(matriz10diez, i -> rnd.ints(10, 1, 11).toArray());
        System.out.println("Matriz 10x10:");
        for (int[] is : matriz10diez) {
            for (int i : is) {
                System.out.printf("%3d", i);
            }
            System.out.println("");
        }

        int[] sumaFilas = new int[10];

        for (int i = 0; i < matriz10diez.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz10diez[i].length; j++) {
                sumaFila += matriz10diez[i][j];
            }
            sumaFilas[i] = sumaFila;
        }

        int[] sumaColumnas = new int[10];

        for (int j = 0; j < matriz10diez[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz10diez.length; i++) {
                sumaColumna += matriz10diez[i][j];
            }
            sumaColumnas[j] = sumaColumna;
        }

        System.out.println("\nLa suma de cada fila es: " + Arrays.toString(sumaFilas));
        System.out.println("\nLa suma de cada columna es: " + Arrays.toString(sumaColumnas));

        /**
         * 6. Generar una matriz de 5x5 (numérica entera) e imprimir el valor
         * más grande y el más pequeño y los lugares donde se encuentran (índice
         * i e índice j).
         */
        //PREGUNTAR POR EL CASO DE QUE SE REPITAN EL VALOR MAXIMO O MINIMO
        System.out.println("\n----Ejercicio 06----");

        int[][] matriz5cinco = new int[5][];//creamos la matriz

        Arrays.setAll(matriz5cinco, i -> rnd.ints(5, 1, 11).toArray());//rellenamos ala matriz de numeros enteros aleatorios
        System.out.println("La matriz 5x5 es:\n");//imprimimos la matriz por pantalla
        for (int[] fila : matriz5cinco) {
            for (int col : fila) {
                System.out.printf("%3d", col);;
            }
            System.out.println("");
        }

        int numMax = 0;// podriamos usar Integer.MIN_VALUE en lugar de 0 para asegurar cualquier rango de numeros
        int numMin = 0;// podriamos usar Integer.MAX_VALUE en lugar de 0 para asegurar cualquier rango de numeros
        int[] posMax = new int[2];
        int[] posMin = new int[2];

        for (int i = 0; i < matriz5cinco.length; i++) {
            for (int j = 0; j < matriz5cinco[i].length; j++) {
                if (matriz5cinco[i][j] > numMax) {
                    numMax = matriz5cinco[i][j];
                    posMax[0] = i;
                    posMax[1] = j;

                }
            }
        }

        System.out.println("El numero más grande de la matriz es: " + numMax + " y está en la posición: " + Arrays.toString(posMax));
        System.out.println("El numero más pequeño de la matriz es: " + numMin + " y está en la posición: " + Arrays.toString(posMin));

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
