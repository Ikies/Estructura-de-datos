/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burbuja;

/**
 *
 * @author sheyla
 */
public class Burbuja {
    public static void main(String[] args) {
        int[] numeros = new int[30];

        
        for (int i = 0; i < 30; i++) {
            numeros[i] = (int) (Math.random() * 100); 
        }

        System.out.println("Array original:");
        imprimirArray(numeros);

        
        for (int i = 0; i < 29; i++) {
            for (int j = 0; j < 29 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado:");
        imprimirArray(numeros);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}