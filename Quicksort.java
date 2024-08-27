/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

/**
 *
 * @author sheyla
 */
public class Quicksort {
    public static void main(String[] args) {
        int[] arreglo = new int[30];
        for (int i = 0; i < 30; i++) {
            arreglo[i] = (int) (Math.random() * 100); 
        }
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        quicksort(arreglo, 0, arreglo.length - 1);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    public static void quicksort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particionar(arreglo, inicio, fin);
            quicksort(arreglo, inicio, pivote - 1);
            quicksort(arreglo, pivote + 1, fin);
        }
    }

    public static int particionar(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[inicio];
        int i = inicio + 1;
        int j = fin;
        while (i <= j) {
            while (i <= j && arreglo[i] <= pivote) {
                i++;
            }
            while (i <= j && arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
                i++;
                j--;
            }
        }
        arreglo[inicio] = arreglo[j];
        arreglo[j] = pivote;
        return j;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
