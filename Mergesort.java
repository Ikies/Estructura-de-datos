/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort;

/**
 *
 * @author sheyla
 */
public class Mergesort {
    public static void main(String[] args) {
        int[] arreglo = new int[30];
        
        for (int i = 0; i < 30; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        mergesort(arreglo);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    public static void mergesort(int[] arreglo) {
        if (arreglo.length <= 1) {
            return;
        }
        int mitad = arreglo.length / 2;
        int[] izquierda = new int[mitad];
        int[] derecha = new int[arreglo.length - mitad];
        System.arraycopy(arreglo, 0, izquierda, 0, mitad);
        System.arraycopy(arreglo, mitad, derecha, 0, arreglo.length - mitad);
        mergesort(izquierda);
        mergesort(derecha);
        merge(izquierda, derecha, arreglo);
    }

    public static void merge(int[] izquierda, int[] derecha, int[] arreglo) {
        int i = 0, j = 0, k = 0;
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                arreglo[k++] = izquierda[i++];
            } else {
                arreglo[k++] = derecha[j++];
            }
        }
        while (i < izquierda.length) {
            arreglo[k++] = izquierda[i++];
        }
        while (j < derecha.length) {
            arreglo[k++] = derecha[j++];
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}